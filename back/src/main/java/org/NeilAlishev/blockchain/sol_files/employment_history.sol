pragma solidity ^0.4.16;

import "./Structures.sol";

contract EmploymentHistory {
    address owner;
    // person ids -> person's employment history
    mapping(uint => EmpHistory);
    // organization ids -> list of employees
    mapping(uint => uint[]);


    modifier onlyOwner() {
        if (msg.sender != owner) { throw; }
        _; // Will be replaced with function body
    }

    function EmploymentHistory() {
        owner = msg.sender;
    }
}