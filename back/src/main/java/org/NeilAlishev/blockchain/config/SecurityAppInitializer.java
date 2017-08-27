package org.NeilAlishev.blockchain.config;

import org.springframework.core.annotation.Order;
import org.springframework.security.web.context.AbstractSecurityWebApplicationInitializer;

/**
 * @author aleksandrpliskin on 28.08.17.
 */
@Order(2)
public class SecurityAppInitializer extends AbstractSecurityWebApplicationInitializer {
}
