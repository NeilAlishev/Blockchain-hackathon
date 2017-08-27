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
    private static final String BINARY = "6060604052341561000f57600080fd5b5b60008054600160a060020a03191633600160a060020a03161790555b5b61067a8061003c6000396000f300606060405236156100805763ffffffff7c01000000000000000000000000000000000000000000000000000000006000350416631d96f3fb81146100855780635c21f004146100ef5780638c9cc9da14610117578063a6d2ba1e14610142578063aa2237b71461016a578063b52956cb146101b5578063ecda5645146101d3575b600080fd5b341561009057600080fd5b61009b60043561021e565b60405160208082528190810183818151815260200191508051906020019060200280838360005b838110156100db5780820151818401525b6020016100c2565b505050509050019250505060405180910390f35b34156100fa57600080fd5b610105600435610290565b60405190815260200160405180910390f35b341561012257600080fd5b6101056004356024356102a5565b60405190815260200160405180910390f35b341561014d57600080fd5b6101056004356102d7565b60405190815260200160405180910390f35b341561017557600080fd5b61018360043560243561035b565b6040518084815260200183815260200182600281111561019f57fe5b60ff168152602001935050505060405180910390f35b34156101c057600080fd5b6101d16004356024356044356103a1565b005b34156101de57600080fd5b610183600435602435610512565b6040518084815260200183815260200182600281111561019f57fe5b60ff168152602001935050505060405180910390f35b6102266105ab565b6002600083815260200190815260200160002080548060200260200160405190810160405280929190818152602001828054801561028357602002820191906000526020600020905b81548152602001906001019080831161026f575b505050505090505b919050565b6000818152600160205260409020545b919050565b6002602052816000526040600020818154811015156102c057fe5b906000526020600020900160005b91509150505481565b600081815260016020526040812054819015156102f8576000199150610354565b60008381526001602052604090208054600019810190811061031657fe5b906000526020600020906003020160005b50905060005b60028083015460ff169081111561034057fe5b1461034f576000199150610354565b805491505b5b50919050565b60016020528160005260406000208181548110151561037657fe5b906000526020600020906003020160005b508054600182015460029092015490935090915060ff1683565b600060025b8211156103b257600080fd5b60008481526001602052604090205415156103da5760005b82146103d557600080fd5b610469565b6000848152600160205260409020805460001981019081106103f857fe5b906000526020600020906003020160005b50905060005b82141561043b5760005b60028083015460ff169081111561042c57fe5b116103d557600080fd5b610469565b60005b60028083015460ff169081111561045157fe5b14801561045e5750805483145b151561046957600080fd5b5b5b600084815260016020819052604090912080549091810161048c83826105bd565b916000526020600020906003020160005b6060604051908101604052808781526020014281526020018660028111156104c157fe5b60028111156104cc57fe5b9052919050815181556020820151816001015560408201518160020160006101000a81548160ff0219169083600281111561050357fe5b02179055505050505b50505050565b600080600061051f6105ef565b600086815260016020526040902080548690811061053957fe5b906000526020600020906003020160005b506060604051908101604090815282548252600183015460208301526002808401549293929184019160ff169081111561058057fe5b600281111561058b57fe5b90525090508051816020015182604001519350935093505b509250925092565b60206040519081016040526000815290565b8154818355818115116105e9576003028160030283600052602060002091820191016105e9919061061b565b5b505050565b60606040519081016040528060008152602001600081526020016000600281111561061657fe5b905290565b61064b91905b80821115610647576000808255600182015560028101805460ff19169055600301610621565b5090565b905600a165627a7a7230582023931fbcacc12eea83d39160ea16999f8a98137619f08341f330187f08cbe3110029";

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
