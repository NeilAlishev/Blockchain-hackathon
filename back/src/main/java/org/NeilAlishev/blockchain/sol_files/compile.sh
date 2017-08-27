#!/usr/bin/env bash

main() {
    compile_sol="solc $1.sol --bin --abi --optimize --overwrite -o build/"
    eval $compile_sol

    generate_java="web3j solidity generate build/$1.bin build/$1.abi -p org.NeilAlishev.blockchain.wrapper_files -o /Users/aleksandrpliskin/Desktop/blockchain-hack/back/src/main/java"
    eval $generate_java
}

main $1