package org.NeilAlishev.blockchain.wrapper_files;

import org.web3j.abi.TypeReference;
import org.web3j.abi.datatypes.DynamicArray;
import org.web3j.abi.datatypes.Function;
import org.web3j.abi.datatypes.Type;
import org.web3j.abi.datatypes.generated.Int256;
import org.web3j.abi.datatypes.generated.Uint256;
import org.web3j.abi.datatypes.generated.Uint8;
import org.web3j.crypto.Credentials;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.methods.response.TransactionReceipt;
import org.web3j.tx.Contract;
import org.web3j.tx.TransactionManager;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Future;

/**
 * Auto generated code.<br>
 * <strong>Do not modify!</strong><br>
 * Please use the <a href="https://docs.web3j.io/command_line.html">web3j command line tools</a>, or {@link org.web3j.codegen.SolidityFunctionWrapperGenerator} to update.
 *
 * <p>Generated with web3j version 2.3.0.
 */
public final class EmploymentHistory extends Contract {
    private static final String BINARY = "6060604052341561000f57600080fd5b5b60008054600160a060020a03191633600160a060020a03161790555b5b6108f28061003c6000396000f300606060405236156100805763ffffffff7c01000000000000000000000000000000000000000000000000000000006000350416631d96f3fb81146100855780633ec9e3b0146100ef578063725cf6af146101595780638c9cc9da146101a4578063a6d2ba1e146101cf578063aa2237b7146101f7578063b52956cb14610242575b600080fd5b341561009057600080fd5b61009b600435610260565b60405160208082528190810183818151815260200191508051906020019060200280838360005b838110156100db5780820151818401525b6020016100c2565b505050509050019250505060405180910390f35b34156100fa57600080fd5b61009b6004356102d2565b60405160208082528190810183818151815260200191508051906020019060200280838360005b838110156100db5780820151818401525b6020016100c2565b505050509050019250505060405180910390f35b341561016457600080fd5b610172600435602435610402565b6040518084815260200183815260200182600281111561018e57fe5b60ff168152602001935050505060405180910390f35b34156101af57600080fd5b6101bd60043560243561049b565b60405190815260200160405180910390f35b34156101da57600080fd5b6101bd6004356104cd565b60405190815260200160405180910390f35b341561020257600080fd5b610172600435602435610599565b6040518084815260200183815260200182600281111561018e57fe5b60ff168152602001935050505060405180910390f35b341561024d57600080fd5b61025e6004356024356044356105df565b005b6102686107c6565b600260008381526020019081526020016000208054806020026020016040519081016040528092919081815260200182805480156102c557602002820191906000526020600020905b8154815260200190600101908083116102b1575b505050505090505b919050565b6102da6107c6565b6102e26107c6565b6102ea6107c6565b60006001600086815260200190815260200160002080548060200260200160405190810160405281815291906000602084015b82821015610389576000848152602081206003840201905b506060604051908101604090815282548252600183015460208301526002808401549293929184019160ff169081111561036b57fe5b600281111561037657fe5b815250508152602001906001019061031d565b505050509250825160405180591061039e5750595b908082528060200260200182016040525b509150600090505b82518110156103f6578281815181106103cc57fe5b90602001906020020151518282815181106103e357fe5b602090810290910101525b6001016103b7565b8193505b505050919050565b600080600061040f6107ea565b600086815260016020526040902080548690811061042957fe5b906000526020600020906003020160005b506060604051908101604090815282548252600183015460208301526002808401549293929184019160ff169081111561047057fe5b600281111561047b57fe5b90525090508051816020015182604001519350935093505b509250925092565b6002602052816000526040600020818154811015156104b657fe5b906000526020600020900160005b91509150505481565b60006104d76107ea565b60008381526001602052604090205415156104f6576000199150610592565b60008381526001602052604090208054600019810190811061051457fe5b906000526020600020906003020160005b506060604051908101604090815282548252600183015460208301526002808401549293929184019160ff169081111561055b57fe5b600281111561056657fe5b905250905060005b8160400151600281111561057e57fe5b1461058d576000199150610592565b805191505b5b50919050565b6001602052816000526040600020818154811015156105b457fe5b906000526020600020906003020160005b508054600182015460029092015490935090915060ff1683565b6105e76107ea565b60025b8211156105f657600080fd5b600084815260016020526040902054151561061e5760005b821461061957600080fd5b6106ea565b60008481526001602052604090208054600019810190811061063c57fe5b906000526020600020906003020160005b506060604051908101604090815282548252600183015460208301526002808401549293929184019160ff169081111561068357fe5b600281111561068e57fe5b905250905060005b8214156106bf5760005b816040015160028111156106b057fe5b1161061957600080fd5b6106ea565b60005b816040015160028111156106d257fe5b1480156106df5750828151145b15156106ea57600080fd5b5b5b600084815260016020819052604090912080549091810161070d8382610816565b916000526020600020906003020160005b60606040519081016040528087815260200142815260200186600281111561074257fe5b600281111561074d57fe5b9052919050815181556020820151816001015560408201518160020160006101000a81548160ff0219169083600281111561078457fe5b0217905550505060008481526002602052604090208054909150600181016107ac8382610848565b916000526020600020900160005b50859055505b50505050565b60206040519081016040526000815290565b60206040519081016040526000815290565b60606040519081016040528060008152602001600081526020016000600281111561081157fe5b905290565b815481835581811511610842576003028160030283600052602060002091820191016108429190610872565b5b505050565b815481835581811511610842576000838152602090206108429181019083016108a5565b5b505050565b6108a291905b8082111561089e576000808255600182015560028101805460ff19169055600301610878565b5090565b90565b6108a291905b8082111561089e57600081556001016108ab565b5090565b905600a165627a7a723058205675d626aa2aa0d5672a89e7bb5940b7346aa67aaa50f8df146eb6d8f30261dc0029";

    private EmploymentHistory(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    private EmploymentHistory(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    public Future<DynamicArray<Uint256>> getOrganisationEmployees(Uint256 organizationId) {
        Function function = new Function("getOrganisationEmployees", 
                Arrays.<Type>asList(organizationId), 
                Arrays.<TypeReference<?>>asList(new TypeReference<DynamicArray<Uint256>>() {}));
        return executeCallSingleValueReturnAsync(function);
    }

    public Future<DynamicArray<Uint256>> getEmploymentHistory(Uint256 personId) {
        Function function = new Function("getEmploymentHistory", 
                Arrays.<Type>asList(personId), 
                Arrays.<TypeReference<?>>asList(new TypeReference<DynamicArray<Uint256>>() {}));
        return executeCallSingleValueReturnAsync(function);
    }

    public Future<List<Type>> getEmploymentRecord(Uint256 personId, Uint256 recordId) {
        Function function = new Function("getEmploymentRecord", 
                Arrays.<Type>asList(personId, recordId), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}, new TypeReference<Uint256>() {}, new TypeReference<Uint8>() {}));
        return executeCallMultipleValueReturnAsync(function);
    }

    public Future<Uint256> employeesOf(Uint256 param0, Uint256 param1) {
        Function function = new Function("employeesOf", 
                Arrays.<Type>asList(param0, param1), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeCallSingleValueReturnAsync(function);
    }

    public Future<Int256> getCurrentEmployment(Uint256 personId) {
        Function function = new Function("getCurrentEmployment", 
                Arrays.<Type>asList(personId), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Int256>() {}));
        return executeCallSingleValueReturnAsync(function);
    }

    public Future<List<Type>> empRecordOf(Uint256 param0, Uint256 param1) {
        Function function = new Function("empRecordOf", 
                Arrays.<Type>asList(param0, param1), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}, new TypeReference<Uint256>() {}, new TypeReference<Uint8>() {}));
        return executeCallMultipleValueReturnAsync(function);
    }

    public Future<TransactionReceipt> addEmpRecord(Uint256 personId, Uint256 organizationId, Uint256 status) {
        Function function = new Function("addEmpRecord", Arrays.<Type>asList(personId, organizationId, status), Collections.<TypeReference<?>>emptyList());
        return executeTransactionAsync(function);
    }

    public static Future<EmploymentHistory> deploy(Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit, BigInteger initialWeiValue) {
        return deployAsync(EmploymentHistory.class, web3j, credentials, gasPrice, gasLimit, BINARY, "", initialWeiValue);
    }

    public static Future<EmploymentHistory> deploy(Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit, BigInteger initialWeiValue) {
        return deployAsync(EmploymentHistory.class, web3j, transactionManager, gasPrice, gasLimit, BINARY, "", initialWeiValue);
    }

    public static EmploymentHistory load(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return new EmploymentHistory(contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    public static EmploymentHistory load(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return new EmploymentHistory(contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }
}
