package org.NeilAlishev.blockchain.repository;

import org.NeilAlishev.blockchain.model.Offer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author aleksandrpliskin on 28.08.17.
 */
@Repository
public interface OfferRepository extends JpaRepository<Offer, Long> {



}
