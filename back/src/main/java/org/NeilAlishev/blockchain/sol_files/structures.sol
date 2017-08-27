pragma solidity ^0.4.16;

library Structures {
    enum EmploymentStatus { Active, Resigned, Fired }

    // трудовая книжка
    struct EmpHistory {
        Employment[] employments; // all person's employments
        uint dateCreated;
        // TODO: поля, которые относятся к самой трудовой книжке
    }

    struct Employment {
        uint organizationId;
        uint dateFrom; // date when person entered organization.
        uint dateTo; // date when person left organization.
        EmploymentStatus status; // employment current status
    }
}