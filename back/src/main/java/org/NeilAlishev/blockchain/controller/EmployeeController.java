package org.NeilAlishev.blockchain.controller;

import org.NeilAlishev.blockchain.dto.EmploymentRecord;
import org.NeilAlishev.blockchain.dto.EmploymentRecordView;
import org.NeilAlishev.blockchain.service.EmployeeService;
import org.NeilAlishev.blockchain.service.EthereumService;
import org.NeilAlishev.blockchain.util.ApplicationUrls;
import org.NeilAlishev.blockchain.util.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Neil Alishev
 */
@Controller
public class EmployeeController {

    private final EthereumService ethereumService;
    private final EmployeeService employeeService;

    @Autowired
    public EmployeeController(EthereumService ethereumService, EmployeeService employeeService) {
        this.ethereumService = ethereumService;
        this.employeeService = employeeService;
    }

    @GetMapping(ApplicationUrls.EMPLOYEE_BASE_URL)

    public String getEmployeeHistory(Model model) throws Exception {
        model.addAttribute("records",
                transform(ethereumService.getEmploymentHistory(SecurityUtils.getPrincipal().getId())));
        return "employment_history";
    }

    private List<EmploymentRecordView> transform(List<EmploymentRecord> records) {
        List<EmploymentRecordView> result = new ArrayList<>();

        for (int i = 0; i < records.size(); i += 2) {
            if (i + 1 < records.size()) {
                result.add(new EmploymentRecordView(
                        records.get(i).getDate(), records.get(i + 1).getDate(),
                        records.get(i + 1).getStatus().getMessage(), records.get(i).getUser()));
            } else {
                result.add(new EmploymentRecordView(
                        records.get(i).getDate(), null,
                        records.get(i).getStatus().getMessage(), records.get(i).getUser()));
            }
        }

        return result;
    }

    @GetMapping(ApplicationUrls.EMPLOYEE_BASE_URL + "/acceptOffer")
    public String acceptOffer() throws Exception {
        employeeService.acceptOffer();
        return "redirect:" + ApplicationUrls.EMPLOYEE_BASE_URL;
    }
}
