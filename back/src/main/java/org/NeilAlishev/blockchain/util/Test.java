package org.NeilAlishev.blockchain.util;

import org.NeilAlishev.blockchain.wrapper_files.EmploymentHistory;
import org.web3j.abi.datatypes.generated.Int256;
import org.web3j.abi.datatypes.generated.Uint256;
import org.web3j.crypto.CipherException;
import org.web3j.crypto.Credentials;
import org.web3j.crypto.WalletUtils;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.DefaultBlockParameterName;
import org.web3j.protocol.core.methods.response.EthGetBalance;
import org.web3j.protocol.http.HttpService;
import org.web3j.tx.Contract;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import java.util.Properties;
import java.util.concurrent.ExecutionException;

/**
 * @author Neil Alishev
 *         Just a bunch of test methods.
 */
public class Test {

    private static File walletFile;
    private static String networkUrl;
    private static String password;

    public static void main(String[] args) throws Exception {
        Properties prop = new Properties();
        InputStream input = Test.class.getClassLoader().getResourceAsStream("properties/geth.properties");
        prop.load(input);
        walletFile = new File(prop.getProperty("walletFilePath"));
        networkUrl = prop.getProperty("networkUrl");
        password = prop.getProperty("password");

        Web3j web3j = Web3j.build(new HttpService(networkUrl));
        Credentials credentials = loadCredentials();
//        System.out.println(getAccountBalance(web3j, credentials.getAddress()));
//        System.out.println(getAccountBalance(web3j, secondAddress));
//        String contractAddress = deployTestContract(web3j);

        EmploymentHistory contract = loadEmploymentHistory(web3j,
                "0xe7d0faa2aad267126312ee9fd03a4817668159ff");

        Int256 employmentCount = contract.getCurrentEmployment(new Uint256(1)).get();
        System.out.println(employmentCount.getValue());
    }

    private static Credentials loadCredentials() throws IOException, CipherException {
        Credentials credentials = WalletUtils.loadCredentials(password, walletFile);
        System.out.printf("Account Address: %s\n", credentials.getAddress());
        System.out.printf("Public Key: %s\n", credentials.getEcKeyPair().getPublicKey().toString(16));
        System.out.printf("Private Key: %s\n", credentials.getEcKeyPair().getPrivateKey().toString(16));
        return credentials;
    }

    private static BigInteger getAccountBalance(Web3j web3j, String address) throws ExecutionException, InterruptedException {
        EthGetBalance ethGetBalance = web3j
                .ethGetBalance(address, DefaultBlockParameterName.LATEST)
                .sendAsync()
                .get();

        return ethGetBalance.getBalance();
    }

    private static EmploymentHistory loadEmploymentHistory(Web3j web3j, String contractAddress)
            throws IOException, CipherException, ExecutionException, InterruptedException {
        Credentials credentials = WalletUtils.loadCredentials(password,
                walletFile);

        return EmploymentHistory.load(contractAddress, web3j, credentials, Contract.GAS_PRICE, Contract.GAS_LIMIT);
    }
}
