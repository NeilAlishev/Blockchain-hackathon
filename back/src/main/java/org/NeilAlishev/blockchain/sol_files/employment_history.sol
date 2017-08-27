pragma solidity ^0.4.16;

contract EmploymentHistory {

    address owner;
    // person ids -> person's employment history
    mapping (uint => EmpRecord[]) public peopleToEmpRecords;
    // organization ids -> list of employees
    mapping (uint => uint[]) public organizationsToPeople;

    enum EmploymentStatus { In, Out, Fired }

    struct EmpRecord {
        uint organizationId;
        uint dateCreated;
        EmploymentStatus status;
    }

    modifier onlyOwner() {
        if (msg.sender != owner) {throw;}
        _;
        // Will be replaced with function body
    }

    function EmploymentHistory() {
        owner = msg.sender;
    }

    function actOnPerson(uint personId, uint organizationId, uint status) {
        require(uint(EmploymentStatus.Fired) >= status);

        peopleToEmpRecords[personId].push(EmpRecord({
            organizationId: organizationId,
            dateCreated: now,
            status: EmploymentStatus(status)
        }));
    }

    // returns -1 if person is unemployed
    function getCurrentEmployment(uint personId) constant returns (int) {
        EmpRecord storage lastRecord = peopleToEmpRecords[personId][peopleToEmpRecords[personId].length - 1];

        if(lastRecord.status != EmploymentStatus.In) {
            return -1;
        } else {
            return lastRecord.organizationId;
        }
    }

    function getEmploymentCount(uint personId) constant returns (uint) {
        return peopleToEmpRecords[personId].length;
    }

    function getEmploymentHistoryRecordsLength(uint personId) constant returns (uint) {
        return peopleToEmpRecords[personId].length;
    }

    function getEmploymentHistory(uint personId, uint recordId) constant returns (uint, uint, EmploymentStatus) {
        EmpRecord storage record = peopleToEmpRecords[personId][recordId];
        return (record.organizationId, record.dateCreated, record.status);
    }

    function getOrganisationEmployees(uint organizationId) constant returns (uint[]) {
        return organizationsToPeople[organizationId];
    }

}
