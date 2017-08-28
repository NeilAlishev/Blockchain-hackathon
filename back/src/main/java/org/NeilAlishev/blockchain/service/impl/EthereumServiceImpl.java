package org.NeilAlishev.blockchain.service.impl;

import org.NeilAlishev.blockchain.dto.EmploymentRecord;
import org.NeilAlishev.blockchain.dto.enums.Status;
import org.NeilAlishev.blockchain.model.User;
import org.NeilAlishev.blockchain.repository.UserRepository;
import org.NeilAlishev.blockchain.service.EthereumService;
import org.NeilAlishev.blockchain.wrapper_files.EmploymentHistory;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;
import org.web3j.abi.datatypes.NumericType;
import org.web3j.abi.datatypes.generated.Uint256;
import org.web3j.crypto.Credentials;
import org.web3j.crypto.WalletUtils;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.http.HttpService;
import org.web3j.tx.Contract;

import java.math.BigInteger;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Aidar Shaifutdinov.
 */
@Service
public class EthereumServiceImpl implements EthereumService {

    private final UserRepository userRepository;

    private final EmploymentHistory contract;

    public EthereumServiceImpl(Environment env, UserRepository userRepository) throws Exception {
        this.userRepository = userRepository;
        final String walletFile = env.getProperty("walletFilePath");
        final String networkUrl = env.getProperty("networkUrl");
        final String password = env.getProperty("password");
        final String contractAddress = env.getProperty("contractAddress");

        Web3j web3j = Web3j.build(new HttpService(networkUrl));
        Credentials credentials = WalletUtils.loadCredentials(password, walletFile);
        contract = EmploymentHistory.load(
                contractAddress, web3j, credentials, Contract.GAS_PRICE, Contract.GAS_LIMIT);
    }

    @Override
    public void addEmpRecord(int personId, int orgId, Status status) {
        contract.addEmpRecord(of(personId), of(orgId), of(status.ordinal()));
    }

    @Override
    public User getCurrentEmployment(int personId) throws Exception {
        Long id = contract.getCurrentEmployment(of(1)).get().getValue().longValue();
        return userRepository.findOne(id);
    }

    @Override
    public List<User> getEmploymentHistory(int personId) throws Exception {
        return contract.getEmploymentHistory(of(1)).get().getValue()
                .stream().map(NumericType::getValue).map(BigInteger::longValue)
                .map(userRepository::findOne).collect(Collectors.toList());
    }

    @Override
    public EmploymentRecord getEmploymentRecord(int personId, int recordId) throws Exception {
        List<Long> params = contract.getEmploymentRecord(of(1), of(1)).get()
                .stream().map(type -> (BigInteger) type.getValue())
                .map(BigInteger::longValue).collect(Collectors.toList());
        EmploymentRecord record = new EmploymentRecord();
        record.setUser(userRepository.findOne(params.get(0)));
        record.setDate(new Date(params.get(1)));
        record.setStatus(Status.of(params.get(2).intValue()));
        return record;
    }

    @Override
    public List<User> getOrganisationEmployees(int orgId) throws Exception {
        return contract.getOrganisationEmployees(of(2)).get().getValue()
                .stream().map(NumericType::getValue).map(BigInteger::longValue)
                .map(userRepository::findOne).collect(Collectors.toList());
    }

    private Uint256 of(int value) {
        return new Uint256(value);
    }

}
