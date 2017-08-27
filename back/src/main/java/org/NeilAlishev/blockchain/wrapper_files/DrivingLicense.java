package org.NeilAlishev.blockchain.wrapper_files;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Future;
import org.web3j.abi.TypeReference;
import org.web3j.abi.datatypes.Address;
import org.web3j.abi.datatypes.Bool;
import org.web3j.abi.datatypes.Function;
import org.web3j.abi.datatypes.Type;
import org.web3j.abi.datatypes.Utf8String;
import org.web3j.abi.datatypes.generated.Uint256;
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
public final class DrivingLicense extends Contract {
    private static final String BINARY = "60606040525b60008054600160a060020a03191633600160a060020a03161790555b5b6108fa806100316000396000f300606060405236156100965763ffffffff7c010000000000000000000000000000000000000000000000000000000060003504166329cd00f7811461009b578063416f33f4146100fc5780637270787c146101935780638da5cb5b146101b4578063bb586455146101e3578063d6062e44146101f8578063ea51f37c146102c8578063f2fde38b146103fb578063fc58a1961461041c575b600080fd5b34156100a657600080fd5b6100fa60048035600160a060020a03169060446024803590810190830135806020601f8201819004810201604051908101604052818152929190602084018383808284375094965061043d95505050505050565b005b341561010757600080fd5b6100fa60046024813581810190830135806020601f8201819004810201604051908101604052818152929190602084018383808284378201915050505050509190803590602001908201803590602001908080601f016020809104026020016040519081016040528181529291906020840183838082843750949650509335935061056792505050565b005b341561019e57600080fd5b6100fa600160a060020a0360043516610624565b005b34156101bf57600080fd5b6101c76106cf565b604051600160a060020a03909116815260200160405180910390f35b34156101ee57600080fd5b6100fa6106de565b005b341561020357600080fd5b610217600160a060020a0360043516610709565b6040518681526020810186905260408101859052821515608082015281151560a082015260c0606082018181528554600260001961010060018416150201909116049183018290529060e0830190869080156102b45780601f10610289576101008083540402835291602001916102b4565b820191906000526020600020905b81548152906001019060200180831161029757829003601f168201915b505097505050505050505060405180910390f35b34156102d357600080fd5b6102e7600160a060020a0360043516610744565b60405160408101839052811515606082015260808082528554600260001961010060018416150201909116049082018190528190602082019060a0830190889080156103745780601f1061034957610100808354040283529160200191610374565b820191906000526020600020905b81548152906001019060200180831161035757829003601f168201915b50508381038252865460026000196101006001841615020190911604808252602090910190879080156103e85780601f106103bd576101008083540402835291602001916103e8565b820191906000526020600020905b8154815290600101906020018083116103cb57829003601f168201915b5050965050505050505060405180910390f35b341561040657600080fd5b6100fa600160a060020a036004351661076a565b005b341561042757600080fd5b6100fa600160a060020a03600435166107b2565b005b60005433600160a060020a0390811691161461045857600080fd5b600160a060020a03821660009081526001602052604090206003015460ff1680156104a45750600160a060020a038216600090815260026020526040902060040154610100900460ff16155b15156104af57600080fd5b60c06040519081016040908152428252600060208084018290528284018290526060840185905260808401829052600160a0850152600160a060020a0386168252600290522081518155602082015181600101556040820151816002015560608201518160030190805161052792916020019061082e565b50608082015160048201805460ff191691151591909117905560a0820151600490910180549115156101000261ff0019909216919091179055505b5b5050565b600160a060020a03331660009081526001602052604090206003015460ff161561059057600080fd5b608060405190810160409081528482526020808301859052818301849052600160608401819052600160a060020a03331660009081529152208151819080516105dd92916020019061082e565b506020820151816001019080516105f892916020019061082e565b50604082015181600201556060820151600391909101805460ff1916911515919091179055505b505050565b6000805433600160a060020a0390811691161461064057600080fd5b600160a060020a038216600090815260026020526040902060040154610100900460ff16801561068c5750600160a060020a03821660009081526002602052604090206004015460ff16155b151561069757600080fd5b50600160a060020a03811660009081526002602052604090204260018083019190915560048201805460ff191690911790555b5b5050565b600054600160a060020a031681565b6000805473ffffffffffffffffffffffffffffffffffffffff191633600160a060020a03161790555b565b600260208190526000918252604090912080546001820154928201546004830154919392909160039091019060ff8082169161010090041686565b600160208190526000918252604090912060028101546003820154919283019160ff1684565b60005433600160a060020a0390811691161461078557600080fd5b6000805473ffffffffffffffffffffffffffffffffffffffff1916600160a060020a0383161790555b5b50565b6000805433600160a060020a039081169116146107ce57600080fd5b600160a060020a03821660009081526002602052604090206004015460ff1615156107f857600080fd5b50600160a060020a0381166000908152600260208190526040909120429181019190915560048101805460ff191690555b5b5050565b828054600181600116156101000203166002900490600052602060002090601f016020900481019282601f1061086f57805160ff191683800117855561089c565b8280016001018555821561089c579182015b8281111561089c578251825591602001919060010190610881565b5b506108a99291506108ad565b5090565b6108cb91905b808211156108a957600081556001016108b3565b5090565b905600a165627a7a72305820f9f7d8a93ba02facf8890df98da6928ad8757132dda638a2a99fbcfd869d0a350029";

    private DrivingLicense(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    private DrivingLicense(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    public Future<TransactionReceipt> approve(Address driverAddr, Utf8String category) {
        Function function = new Function("approve", Arrays.<Type>asList(driverAddr, category), Collections.<TypeReference<?>>emptyList());
        return executeTransactionAsync(function);
    }

    public Future<TransactionReceipt> apply(Utf8String firstName, Utf8String lastName, Uint256 passport) {
        Function function = new Function("apply", Arrays.<Type>asList(firstName, lastName, passport), Collections.<TypeReference<?>>emptyList());
        return executeTransactionAsync(function);
    }

    public Future<TransactionReceipt> freezeLicense(Address driverAddr) {
        Function function = new Function("freezeLicense", Arrays.<Type>asList(driverAddr), Collections.<TypeReference<?>>emptyList());
        return executeTransactionAsync(function);
    }

    public Future<Address> owner() {
        Function function = new Function("owner", 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
        return executeCallSingleValueReturnAsync(function);
    }

    public Future<TransactionReceipt> DrivingLicense() {
        Function function = new Function("DrivingLicense", Arrays.<Type>asList(), Collections.<TypeReference<?>>emptyList());
        return executeTransactionAsync(function);
    }

    public Future<List<Type>> license(Address param0) {
        Function function = new Function("license", 
                Arrays.<Type>asList(param0), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}, new TypeReference<Uint256>() {}, new TypeReference<Uint256>() {}, new TypeReference<Utf8String>() {}, new TypeReference<Bool>() {}, new TypeReference<Bool>() {}));
        return executeCallMultipleValueReturnAsync(function);
    }

    public Future<List<Type>> driver(Address param0) {
        Function function = new Function("driver", 
                Arrays.<Type>asList(param0), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Utf8String>() {}, new TypeReference<Utf8String>() {}, new TypeReference<Uint256>() {}, new TypeReference<Bool>() {}));
        return executeCallMultipleValueReturnAsync(function);
    }

    public Future<TransactionReceipt> transferOwnership(Address newOwner) {
        Function function = new Function("transferOwnership", Arrays.<Type>asList(newOwner), Collections.<TypeReference<?>>emptyList());
        return executeTransactionAsync(function);
    }

    public Future<TransactionReceipt> unfreezeLicense(Address driverAddr) {
        Function function = new Function("unfreezeLicense", Arrays.<Type>asList(driverAddr), Collections.<TypeReference<?>>emptyList());
        return executeTransactionAsync(function);
    }

    public static Future<DrivingLicense> deploy(Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit, BigInteger initialWeiValue) {
        return deployAsync(DrivingLicense.class, web3j, credentials, gasPrice, gasLimit, BINARY, "", initialWeiValue);
    }

    public static Future<DrivingLicense> deploy(Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit, BigInteger initialWeiValue) {
        return deployAsync(DrivingLicense.class, web3j, transactionManager, gasPrice, gasLimit, BINARY, "", initialWeiValue);
    }

    public static DrivingLicense load(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return new DrivingLicense(contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    public static DrivingLicense load(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return new DrivingLicense(contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }
}
