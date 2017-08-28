package org.NeilAlishev.blockchain.service.impl;

import org.NeilAlishev.blockchain.dto.EmploymentRecord;
import org.NeilAlishev.blockchain.dto.enums.Status;
import org.NeilAlishev.blockchain.model.Offer;
import org.NeilAlishev.blockchain.model.User;
import org.NeilAlishev.blockchain.model.enums.OfferStatus;
import org.NeilAlishev.blockchain.repository.OfferRepository;
import org.NeilAlishev.blockchain.service.EmployeeService;
import org.NeilAlishev.blockchain.service.EthereumService;
import org.NeilAlishev.blockchain.util.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author aleksandrpliskin on 28.08.17.
 */
@Service
public class EmployeeServiceImpl implements EmployeeService {

    private final OfferRepository offerRepository;
    private final EthereumService ethereumService;

    @Autowired
    public EmployeeServiceImpl(OfferRepository offerRepository, EthereumService ethereumService) {
        this.offerRepository = offerRepository;
        this.ethereumService = ethereumService;
    }

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
    public void acceptOffer() throws Exception {
        Offer offer = offerRepository.findByEmployeeAndOfferStatus(SecurityUtils.getPrincipal(), OfferStatus.PENDING);
        offer.setOfferStatus(OfferStatus.ACCEPTED);
        ethereumService.addEmpRecord(offer.getEmployee().getId(), offer.getEmployer().getId(), Status.IN);
        offerRepository.save(offer);
    }

    @Override
    public Offer getOffer() {
        return offerRepository.findByEmployeeAndOfferStatus(SecurityUtils.getPrincipal(), OfferStatus.PENDING);
    }

    @Override
    public void fire() throws Exception {
        ethereumService.addEmpRecord(SecurityUtils.getPrincipal().getId(), ethereumService.getCurrentEmployment(SecurityUtils.getPrincipal().getId()).getId(), Status.OUT);
    }
}
