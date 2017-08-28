package org.NeilAlishev.blockchain.service;

import org.NeilAlishev.blockchain.dto.EmploymentRecord;
import org.NeilAlishev.blockchain.dto.enums.Status;
import org.NeilAlishev.blockchain.model.User;

import java.util.List;

/**
 * @author Aidar Shaifutdinov.
 */
public interface EthereumService {

    void addEmpRecord(long personId, long orgId, Status status) throws Exception;

    User getCurrentEmployment(long personId) throws Exception;

    List<EmploymentRecord> getEmploymentHistory(long personId) throws Exception;

    List<User> getOrganisationEmployees(long orgId) throws Exception;

}
