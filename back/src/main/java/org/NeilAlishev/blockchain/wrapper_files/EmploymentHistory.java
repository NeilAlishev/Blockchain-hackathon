package org.NeilAlishev.blockchain.wrapper_files;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Future;
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

/**
 * Auto generated code.<br>
 * <strong>Do not modify!</strong><br>
 * Please use the <a href="https://docs.web3j.io/command_line.html">web3j command line tools</a>, or {@link org.web3j.codegen.SolidityFunctionWrapperGenerator} to update.
 *
 * <p>Generated with web3j version 2.3.0.
 */
public final class EmploymentHistory extends Contract {
    private static final String BINARY = "6060604052341561000f57600080fd5b5b60008054600160a060020a03191633600160a060020a03161790555b5b6105958061003c6000396000f3006060604052361561008b5763ffffffff7c0100000000000000000000000000000000000000000000000000000000600035041663112a646a81146100905780631d96f3fb146100db5780632ef2ce29146101455780638c91993b146101635780639b13c1b614610163578063a6d2ba1e146101b3578063b6cef7c3146101db578063ecda564514610206575b600080fd5b341561009b57600080fd5b6100a9600435602435610251565b604051808481526020018381526020018260028111156100c557fe5b60ff168152602001935050505060405180910390f35b34156100e657600080fd5b6100f1600435610297565b60405160208082528190810183818151815260200191508051906020019060200280838360005b838110156101315780820151818401525b602001610118565b505050509050019250505060405180910390f35b341561015057600080fd5b610161600435602435604435610309565b005b341561016e57600080fd5b6101796004356103be565b60405190815260200160405180910390f35b341561016e57600080fd5b6101796004356103be565b60405190815260200160405180910390f35b34156101be57600080fd5b6101796004356103e8565b60405190815260200160405180910390f35b34156101e657600080fd5b61017960043560243561046c565b60405190815260200160405180910390f35b341561021157600080fd5b6100a960043560243561049e565b604051808481526020018381526020018260028111156100c557fe5b60ff168152602001935050505060405180910390f35b60016020528160005260406000208181548110151561026c57fe5b906000526020600020906003020160005b508054600182015460029092015490935090915060ff1683565b61029f6104f2565b600260008381526020019081526020016000208054806020026020016040519081016040528092919081815260200182805480156102fc57602002820191906000526020600020905b8154815260200190600101908083116102e8575b505050505090505b919050565b8060025b101561031857600080fd5b60008381526001602081905260409091208054909181016103398382610504565b916000526020600020906003020160005b60606040519081016040528086815260200142815260200185600281111561036e57fe5b600281111561037957fe5b9052919050815181556020820151816001015560408201518160020160006101000a81548160ff021916908360028111156103b057fe5b02179055505050505b505050565b6000818152600160205260409020545b919050565b6000818152600160205260409020545b919050565b60008181526001602052604081205481901515610409576000199150610465565b60008381526001602052604090208054600019810190811061042757fe5b906000526020600020906003020160005b50905060005b60028083015460ff169081111561045157fe5b14610460576000199150610465565b805491505b5b50919050565b60026020528160005260406000208181548110151561048757fe5b906000526020600020900160005b91509150505481565b6000828152600160205260408120805482918291829190869081106104bf57fe5b906000526020600020906003020160005b50805460018201546002830154919650945060ff16925090505b509250925092565b60206040519081016040526000815290565b8154818355818115116103b9576003028160030283600052602060002091820191016103b99190610536565b5b505050565b61056691905b80821115610562576000808255600182015560028101805460ff1916905560030161053c565b5090565b905600a165627a7a7230582063684a0e3be27781d3389c5f73d96e62eac4794be54829bfafbbdec64b5573b20029";

    private EmploymentHistory(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    private EmploymentHistory(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    public Future<List<Type>> peopleToEmpRecords(Uint256 param0, Uint256 param1) {
        Function function = new Function("peopleToEmpRecords", 
                Arrays.<Type>asList(param0, param1), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}, new TypeReference<Uint256>() {}, new TypeReference<Uint8>() {}));
        return executeCallMultipleValueReturnAsync(function);
    }

    public Future<DynamicArray<Uint256>> getOrganisationEmployees(Uint256 organizationId) {
        Function function = new Function("getOrganisationEmployees", 
                Arrays.<Type>asList(organizationId), 
                Arrays.<TypeReference<?>>asList(new TypeReference<DynamicArray<Uint256>>() {}));
        return executeCallSingleValueReturnAsync(function);
    }

    public Future<TransactionReceipt> actOnPerson(Uint256 personId, Uint256 organizationId, Uint256 status) {
        Function function = new Function("actOnPerson", Arrays.<Type>asList(personId, organizationId, status), Collections.<TypeReference<?>>emptyList());
        return executeTransactionAsync(function);
    }

    public Future<Uint256> getEmploymentCount(Uint256 personId) {
        Function function = new Function("getEmploymentCount", 
                Arrays.<Type>asList(personId), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeCallSingleValueReturnAsync(function);
    }

    public Future<Uint256> getEmploymentHistoryRecordsLength(Uint256 personId) {
        Function function = new Function("getEmploymentHistoryRecordsLength", 
                Arrays.<Type>asList(personId), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeCallSingleValueReturnAsync(function);
    }

    public Future<Int256> getCurrentEmployment(Uint256 personId) {
        Function function = new Function("getCurrentEmployment", 
                Arrays.<Type>asList(personId), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Int256>() {}));
        return executeCallSingleValueReturnAsync(function);
    }

    public Future<Uint256> organizationsToPeople(Uint256 param0, Uint256 param1) {
        Function function = new Function("organizationsToPeople", 
                Arrays.<Type>asList(param0, param1), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeCallSingleValueReturnAsync(function);
    }

    public Future<List<Type>> getEmploymentHistory(Uint256 personId, Uint256 recordId) {
        Function function = new Function("getEmploymentHistory", 
                Arrays.<Type>asList(personId, recordId), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}, new TypeReference<Uint256>() {}, new TypeReference<Uint8>() {}));
        return executeCallMultipleValueReturnAsync(function);
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
