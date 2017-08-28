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
        if (userRepository.findOne(1L) == null) {
            userRepository.save(new User("Иван, Типичный гражданин", "employee", password, Role.EMPLOYEE));
            userRepository.save(new User("Вагиз, управляет работниками", "employer", password, Role.EMPLOYER));
            userRepository.save(new User("Рустам, следит за порядком", "admin", password, Role.ADMIN));
        }
    }

}
