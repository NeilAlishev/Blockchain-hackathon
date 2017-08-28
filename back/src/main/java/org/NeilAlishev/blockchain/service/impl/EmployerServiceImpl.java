package org.NeilAlishev.blockchain.service.impl;

import org.NeilAlishev.blockchain.dto.EmploymentRecord;
import org.NeilAlishev.blockchain.model.Offer;
import org.NeilAlishev.blockchain.model.User;
import org.NeilAlishev.blockchain.model.enums.OfferStatus;
import org.NeilAlishev.blockchain.repository.OfferRepository;
import org.NeilAlishev.blockchain.repository.UserRepository;
import org.NeilAlishev.blockchain.service.EmployerService;
import org.NeilAlishev.blockchain.service.EthereumService;
import org.NeilAlishev.blockchain.util.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @author aleksandrpliskin on 28.08.17.
 */
@Service
public class EmployerServiceImpl implements EmployerService {

    private final EthereumService ethereumService;
    private final UserRepository userRepository;
    private final OfferRepository offerRepository;

    @Autowired
    public EmployerServiceImpl(EthereumService ethereumService, UserRepository userRepository, OfferRepository offerRepository) {
        this.ethereumService = ethereumService;
        this.userRepository = userRepository;
        this.offerRepository = offerRepository;
    }

    @Override
    public List<User> getEmployees() throws Exception {
        return ethereumService.getOrganisationEmployees((int) SecurityUtils.getPrincipal().getId());
    }

    @Override
    public List<EmploymentRecord> getEmployeeRecords(Long userId) throws Exception {
        List<User> organizationIds = ethereumService.getEmploymentHistory(Math.toIntExact(userId));
        return null;
    }

    @Override
    public void createOffer(Long userId) {
        Offer offer = new Offer();
        offer.setCreationDate(new Date().getTime());
        offer.setEmployer(SecurityUtils.getPrincipal());
        offer.setEmployee(userRepository.findOne(userId));
        offer.setOfferStatus(OfferStatus.PENDING);
        offerRepository.save(offer);
    }
}
