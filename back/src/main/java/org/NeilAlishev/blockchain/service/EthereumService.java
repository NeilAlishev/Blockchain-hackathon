package org.NeilAlishev.blockchain.service;

import org.NeilAlishev.blockchain.dto.EmploymentRecord;
import org.NeilAlishev.blockchain.dto.enums.Status;

import java.util.List;

/**
 * @author Aidar Shaifutdinov.
 */
public interface EthereumService {

    void addEmpRecord(int personId, int orgId, Status status);

    int getCurrentEmployment(int personId) throws Exception;

    List<Long> getEmploymentHistory(int personId) throws Exception;

    EmploymentRecord getEmploymentRecord(int personId, int recordId) throws Exception;

    List<Long> getOrganisationEmployees(int orgId) throws Exception;

}
