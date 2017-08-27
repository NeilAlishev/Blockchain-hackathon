package org.NeilAlishev.blockchain.util;

import org.NeilAlishev.blockchain.wrapper_files.EmploymentHistory;
import org.web3j.abi.datatypes.NumericType;
import org.web3j.abi.datatypes.generated.Int256;
import org.web3j.abi.datatypes.generated.Uint256;
import org.web3j.crypto.Credentials;
import org.web3j.crypto.WalletUtils;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.methods.response.TransactionReceipt;
import org.web3j.protocol.http.HttpService;
import org.web3j.tx.Contract;

import java.io.File;
import java.io.InputStream;
import java.math.BigInteger;
import java.util.List;
import java.util.Properties;
import java.util.stream.Collectors;

/**
 * @author Neil Alishev
 *         Just a bunch of test methods.
 */
public class Test {

    private static File walletFile;
    private static String networkUrl;
    private static String password;
    private static String contractAddress;

    private static EmploymentHistory contract;

    public static void main(String[] args) throws Exception {
        Properties prop = new Properties();
        InputStream input = Test.class.getClassLoader().getResourceAsStream("properties/geth.properties");
        prop.load(input);
        walletFile = new File(prop.getProperty("walletFilePath"));
        networkUrl = prop.getProperty("networkUrl");
        password = prop.getProperty("password");
        contractAddress = prop.getProperty("contractAddress");

        Web3j web3j = Web3j.build(new HttpService(networkUrl));

        contract = loadEmploymentHistory(web3j, contractAddress);

        addEmpRecordTest();
        getCurrentEmploymentTest();
        getEmpRecordsCountTest();
        getEmployees();
    }

    private static EmploymentHistory loadEmploymentHistory(Web3j web3j, String contractAddress)
            throws Exception {
        Credentials credentials = WalletUtils.loadCredentials(password, walletFile);

        return EmploymentHistory.load(contractAddress, web3j, credentials, Contract.GAS_PRICE, Contract.GAS_LIMIT);
    }

    private static void addEmpRecordTest() throws Exception {
        TransactionReceipt transactionReceipt = contract
                .addEmpRecord(new Uint256(1), new Uint256(2), new Uint256(0)).get();

        System.out.println(transactionReceipt);
        transactionReceipt = contract
                .addEmpRecord(new Uint256(2), new Uint256(2), new Uint256(0)).get();

        System.out.println(transactionReceipt);
    }

    private static void getCurrentEmploymentTest() throws Exception {
        Int256 employmentCount = contract.getCurrentEmployment(new Uint256(1)).get();
        System.out.println(employmentCount.getValue());
    }

    private static void getEmpRecordsCountTest() throws Exception {
        Uint256 empRecordsCount = contract.getEmpRecordsCount(new Uint256(1)).get();
        System.out.println(empRecordsCount.getValue());
    }

    private static void getEmployees() throws Exception {
        List<Integer> employees = contract.getOrganisationEmployees(new Uint256(2))
                .get().getValue()
                .stream().map(NumericType::getValue)
                .map(BigInteger::intValue).collect(Collectors.toList());
        System.out.println(employees);
    }
}
