package org.NeilAlishev.blockchain.repository;

import org.NeilAlishev.blockchain.model.Offer;
import org.NeilAlishev.blockchain.model.User;
import org.NeilAlishev.blockchain.model.enums.OfferStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author aleksandrpliskin on 28.08.17.
 */
@Repository
public interface OfferRepository extends JpaRepository<Offer, Long> {
    List<Offer> findByEmployerAndOfferStatus(User employer, OfferStatus offerStatus);
}
