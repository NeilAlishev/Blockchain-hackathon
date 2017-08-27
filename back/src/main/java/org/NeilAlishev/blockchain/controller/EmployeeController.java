package org.NeilAlishev.blockchain.controller;

import org.NeilAlishev.blockchain.service.EmploymentService;
import org.NeilAlishev.blockchain.service.EthereumService;
import org.NeilAlishev.blockchain.util.ApplicationUrls;
import org.NeilAlishev.blockchain.util.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Neil Alishev
 */
@Controller
public class EmployeeController {

    @Autowired
    EmploymentService employmentService;

    @GetMapping(ApplicationUrls.EMPLOYEE_HISTORY_BASE_URL)
    public String getEmployeeHistory(Model model) {
        model.addAttribute("records", employmentService.getEmployeeRecords(SecurityUtils.getPrincipal()));
        return "";
    }
}
