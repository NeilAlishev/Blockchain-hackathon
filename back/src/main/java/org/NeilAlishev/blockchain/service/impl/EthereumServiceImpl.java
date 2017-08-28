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
import java.util.ArrayList;
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
    public void addEmpRecord(long personId, long orgId, Status status) throws Exception {
        contract.addEmpRecord(of(personId), of(orgId), of(status.ordinal())).get();
    }

    @Override
    public User getCurrentEmployment(long personId) throws Exception {
        Long id = contract.getCurrentEmployment(of(personId)).get().getValue().longValue();
        return userRepository.findOne(id);
    }

    @Override
    public List<EmploymentRecord> getEmploymentHistory(long personId) throws Exception {
        List<Long> params = contract.getEmploymentHistory(of(personId)).get().getValue()
                .stream().map(NumericType::getValue)
                .map(BigInteger::longValue).collect(Collectors.toList());
        List<EmploymentRecord> result = new ArrayList<>();
        for (int i = 0; i < params.size(); i += 3) {
            EmploymentRecord record = new EmploymentRecord();
            record.setUser(userRepository.findOne(params.get(i)));
            record.setDate(new Date(params.get(i + 1) * 1000));
            record.setStatus(Status.of(params.get(i + 2).intValue()));
            result.add(record);
        }
        return result;
    }

    @Override
    public List<User> getOrganisationEmployees(long orgId) throws Exception {
        return contract.getOrganisationEmployees(of(orgId)).get().getValue()
                .stream().map(NumericType::getValue).map(BigInteger::longValue)
                .map(userRepository::findOne).collect(Collectors.toList());
    }

    private Uint256 of(long value) {
        return new Uint256(value);
    }

}
