package org.NeilAlishev.blockchain.service;

import org.NeilAlishev.blockchain.wrapper_files.Greeter;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;
import org.web3j.abi.datatypes.Utf8String;
import org.web3j.crypto.Credentials;
import org.web3j.crypto.WalletUtils;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.http.HttpService;
import org.web3j.tx.Contract;

import java.math.BigInteger;

/**
 * @author Aidar Shaifutdinov.
 */
@Component
public class EthereumServiceImpl implements EthereumService {

    private final Web3j web3j;
    private final Credentials credentials;

    public EthereumServiceImpl(Environment env) throws Exception {
        final String walletFile = env.getProperty("walletFilePath");
        final String networkUrl = env.getProperty("networkUrl");
        final String password = env.getProperty("password");

        web3j = Web3j.build(new HttpService(networkUrl));
        credentials = WalletUtils.loadCredentials(password, walletFile);

        // health-check
        System.out.println("Account address: " + credentials.getAddress());
    }

    @Override
    public String deployContract() {
        Greeter contract = null;
        try {
            contract = Greeter.deploy(web3j, credentials, Contract.GAS_PRICE, Contract.GAS_LIMIT, BigInteger.ZERO,
                    new Utf8String("Test contract!!!")).get();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return contract != null ? contract.getContractAddress() : null;
    }

    @Override
    public String callContract(String address) {
        Greeter contract = Greeter.load(
                address, web3j, credentials, Contract.GAS_PRICE, Contract.GAS_LIMIT);

        try {
            return contract.greet().get().getValue();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

}
