package org.NeilAlishev.blockchain.task;

import org.NeilAlishev.blockchain.model.User;
import org.NeilAlishev.blockchain.model.enums.Role;
import org.NeilAlishev.blockchain.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import java.util.HashSet;

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

    @EventListener(ContextRefreshedEvent.class)
    public void initializeDb() {
        String password = passwordEncoder.encode("password");
        // add users
        userRepository.save(new User("Ivan", "employee", password,
                new HashSet<Role>() {{
                    add(Role.EMPLOYEE);
                }}));
        userRepository.save(new User("Vagiz", "employer", password,
                new HashSet<Role>() {{
                    add(Role.EMPLOYER);
                }}));
        userRepository.save(new User("Rustem", "admin", password,
                new HashSet<Role>() {{
                    add(Role.ADMIN);
                }}));
    }

}
