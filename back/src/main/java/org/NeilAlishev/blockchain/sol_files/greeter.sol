pragma solidity ^0.4.16;

// just a test contract
contract Mortal {
    address owner;

    function Mortal() {
        owner = msg.sender;
    }

    function kill() {
        if(msg.sender == owner) suicide(owner);
    }
}

contract Greeter is Mortal {
    string greeting;

    function Greeter(string _greeting) public {
        greeting = _greeting;
    }

    // getter
    function greet() constant returns (string) {
        return greeting;
    }
}