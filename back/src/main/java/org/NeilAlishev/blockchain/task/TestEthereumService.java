package org.NeilAlishev.blockchain.task;

import org.NeilAlishev.blockchain.repository.UserRepository;
import org.NeilAlishev.blockchain.service.EthereumService;
import org.springframework.stereotype.Component;

/**
 * @author Aidar Shaifutdinov.
 */
@Component
public class TestEthereumService {

    private final EthereumService ethereumService;
    private final UserRepository userRepository;

    public TestEthereumService(EthereumService ethereumService, UserRepository userRepository) {
        this.ethereumService = ethereumService;
        this.userRepository = userRepository;
    }

//    @PostConstruct
    public void testEthereumService() throws Exception {
//        User employee = userRepository.findOne(1L);
//
//        User employer1 = userRepository.findOne(2L);
//        User employer2 = userRepository.findOne(3L);
//        User employer3 = userRepository.findOne(4L);
//
//        ethereumService.addEmpRecord(employee.getId(), employer1.getId(), Status.IN);
//        ethereumService.addEmpRecord(employee.getId(), employer1.getId(), Status.OUT);
//
//        ethereumService.addEmpRecord(employee.getId(), employer2.getId(), Status.IN);
//        ethereumService.addEmpRecord(employee.getId(), employer2.getId(), Status.OUT);
//
//        ethereumService.addEmpRecord(employee.getId(), employer3.getId(), Status.IN);
//
//        System.out.println(ethereumService.getCurrentEmployment(employee.getId()));
//        System.out.println(ethereumService.getEmploymentHistory(employee.getId()));
//        System.out.println(ethereumService.getOrganisationEmployees(employer3.getId()));

//        ethereumService.addEmpRecord(employee.getId(), employer.getId(), Status.IN);
//        ethereumService.addEmpRecord(employee.getId(), employer.getId(), Status.OUT);
//        ethereumService.addEmpRecord(employee.getId(), admin.getId(), Status.IN);
    }

}
