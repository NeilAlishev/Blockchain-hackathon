pragma solidity ^0.4.15;

contract employmentHistory {

    address owner;
    // person ids -> person's employment history
    mapping (uint => EmpRecord[]) public empRecordOf;
    // organization ids -> list of employees
    mapping (uint => uint[]) public employeesOf;

    enum EmploymentStatus { In, Out, Fired }

    struct EmpRecord {
        uint organizationId;
        uint dateCreated;
        EmploymentStatus status;
    }

    modifier onlyOwner() {
        require(msg.sender == owner);
        _;
    }

    function employmentHistory() {
        owner = msg.sender;
    }

    function addEmpRecord(uint personId, uint organizationId, uint status) {
        require(status <= uint(EmploymentStatus.Fired));
        if (empRecordOf[personId].length == 0) {
            require(status == uint(EmploymentStatus.In));
        } else {
            EmpRecord memory lastRecord = empRecordOf[personId][empRecordOf[personId].length - 1];
            if (status == uint(EmploymentStatus.In)) {
                require(uint(lastRecord.status) > uint(EmploymentStatus.In));
            } else {
                require(uint(lastRecord.status) == uint(EmploymentStatus.In) &&
                        lastRecord.organizationId == organizationId);
            }
        }

        empRecordOf[personId].push(EmpRecord({
            organizationId: organizationId,
            dateCreated: now,
            status: EmploymentStatus(status)
        }));
        employeesOf[organizationId].push(personId);
    }

    // returns -1 if person is unemployed
    function getCurrentEmployment(uint personId) constant returns (int) {
        if (empRecordOf[personId].length == 0) {
            return -1;
        }
        EmpRecord memory lastRecord = empRecordOf[personId][empRecordOf[personId].length - 1];

        if (lastRecord.status != EmploymentStatus.In) {
            return -1;
        } else {
            return int(lastRecord.organizationId);
        }
    }

    function getEmploymentHistory(uint personId) constant returns (uint[]) {
        EmpRecord[] memory records = empRecordOf[personId];
        uint[] memory result = new uint[](records.length);

        for (uint i = 0; i < records.length; i++) {
            result[i] = records[i].organizationId;
        }

        return result;
    }

    function getEmploymentRecord(uint personId, uint recordId) constant returns (uint, uint, EmploymentStatus) {
        EmpRecord memory record = empRecordOf[personId][recordId];
        return (record.organizationId, record.dateCreated, record.status);
    }

    function getOrganisationEmployees(uint organizationId) constant returns (uint[]) {
        return employeesOf[organizationId];
    }

}
