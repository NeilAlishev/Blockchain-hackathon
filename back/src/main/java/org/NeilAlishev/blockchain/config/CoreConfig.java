package org.NeilAlishev.blockchain.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.client.RestTemplate;

/**
 * @author NeilAlishev
 */
@Configuration
@EnableScheduling
@ComponentScan(basePackages = {
        "org.NeilAlishev.blockchain.service", "org.NeilAlishev.blockchain.util",
        "org.NeilAlishev.blockchain.task"
})
@PropertySource("classpath:properties/geth.properties")
public class CoreConfig {

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

}
