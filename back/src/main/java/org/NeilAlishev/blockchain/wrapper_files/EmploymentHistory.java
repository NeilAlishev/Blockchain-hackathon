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
    private static final String BINARY = "6060604052341561000f57600080fd5b5b60008054600160a060020a03191633600160a060020a03161790555b5b6107168061003c6000396000f300606060405236156100805763ffffffff7c01000000000000000000000000000000000000000000000000000000006000350416631d96f3fb81146100855780633ec9e3b0146100ef5780635c21f004146101595780638c9cc9da14610181578063a6d2ba1e146101ac578063aa2237b7146101d4578063b52956cb1461021f575b600080fd5b341561009057600080fd5b61009b60043561023d565b60405160208082528190810183818151815260200191508051906020019060200280838360005b838110156100db5780820151818401525b6020016100c2565b505050509050019250505060405180910390f35b34156100fa57600080fd5b61009b6004356102af565b60405160208082528190810183818151815260200191508051906020019060200280838360005b838110156100db5780820151818401525b6020016100c2565b505050509050019250505060405180910390f35b341561016457600080fd5b61016f6004356103df565b60405190815260200160405180910390f35b341561018c57600080fd5b61016f6004356024356103f4565b60405190815260200160405180910390f35b34156101b757600080fd5b61016f600435610426565b60405190815260200160405180910390f35b34156101df57600080fd5b6101ed6004356024356104aa565b6040518084815260200183815260200182600281111561020957fe5b60ff168152602001935050505060405180910390f35b341561022a57600080fd5b61023b6004356024356044356104f0565b005b610245610661565b600260008381526020019081526020016000208054806020026020016040519081016040528092919081815260200182805480156102a257602002820191906000526020600020905b81548152602001906001019080831161028e575b505050505090505b919050565b6102b7610661565b6102bf610661565b6102c7610661565b60006001600086815260200190815260200160002080548060200260200160405190810160405281815291906000602084015b82821015610366576000848152602081206003840201905b506060604051908101604090815282548252600183015460208301526002808401549293929184019160ff169081111561034857fe5b600281111561035357fe5b81525050815260200190600101906102fa565b505050509250825160405180591061037b5750595b908082528060200260200182016040525b509150600090505b82518110156103d3578281815181106103a957fe5b90602001906020020151518282815181106103c057fe5b602090810290910101525b600101610394565b8193505b505050919050565b6000818152600160205260409020545b919050565b60026020528160005260406000208181548110151561040f57fe5b906000526020600020900160005b91509150505481565b600081815260016020526040812054819015156104475760001991506104a3565b60008381526001602052604090208054600019810190811061046557fe5b906000526020600020906003020160005b50905060005b60028083015460ff169081111561048f57fe5b1461049e5760001991506104a3565b805491505b5b50919050565b6001602052816000526040600020818154811015156104c557fe5b906000526020600020906003020160005b508054600182015460029092015490935090915060ff1683565b600060025b82111561050157600080fd5b60008481526001602052604090205415156105295760005b821461052457600080fd5b6105b8565b60008481526001602052604090208054600019810190811061054757fe5b906000526020600020906003020160005b50905060005b82141561058a5760005b60028083015460ff169081111561057b57fe5b1161052457600080fd5b6105b8565b60005b60028083015460ff16908111156105a057fe5b1480156105ad5750805483145b15156105b857600080fd5b5b5b60008481526001602081905260409091208054909181016105db8382610685565b916000526020600020906003020160005b60606040519081016040528087815260200142815260200186600281111561061057fe5b600281111561061b57fe5b9052919050815181556020820151816001015560408201518160020160006101000a81548160ff0219169083600281111561065257fe5b02179055505050505b50505050565b60206040519081016040526000815290565b60206040519081016040526000815290565b8154818355818115116106b1576003028160030283600052602060002091820191016106b191906106b7565b5b505050565b6106e791905b808211156106e3576000808255600182015560028101805460ff191690556003016106bd565b5090565b905600a165627a7a723058207a5dfd1508a926212ddd08dbd52576793f5f32d1524b9f102841ba35d025823e0029";

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

    public Future<Uint256> getEmpRecordsCount(Uint256 personId) {
        Function function = new Function("getEmpRecordsCount", 
                Arrays.<Type>asList(personId), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeCallSingleValueReturnAsync(function);
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
