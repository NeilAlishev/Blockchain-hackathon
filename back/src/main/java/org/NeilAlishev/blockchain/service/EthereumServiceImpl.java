package org.NeilAlishev.blockchain.service;

import org.NeilAlishev.blockchain.wrapper_files.EmploymentHistory;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;
import org.web3j.abi.datatypes.generated.Int256;
import org.web3j.abi.datatypes.generated.Uint256;
import org.web3j.crypto.Credentials;
import org.web3j.crypto.WalletUtils;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.http.HttpService;
import org.web3j.tx.Contract;

import java.math.BigInteger;

/**
 * @author Aidar Shaifutdinov.
 */
@Service
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
        EmploymentHistory contract = null;
        try {
            contract = EmploymentHistory.deploy(web3j, credentials, Contract.GAS_PRICE, Contract.GAS_LIMIT, BigInteger.ZERO).get();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return contract != null ? contract.getContractAddress() : null;
    }

    @Override
    public Int256 callContract(String address) {
        EmploymentHistory contract = EmploymentHistory.load(
                address, web3j, credentials, Contract.GAS_PRICE, Contract.GAS_LIMIT);

        try {
            return contract.getCurrentEmployment(new Uint256(1)).get();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

}
