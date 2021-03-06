package org.NeilAlishev.blockchain.service;

import org.NeilAlishev.blockchain.dto.EmploymentRecord;
import org.NeilAlishev.blockchain.model.Offer;
import org.NeilAlishev.blockchain.model.User;

import java.util.List;

/**
 * @author aleksandrpliskin on 28.08.17.
 */
public interface EmployerService {

    List<User> getEmployees() throws Exception;
    List<EmploymentRecord> getEmployeeRecords(Long userId) throws Exception;
    void createOffer(Long userId);
    List<User> getPossibleEmployees(String name) throws Exception;
    List<Offer> getPendingOffers();
    void fire(Long userId) throws Exception;
}
