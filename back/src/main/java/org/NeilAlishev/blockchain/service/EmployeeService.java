package org.NeilAlishev.blockchain.service;

import org.NeilAlishev.blockchain.dto.EmploymentRecord;
import org.NeilAlishev.blockchain.model.Offer;

import java.util.List;

/**
 * @author aleksandrpliskin on 28.08.17.
 */
public interface EmployeeService {

    EmploymentRecord getCurrentJob();
    List<EmploymentRecord> getRecords();
    void acceptOffer() throws Exception;
    Offer getOffer();
    void fire() throws Exception;
}
