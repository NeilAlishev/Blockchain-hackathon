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
            userRepository.save(new User("Ivan", "employee", password, Role.EMPLOYEE, null, null, null));

            userRepository.save(new User("IT-Park", "employer1", password, Role.EMPLOYER, "Казань", "IT", "Младший python разработчик"));
            userRepository.save(new User("ACI", "employer2", password, Role.EMPLOYER, "Казань", "IT & Banking", "Associate software engineer"));
            userRepository.save(new User("Flatstack", "employer3", password, Role.EMPLOYER, "Казань", "IT", "RoR - разработчик"));
            userRepository.save(new User("ВШ ИТИС", "employer4", password, Role.EMPLOYER, "Казань", "IT & Образование", "Учитель по информатике"));

            userRepository.save(new User("Rustem", "admin", password, Role.ADMIN, null, null, null));
        }
    }

}
