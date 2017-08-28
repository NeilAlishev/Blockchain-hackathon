package org.NeilAlishev.blockchain.repository;

import org.NeilAlishev.blockchain.model.Organization;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author aleksandrpliskin on 28.08.17.
 */
@Repository
public interface OrganizationRepository extends JpaRepository<Organization, Long> {
}
