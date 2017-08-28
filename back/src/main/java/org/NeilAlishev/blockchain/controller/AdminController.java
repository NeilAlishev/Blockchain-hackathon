package org.NeilAlishev.blockchain.controller;

import org.NeilAlishev.blockchain.service.AdminService;
import org.NeilAlishev.blockchain.util.ApplicationUrls;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author aleksandrpliskin on 28.08.17.
 */
@Controller
public class AdminController {

    private final AdminService adminService;

    @Autowired
    public AdminController(AdminService adminService) {
        this.adminService = adminService;
    }

    @GetMapping(value = ApplicationUrls.ADMIN_BASE_URL)
    public String getProfilePage(Model model) {
        return "admin/profile";
    }
}
