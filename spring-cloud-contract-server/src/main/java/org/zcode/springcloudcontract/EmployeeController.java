package org.zcode.springcloudcontract;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
public class EmployeeController {

    @GetMapping("/")
    public List<Employee> getAllEmployees() {
        return Collections.singletonList(Employee.builder()
                .id("someId")
                .name("someName")
                .build());
    }
}

