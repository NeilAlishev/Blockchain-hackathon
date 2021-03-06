package org.NeilAlishev.blockchain.controller;

import org.NeilAlishev.blockchain.model.enums.Role;
import org.NeilAlishev.blockchain.util.ApplicationUrls;
import org.NeilAlishev.blockchain.util.SecurityUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author aleksandrpliskin on 28.08.17.
 */
@Controller
public class ProfileController {

    @GetMapping(ApplicationUrls.PROFILE_BASE_URL)
    public String getProfilePage(Model model) {
        Role role = SecurityUtils.getPrincipal().getRole();
        return "redirect:/" + role.name().toLowerCase();

    }

}
