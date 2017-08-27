package org.NeilAlishev.blockchain.util;

import org.NeilAlishev.blockchain.wrapper_files.Greeter;
import org.web3j.abi.datatypes.Utf8String;
import org.web3j.crypto.CipherException;
import org.web3j.crypto.Credentials;
import org.web3j.crypto.WalletUtils;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.DefaultBlockParameterName;
import org.web3j.protocol.core.methods.response.EthGetBalance;
import org.web3j.protocol.core.methods.response.TransactionReceipt;
import org.web3j.protocol.core.methods.response.Web3ClientVersion;
import org.web3j.protocol.exceptions.TransactionTimeoutException;
import org.web3j.protocol.http.HttpService;
import org.web3j.tx.Contract;
import org.web3j.tx.Transfer;
import org.web3j.utils.Convert;

import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Properties;
import java.util.concurrent.ExecutionException;

/**
 * @author Neil Alishev
 *         Just a bunch of test methods.
 */
public class Test {

    private static String WALLET_FILE_SOURCE;
    private static String firstAddress;
    private static String secondAddress;
    private static String networkUrl;
    private static String walletPassword;

    public static void main(String[] args) throws ExecutionException, InterruptedException, IOException, CipherException, TransactionTimeoutException {

        Properties prop = new Properties();
        InputStream input = Test.class.getClassLoader().getResourceAsStream("properties/geth.properties");
        prop.load(input);
        WALLET_FILE_SOURCE = prop.getProperty("walletFileSource");
        firstAddress = prop.getProperty("firstAddress");
        secondAddress = prop.getProperty("secondAddress");
        networkUrl = prop.getProperty("networkUrl");
        walletPassword = prop.getProperty("walletPassword");

        Web3j web3j = Web3j.build(new HttpService(networkUrl));
        System.out.println(getAccountBalance(web3j, firstAddress));
        System.out.println(getAccountBalance(web3j, secondAddress));
        String contractAddress = deployTestContract(web3j);
        testContractLoading(web3j, contractAddress);
    }


    private static void getClientVersion(Web3j web3j) throws ExecutionException, InterruptedException {
        Web3ClientVersion clientVersion = web3j.web3ClientVersion().sendAsync().get();

        System.out.println("Client version is " + clientVersion.getWeb3ClientVersion());
    }

    private static void sendEther(Web3j web3j, String to) throws IOException, CipherException, InterruptedException, ExecutionException, TransactionTimeoutException {
        Credentials credentials = WalletUtils.loadCredentials("password", WALLET_FILE_SOURCE);

        TransactionReceipt transactionReceipt = Transfer.sendFundsAsync(web3j, credentials,
                secondAddress, BigDecimal.valueOf(0.2), Convert.Unit.ETHER).get();

        System.out.println(transactionReceipt);
    }

    private static String deployTestContract(Web3j web3j) throws IOException, CipherException, ExecutionException, InterruptedException {
        Credentials credentials = WalletUtils.loadCredentials(walletPassword,
                WALLET_FILE_SOURCE);

        Greeter contract = Greeter.deploy(web3j, credentials, Contract.GAS_PRICE, Contract.GAS_LIMIT, BigInteger.ZERO,
                new Utf8String("Test contract!!!")).get();

        Utf8String greeting = contract.greet().get();
        System.out.println(greeting.getValue());

        return contract.getContractAddress();
    }

    private static void testContractLoading(Web3j web3j, String contractAddress) throws IOException, CipherException, ExecutionException, InterruptedException {
        Credentials credentials = WalletUtils.loadCredentials(walletPassword, WALLET_FILE_SOURCE);

        Greeter contract = Greeter.load(contractAddress, web3j, credentials, Contract.GAS_PRICE, Contract.GAS_LIMIT);

        Utf8String greeting = contract.greet().get();
        System.out.println(greeting.getValue());
    }

    private static BigInteger getAccountBalance(Web3j web3j, String address) throws ExecutionException, InterruptedException {
        EthGetBalance ethGetBalance = web3j
                .ethGetBalance(address, DefaultBlockParameterName.LATEST)
                .sendAsync()
                .get();

        return ethGetBalance.getBalance();
    }
}
