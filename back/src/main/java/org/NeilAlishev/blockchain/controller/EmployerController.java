package org.NeilAlishev.blockchain.controller;

import org.NeilAlishev.blockchain.service.EmployerService;
import org.NeilAlishev.blockchain.util.ApplicationUrls;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author aleksandrpliskin on 28.08.17.
 */
@Controller
public class EmployerController {

    private final EmployerService employerService;

    @Autowired
    public EmployerController(EmployerService employerService) {
        this.employerService = employerService;
    }

    @Secured(value = "ROLE_EMPLOYER")
    @GetMapping(ApplicationUrls.EMPLOYER_BASE_URL)
    public String getProfile(Model model) throws Exception {
        model.addAttribute("employees", employerService.getEmployees());
        return "employer/profile";
    }

    @GetMapping(ApplicationUrls.EMPLOYER_BASE_URL + "/getEmployees")
    public String getEmployerService(@RequestParam(name = "name") String name, Model model) throws Exception {
        model.addAttribute("emps", employerService.getPossibleEmployees(name));
        return "employer/people";
    }
}
