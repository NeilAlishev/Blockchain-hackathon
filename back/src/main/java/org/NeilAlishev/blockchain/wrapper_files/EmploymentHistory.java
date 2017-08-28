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
    private static final String BINARY = "6060604052341561000f57600080fd5b5b60008054600160a060020a03191633600160a060020a03161790555b5b61093a8061003c6000396000f3006060604052361561008b5763ffffffff7c01000000000000000000000000000000000000000000000000000000006000350416631d96f3fb81146100905780633ec9e3b0146100fa5780635c21f00414610164578063725cf6af1461018c5780638c9cc9da146101d7578063a6d2ba1e14610202578063aa2237b71461022a578063b52956cb14610275575b600080fd5b341561009b57600080fd5b6100a6600435610293565b60405160208082528190810183818151815260200191508051906020019060200280838360005b838110156100e65780820151818401525b6020016100cd565b505050509050019250505060405180910390f35b341561010557600080fd5b6100a6600435610305565b60405160208082528190810183818151815260200191508051906020019060200280838360005b838110156100e65780820151818401525b6020016100cd565b505050509050019250505060405180910390f35b341561016f57600080fd5b61017a600435610435565b60405190815260200160405180910390f35b341561019757600080fd5b6101a560043560243561044a565b604051808481526020018381526020018260028111156101c157fe5b60ff168152602001935050505060405180910390f35b34156101e257600080fd5b61017a6004356024356104e3565b60405190815260200160405180910390f35b341561020d57600080fd5b61017a600435610515565b60405190815260200160405180910390f35b341561023557600080fd5b6101a56004356024356105e1565b604051808481526020018381526020018260028111156101c157fe5b60ff168152602001935050505060405180910390f35b341561028057600080fd5b610291600435602435604435610627565b005b61029b61080e565b600260008381526020019081526020016000208054806020026020016040519081016040528092919081815260200182805480156102f857602002820191906000526020600020905b8154815260200190600101908083116102e4575b505050505090505b919050565b61030d61080e565b61031561080e565b61031d61080e565b60006001600086815260200190815260200160002080548060200260200160405190810160405281815291906000602084015b828210156103bc576000848152602081206003840201905b506060604051908101604090815282548252600183015460208301526002808401549293929184019160ff169081111561039e57fe5b60028111156103a957fe5b8152505081526020019060010190610350565b50505050925082516040518059106103d15750595b908082528060200260200182016040525b509150600090505b8251811015610429578281815181106103ff57fe5b906020019060200201515182828151811061041657fe5b602090810290910101525b6001016103ea565b8193505b505050919050565b6000818152600160205260409020545b919050565b6000806000610457610832565b600086815260016020526040902080548690811061047157fe5b906000526020600020906003020160005b506060604051908101604090815282548252600183015460208301526002808401549293929184019160ff16908111156104b857fe5b60028111156104c357fe5b90525090508051816020015182604001519350935093505b509250925092565b6002602052816000526040600020818154811015156104fe57fe5b906000526020600020900160005b91509150505481565b600061051f610832565b600083815260016020526040902054151561053e5760001991506105da565b60008381526001602052604090208054600019810190811061055c57fe5b906000526020600020906003020160005b506060604051908101604090815282548252600183015460208301526002808401549293929184019160ff16908111156105a357fe5b60028111156105ae57fe5b905250905060005b816040015160028111156105c657fe5b146105d55760001991506105da565b805191505b5b50919050565b6001602052816000526040600020818154811015156105fc57fe5b906000526020600020906003020160005b508054600182015460029092015490935090915060ff1683565b61062f610832565b60025b82111561063e57600080fd5b60008481526001602052604090205415156106665760005b821461066157600080fd5b610732565b60008481526001602052604090208054600019810190811061068457fe5b906000526020600020906003020160005b506060604051908101604090815282548252600183015460208301526002808401549293929184019160ff16908111156106cb57fe5b60028111156106d657fe5b905250905060005b8214156107075760005b816040015160028111156106f857fe5b1161066157600080fd5b610732565b60005b8160400151600281111561071a57fe5b1480156107275750828151145b151561073257600080fd5b5b5b6000848152600160208190526040909120805490918101610755838261085e565b916000526020600020906003020160005b60606040519081016040528087815260200142815260200186600281111561078a57fe5b600281111561079557fe5b9052919050815181556020820151816001015560408201518160020160006101000a81548160ff021916908360028111156107cc57fe5b0217905550505060008481526002602052604090208054909150600181016107f48382610890565b916000526020600020900160005b50859055505b50505050565b60206040519081016040526000815290565b60206040519081016040526000815290565b60606040519081016040528060008152602001600081526020016000600281111561085957fe5b905290565b81548183558181151161088a5760030281600302836000526020600020918201910161088a91906108ba565b5b505050565b81548183558181151161088a5760008381526020902061088a9181019083016108ed565b5b505050565b6108ea91905b808211156108e6576000808255600182015560028101805460ff191690556003016108c0565b5090565b90565b6108ea91905b808211156108e657600081556001016108f3565b5090565b905600a165627a7a723058205799ac924d0b9101bc44250950c0e38cf97f7cc53448d1aa8487c1f3cc81ccb30029";

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
