package org.zcode.springcloudcontract;

import io.restassured.module.mockmvc.RestAssuredMockMvc;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest(classes = EmployeeController.class)
public abstract class SpringCloudContractTestBaseClass {

    @Autowired
    EmployeeController employeeController;

    @BeforeEach
    public void init() {
        RestAssuredMockMvc.standaloneSetup(employeeController);
    }
}
