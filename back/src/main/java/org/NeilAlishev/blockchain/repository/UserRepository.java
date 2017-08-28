package org.NeilAlishev.blockchain.repository;

import org.NeilAlishev.blockchain.model.User;
import org.NeilAlishev.blockchain.model.enums.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author aleksandrpliskin on 28.08.17.
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
    List<User> findByNameStartingWithAndRole(String name, Role role);
}
