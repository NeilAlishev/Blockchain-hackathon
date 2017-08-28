package org.NeilAlishev.blockchain.util;

import org.NeilAlishev.blockchain.wrapper_files.EmploymentHistory;
import org.web3j.abi.datatypes.DynamicArray;
import org.web3j.abi.datatypes.NumericType;
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
import java.util.List;
import java.util.Properties;
import java.util.concurrent.ExecutionException;
import java.util.stream.Collectors;

/**
 * @author Neil Alishev
 *         Just a bunch of test methods.
 */
public class Test {

    private static File walletFile;
    private static String password;

    private static EmploymentHistory contract;

    public static void main(String[] args) throws Exception {
        Properties prop = new Properties();
        InputStream input = Test.class.getClassLoader().getResourceAsStream("properties/geth.properties");
        prop.load(input);
        walletFile = new File(prop.getProperty("walletFilePath"));
        String networkUrl = prop.getProperty("networkUrl");
        password = prop.getProperty("password");
        String contractAddress = prop.getProperty("contractAddress");

        Web3j web3j = Web3j.build(new HttpService(networkUrl));

        contract = loadEmploymentHistoryContract(web3j, contractAddress);

//        addEmpRecordTest(contract, new Uint256(1), new Uint256(2), new Uint256(0));
//        addEmpRecordTest(contract, new Uint256(1), new Uint256(2), new Uint256(1));
//        addEmpRecordTest(contract, new Uint256(1), new Uint256(3), new Uint256(0));


//        System.out.println(getEmploymentHistoryTest(contract));
//        getCurrentEmploymentTest(contract);
//        getEmpRecordsCountTest(contract);

    }

    private static void addEmpRecordTest(EmploymentHistory contract, Uint256 personId, Uint256 organizationId,
                                         Uint256 status) throws ExecutionException, InterruptedException {
        contract.addEmpRecord(personId, organizationId, status).get();
    }

    private static void getCurrentEmploymentTest() throws Exception {
        Int256 employmentCount = contract.getCurrentEmployment(new Uint256(1)).get();
        System.out.println(employmentCount.getValue());
    }

    private static List<Long> getEmploymentHistoryTest(EmploymentHistory contract)
            throws ExecutionException, InterruptedException {
        DynamicArray<Uint256> organizationIds = contract.getEmploymentHistory(new Uint256(1)).get();

        return organizationIds
                .getValue()
                .stream().map(NumericType::getValue).map(BigInteger::longValue)
                .collect(Collectors.toList());
    }

//    private static List<Long> getEmploymentRecord(EmploymentHistory contract)
//            throws ExecutionException, InterruptedException {
//        List<Type> employmentRecord = contract.getEmploymentRecord(new Uint256(1), new Uint256(1)).get();
//
//        return employmentRecord
//                .stream()
//                .map(type -> (BigInteger) type.getValue()).map(BigInteger::longValue)
//                .collect(Collectors.toList());
//    }

    private static void getEmployeesTest() throws Exception {
        List<Integer> employees = contract.getOrganisationEmployees(new Uint256(2))
                .get().getValue()
                .stream().map(NumericType::getValue)
                .map(BigInteger::intValue).collect(Collectors.toList());
        System.out.println(employees);
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

    private static EmploymentHistory loadEmploymentHistoryContract(Web3j web3j, String contractAddress)
            throws IOException, CipherException, ExecutionException, InterruptedException {
        Credentials credentials = WalletUtils.loadCredentials(password,
                walletFile);

        return EmploymentHistory.load(contractAddress, web3j, credentials, Contract.GAS_PRICE, Contract.GAS_LIMIT);
    }
}