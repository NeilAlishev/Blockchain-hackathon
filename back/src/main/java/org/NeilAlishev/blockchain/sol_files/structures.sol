pragma solidity ^0.4.16;

library Structures {
    enum EmploymentStatus { In, Out, Fired }

    struct EmpRecord {
        uint organizationId;
        uint dateCreated;
        EmploymentStatus status;
    }
}