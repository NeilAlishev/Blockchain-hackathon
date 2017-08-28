package org.NeilAlishev.blockchain.service.impl;

import org.NeilAlishev.blockchain.dto.EmploymentRecord;
import org.NeilAlishev.blockchain.model.User;
import org.NeilAlishev.blockchain.service.EmployeeService;
import org.NeilAlishev.blockchain.util.SecurityUtils;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author aleksandrpliskin on 28.08.17.
 */
@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Override
    public EmploymentRecord getCurrentJob() {
        User user = SecurityUtils.getPrincipal();
        return null;
    }

    @Override
    public List<EmploymentRecord> getRecords() {
        User user = SecurityUtils.getPrincipal();
        return null;
    }

    @Override
    public void acceptOffer() {

    }
}
