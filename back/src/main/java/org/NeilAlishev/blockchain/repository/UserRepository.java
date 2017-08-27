package org.NeilAlishev.blockchain.repository;

import org.NeilAlishev.blockchain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author aleksandrpliskin on 28.08.17.
 */
public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}
