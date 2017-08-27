package org.NeilAlishev.blockchain.service;

import org.NeilAlishev.blockchain.dto.EmploymentRecord;
import org.NeilAlishev.blockchain.model.User;

import java.util.List;

/**
 * @author aleksandrpliskin on 28.08.17.
 */
public interface EmploymentService {

    EmploymentRecord getEmployeeCurrentJob();

    List<EmploymentRecord> getEmployeeRecords(User user);

}
