pragma solidity ^0.4.15;

contract employmentHistory {

    struct Employee {
    string name;
    string email;
    string position;
    string city;
    }

    struct Org {
    string name;
    string sphere;
    }

    struct Offer {
    address organization;
    bool approved;
    }

    struct EmpRecord {
    address organization;
    uint dateCreated;
    EmploymentStatus status;
    }

    mapping (address => Employee) public employees;
    mapping (address => Org) public orgs;

    // employee address -> employee`s offers
    mapping (address => Offer[]) public offersOf;

    // employee address -> employee's employment history
    mapping (address => EmpRecord[]) public empHistoryOf;

    // organization address -> list of employees
    mapping (address => address[]) public employeesOf;

    enum EmploymentStatus { In, Out, Fired }

    function newEmployee(string name, string email,
    string position, string city) {
        require(sha3(email) != sha3(employees[msg.sender].email));
        employees[msg.sender] = Employee({
        name: name,
        email : email,
        position: position,
        city: city
        });
    }

    function newOrg(string name, string sphere) {
        require(sha3(name) != sha3(orgs[msg.sender].name));
        orgs[msg.sender] = Org({
        name: name,
        sphere: sphere
        });
    }

    function offer(address employee) {
        address[] memory empls = employeesOf[msg.sender];
        for (uint i = 0; i < empls.length; i++) {
            require(empls[i] != employee);
        }
        offersOf[employee].push(Offer({
        organization: msg.sender,
        approved: false
        }));
    }

    function considerOffer(uint offerIdx, bool approve) {
        require(offerIdx < offersOf[msg.sender].length);
        if (approve) {
            address org = offersOf[msg.sender][offerIdx].organization;
            empHistoryOf[msg.sender].push(EmpRecord({
            organization: org,
            dateCreated: now,
            status: EmploymentStatus.In
            }));
            employeesOf[org].push(msg.sender);
        } else {
            delete offersOf[msg.sender][offerIdx];
        }
    }

    // returns -1 if person is unemployed
    function getCurrentEmployer() constant returns (address) {
        if (empHistoryOf[msg.sender].length == 0) {
            return address(0);
        }
        EmpRecord memory lastRecord = empHistoryOf[msg.sender]
        [empHistoryOf[msg.sender].length - 1];

        if (lastRecord.status != EmploymentStatus.In) {
            return address(0);
        } else {
            return lastRecord.organization;
        }
    }

    function getEmploymentHistory() constant returns (uint[]) {
        EmpRecord[] memory records = empHistoryOf[msg.sender];
        uint[] memory result = new uint[](records.length * 3);

        for (uint i = 0; i < records.length; i++) {
            uint index = i * 3;
            //TODO convert address to smth reternable
            result[index] = uint(records[i].organization);
            result[index + 1] = records[i].dateCreated;
            result[index + 2] = uint(records[i].status);
        }

        return result;
    }
}