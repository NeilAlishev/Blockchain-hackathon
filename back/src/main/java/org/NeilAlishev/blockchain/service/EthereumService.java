package org.NeilAlishev.blockchain.service;

import org.NeilAlishev.blockchain.dto.EmploymentRecord;
import org.NeilAlishev.blockchain.dto.enums.Status;
import org.NeilAlishev.blockchain.model.User;

import java.util.List;

/**
 * @author Aidar Shaifutdinov.
 */
public interface EthereumService {

    void addEmpRecord(int personId, int orgId, Status status);

    User getCurrentEmployment(int personId) throws Exception;

    List<User> getEmploymentHistory(int personId) throws Exception;

    EmploymentRecord getEmploymentRecord(int personId, int recordId) throws Exception;

    List<User> getOrganisationEmployees(int orgId) throws Exception;

}
