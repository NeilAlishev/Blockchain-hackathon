package org.NeilAlishev.blockchain.service.impl;

import org.NeilAlishev.blockchain.dto.EmploymentRecord;
import org.NeilAlishev.blockchain.model.User;
import org.NeilAlishev.blockchain.service.EmployerService;

import java.util.List;

/**
 * @author aleksandrpliskin on 28.08.17.
 */
public class EmployerServiceImpl implements EmployerService {

    @Override
    public List<EmploymentRecord> getEmployeeRecords(User user) {
        return null;
    }

    @Override
    public List<EmploymentRecord> getEmployeeRecords(Long userId) {
        return null;
    }

    @Override
    public void createOffer(User user) {

    }
}
