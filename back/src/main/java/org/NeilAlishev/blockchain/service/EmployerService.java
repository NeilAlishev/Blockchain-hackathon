package org.NeilAlishev.blockchain.service;

import org.NeilAlishev.blockchain.dto.EmploymentRecord;
import org.NeilAlishev.blockchain.model.User;

import java.util.List;

/**
 * @author aleksandrpliskin on 28.08.17.
 */
public interface EmployerService {

    List<EmploymentRecord> getEmployeeRecords(User user);
    List<EmploymentRecord> getEmployeeRecords(Long userId);
    void createOffer(User user);

}
