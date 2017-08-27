package org.NeilAlishev.blockchain.util;

import org.NeilAlishev.blockchain.wrapper_files.EmploymentHistory;
import org.web3j.crypto.CipherException;
import org.web3j.crypto.Credentials;
import org.web3j.crypto.WalletUtils;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.http.HttpService;
import org.web3j.tx.Contract;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import java.util.Properties;

/**
 * @author aleksandrpliskin on 27.08.17.
 */
public class DeployContract {

    private static String walletFilePath;
    private static String networkUrl;
    private static String password;

    public static void main(String[] args) throws Exception {

        Properties prop = new Properties();
        InputStream input = DeployContract.class.getClassLoader().getResourceAsStream("properties/geth.properties");
        prop.load(input);
        walletFilePath = prop.getProperty("walletFilePath");
        networkUrl = prop.getProperty("networkUrl");
        password = prop.getProperty("password");

        Web3j web3j = Web3j.build(new HttpService(networkUrl));
        Credentials credentials = loadCredentials();
        System.out.println(deployTestContract(web3j));
    }

    private static Credentials loadCredentials() throws IOException, CipherException {
        final File walletFile = new File(walletFilePath);
        return WalletUtils.loadCredentials(password, walletFile);
    }

    private static String deployTestContract(Web3j web3j) throws Exception {
        Credentials credentials = WalletUtils.loadCredentials(password, walletFilePath);

        EmploymentHistory contract = EmploymentHistory.deploy(web3j, credentials, Contract.GAS_PRICE, Contract.GAS_LIMIT, BigInteger.ZERO).get();

//        Utf8String greeting = contract.greet().get();
//        System.out.println(greeting.getValue());

        return contract.getContractAddress();
    }

}
