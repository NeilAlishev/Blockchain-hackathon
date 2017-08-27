pragma solidity ^0.4.16;

import "./Structures.sol";

// TODO: implement
contract EmploymentHistory {
    address owner;

    modifier onlyOwner() {
        if (msg.sender != owner) { throw; }
        _; // Will be replaced with function body
    }

    function EmploymentHistory() {
        owner = msg.sender;
    }
}