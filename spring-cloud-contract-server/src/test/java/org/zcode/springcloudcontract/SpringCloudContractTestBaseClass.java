package org.zcode.springcloudcontract;

import io.restassured.module.mockmvc.RestAssuredMockMvc;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.codehaus.groovy.runtime.InvokerHelper.asList;
import static org.mockito.Mockito.when;

@ExtendWith(SpringExtension.class)
@SpringBootTest(classes = EmployeeController.class)
public abstract class SpringCloudContractTestBaseClass {

    @MockBean
    EmployeeService employeeService;

    @Autowired
    EmployeeController employeeController;


    @BeforeEach
    public void init() {
        when(employeeService.getAllEmployees()).thenReturn(asList(Employee.builder().lastName("Khan").firstName("Faisal").id("faskan").build()));
        RestAssuredMockMvc.standaloneSetup(employeeController);
    }
}
