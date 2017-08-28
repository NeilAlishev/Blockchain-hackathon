pragma solidity ^0.4.15;

contract employmentHistory {

    // person ids -> person's employment history
    mapping (address => EmpRecord[]) public empRecordOf;
    // organization ids -> list of employees
    mapping (address => address[]) public employeesOf;

    enum EmploymentStatus { In, Out, Fired }

    struct EmpRecord {
        address organization;
        uint dateCreated;
        EmploymentStatus status;
    }

    function offer(address employee) {
        
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
        uint[] storage employeesOfOrg = employeesOf[organizationId];
        if (status == uint(EmploymentStatus.In)) {
            employeesOfOrg.push(personId);
        } else {
            for (uint i = 0; i < employeesOfOrg.length; i++) {
                if (employeesOfOrg[i] == personId) {
                    delete employeesOfOrg[i];
                }
            }
        }
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
        uint[] memory result = new uint[](records.length * 3);

        for (uint i = 0; i < records.length; i++) {
            uint index = i * 3;
            result[index] = records[i].organizationId;
            result[index + 1] = records[i].dateCreated;
            result[index + 2] = uint(records[i].status);
        }

        return result;
    }

    function getOrganisationEmployees(uint organizationId) constant returns (uint[]) {
        return employeesOf[organizationId];
    }
}
