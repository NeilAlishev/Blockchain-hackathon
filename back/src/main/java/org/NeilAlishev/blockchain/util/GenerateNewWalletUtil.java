package org.NeilAlishev.blockchain.util;

import org.web3j.crypto.WalletUtils;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.http.HttpService;

import java.io.File;
import java.io.InputStream;
import java.util.Properties;

/**
 * @author Aidar Shaifutdinov.
 */
public class GenerateNewWalletUtil {

    public static void main(String[] args) throws Exception {
        Properties prop = new Properties();
        InputStream input = Test.class.getClassLoader()
                .getResourceAsStream("properties/geth.properties");
        prop.load(input);
        final String networkUrl = prop.getProperty("networkUrl");
        final String password = prop.getProperty("password");
        Web3j web3j = Web3j.build(new HttpService(networkUrl));
        String walletPath = WalletUtils.generateNewWalletFile(password, new File("/tmp"), true);
        System.out.println("Path to wallet : " + walletPath);
    }

}
