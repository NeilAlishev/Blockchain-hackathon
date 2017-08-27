package org.NeilAlishev.blockchain.service;

import org.web3j.abi.datatypes.generated.Int256;

/**
 * @author Aidar Shaifutdinov.
 */
public interface EthereumService {

    String deployContract();

    Int256 callContract(String address);

}
