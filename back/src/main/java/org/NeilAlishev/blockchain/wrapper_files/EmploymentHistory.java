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
    private static final String BINARY = "6060604052341561000f57600080fd5b5b60008054600160a060020a03191633600160a060020a03161790555b5b6107838061003c6000396000f300606060405236156100805763ffffffff7c01000000000000000000000000000000000000000000000000000000006000350416631d96f3fb81146100855780635c21f004146100ef5780638c9cc9da14610117578063a6d2ba1e14610142578063aa2237b71461016a578063b52956cb146101b5578063ecda5645146101d3575b600080fd5b341561009057600080fd5b61009b60043561021e565b60405160208082528190810183818151815260200191508051906020019060200280838360005b838110156100db5780820151818401525b6020016100c2565b505050509050019250505060405180910390f35b34156100fa57600080fd5b610105600435610290565b60405190815260200160405180910390f35b341561012257600080fd5b6101056004356024356102a5565b60405190815260200160405180910390f35b341561014d57600080fd5b6101056004356102d7565b60405190815260200160405180910390f35b341561017557600080fd5b6101836004356024356103a3565b6040518084815260200183815260200182600281111561019f57fe5b60ff168152602001935050505060405180910390f35b34156101c057600080fd5b6101d16004356024356044356103e9565b005b34156101de57600080fd5b6101836004356024356105d0565b6040518084815260200183815260200182600281111561019f57fe5b60ff168152602001935050505060405180910390f35b610226610669565b6002600083815260200190815260200160002080548060200260200160405190810160405280929190818152602001828054801561028357602002820191906000526020600020905b81548152602001906001019080831161026f575b505050505090505b919050565b6000818152600160205260409020545b919050565b6002602052816000526040600020818154811015156102c057fe5b906000526020600020900160005b91509150505481565b60006102e161067b565b600083815260016020526040902054151561030057600019915061039c565b60008381526001602052604090208054600019810190811061031e57fe5b906000526020600020906003020160005b506060604051908101604090815282548252600183015460208301526002808401549293929184019160ff169081111561036557fe5b600281111561037057fe5b905250905060005b8160400151600281111561038857fe5b1461039757600019915061039c565b805191505b5b50919050565b6001602052816000526040600020818154811015156103be57fe5b906000526020600020906003020160005b508054600182015460029092015490935090915060ff1683565b6103f161067b565b60025b82111561040057600080fd5b60008481526001602052604090205415156104285760005b821461042357600080fd5b6104f4565b60008481526001602052604090208054600019810190811061044657fe5b906000526020600020906003020160005b506060604051908101604090815282548252600183015460208301526002808401549293929184019160ff169081111561048d57fe5b600281111561049857fe5b905250905060005b8214156104c95760005b816040015160028111156104ba57fe5b1161042357600080fd5b6104f4565b60005b816040015160028111156104dc57fe5b1480156104e95750828151145b15156104f457600080fd5b5b5b600084815260016020819052604090912080549091810161051783826106a7565b916000526020600020906003020160005b60606040519081016040528087815260200142815260200186600281111561054c57fe5b600281111561055757fe5b9052919050815181556020820151816001015560408201518160020160006101000a81548160ff0219169083600281111561058e57fe5b0217905550505060008481526002602052604090208054909150600181016105b683826106d9565b916000526020600020900160005b50859055505b50505050565b60008060006105dd61067b565b60008681526001602052604090208054869081106105f757fe5b906000526020600020906003020160005b506060604051908101604090815282548252600183015460208301526002808401549293929184019160ff169081111561063e57fe5b600281111561064957fe5b90525090508051816020015182604001519350935093505b509250925092565b60206040519081016040526000815290565b6060604051908101604052806000815260200160008152602001600060028111156106a257fe5b905290565b8154818355818115116106d3576003028160030283600052602060002091820191016106d39190610703565b5b505050565b8154818355818115116106d3576000838152602090206106d3918101908301610736565b5b505050565b61073391905b8082111561072f576000808255600182015560028101805460ff19169055600301610709565b5090565b90565b61073391905b8082111561072f576000815560010161073c565b5090565b905600a165627a7a72305820c2200ed30b6efafcc73bcf428e2a46cfe5a65eb72be28e526315ea90a613e6e10029";

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
