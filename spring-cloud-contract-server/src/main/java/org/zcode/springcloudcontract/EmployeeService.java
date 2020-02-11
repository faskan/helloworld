package org.zcode.springcloudcontract;

import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class EmployeeService {


    public List<Employee> getAllEmployees() {
        return Collections.singletonList(Employee.builder()
                .id("someId")
                .firstName("someFirstName")
                .lastName("someLastName")
                .build());
    }
}
