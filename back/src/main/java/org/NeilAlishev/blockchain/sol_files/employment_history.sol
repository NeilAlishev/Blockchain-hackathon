pragma solidity ^0.4.16;

import "./Structures.sol";

contract EmploymentHistory {
    address owner;
    // person ids -> person's employment history
    mapping(uint => EmpRecord[]) public peopleToEmpRecords;
    // organization ids -> list of employees
    mapping(uint => uint[]) public organizationsToPeople;


    modifier onlyOwner() {
        if (msg.sender != owner) { throw; }
        _; // Will be replaced with function body
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

    function getEmploymentCount(uint personId) constant returns (uint) {
        return peopleToEmpRecords[personId].length;
    }

    function getEmploymentHistory(uint personId) constant
            returns (EmpRecord[]) {
    }
}