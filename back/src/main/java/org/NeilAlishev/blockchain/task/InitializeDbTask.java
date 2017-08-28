package org.NeilAlishev.blockchain.task;

import org.NeilAlishev.blockchain.model.User;
import org.NeilAlishev.blockchain.model.enums.Role;
import org.NeilAlishev.blockchain.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * @author Aidar Shaifutdinov.
 */
@Component
public class InitializeDbTask {

    private final UserRepository userRepository;

    private final PasswordEncoder passwordEncoder;

    @Autowired
    public InitializeDbTask(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @PostConstruct
    public void initializeDb() {
        String password = passwordEncoder.encode("password");
        // add users
        userRepository.save(new User("Ivan", "employee", password, Role.EMPLOYEE));
        userRepository.save(new User("Vagiz", "employer", password, Role.EMPLOYER));
        userRepository.save(new User("Rustem", "admin", password, Role.ADMIN));
    }

}
