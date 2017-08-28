package org.NeilAlishev.blockchain.controller;

import org.NeilAlishev.blockchain.service.EmployeeService;
import org.NeilAlishev.blockchain.util.ApplicationUrls;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Neil Alishev
 */
@Controller
public class EmployeeController {

    private final EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping(ApplicationUrls.EMPLOYEE_BASE_URL)
    public String getEmployeeHistory(Model model) {
//        model.addAttribute("records", employeeService.getRecords());
        return "employment_history";
    }
}
