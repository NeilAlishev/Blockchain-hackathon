pragma solidity ^0.4.16;

contract EmploymentHistory {

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

    function EmploymentHistory() {
        owner = msg.sender;
    }

    /* ------- PUBLIC FUNCTIONS ------- */

    function addEmpRecord(uint personId, uint organizationId, uint status) {
        require(status <= uint(EmploymentStatus.Fired));
        EmpRecord memory lastRecord = getLastRecord(personId);
        if (status == uint(EmploymentStatus.In)) {
            require(uint(lastRecord.status) > uint(EmploymentStatus.In));
        } else {
            require(uint(lastRecord.status) == uint(EmploymentStatus.In) &&
                    lastRecord.organizationId == organizationId);
        }

        empRecordOf[personId].push(EmpRecord({
            organizationId: organizationId,
            dateCreated: now,
            status: EmploymentStatus(status)
        }));
    }

    // returns -1 if person is unemployed
    function getCurrentEmployment(uint personId) constant returns (int) {
        EmpRecord memory lastRecord = getLastRecord(personId);

        if (lastRecord.status != EmploymentStatus.In) {
            return -1;
        } else {
            return int(lastRecord.organizationId);
        }
    }

    function getEmpRecordsCount(uint personId) constant returns (uint) {
        return empRecordOf[personId].length;
    }

    function getEmploymentHistory(uint personId, uint recordId) constant returns (uint, uint, EmploymentStatus) {
        EmpRecord memory record = empRecordOf[personId][recordId];
        return (record.organizationId, record.dateCreated, record.status);
    }

    function getOrganisationEmployees(uint organizationId) constant returns (uint[]) {
        return employeesOf[organizationId];
    }

    /* ------- INTERNAL FUNCTIONS ------- */

    function getLastRecord(uint personId) internal returns (EmpRecord) {
        empRecordOf[personId][empRecordOf[personId].length - 1];
    }
}
