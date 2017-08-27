package org.NeilAlishev.blockchain.util;

import org.NeilAlishev.blockchain.model.User;
import org.springframework.security.core.context.SecurityContextHolder;

/**
 * @author aleksandrpliskin on 28.08.17.
 */
public class SecurityUtils {

    public static User getPrincipal() {
        return (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
    }

}
