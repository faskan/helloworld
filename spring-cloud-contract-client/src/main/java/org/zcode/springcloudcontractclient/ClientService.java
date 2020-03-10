package org.zcode.springcloudcontractclient;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class ClientService {

    private RestTemplate restTemplate;
    private EndpointConfiguration endpointConfiguration;

    public List<Account> getAllAccounts() {
        List<Employee> employeeList = (List<Employee>) restTemplate.getForEntity(endpointConfiguration.getEmployeesUrl(), List.class);
        return employeeList.stream()
                .map(employee -> Account.builder().accountName(employee.getFirstName() + employee.getLastName()).build())
                .collect(Collectors.toList());
    }

}

@Data
@Builder
class Employee {
    private String firstName;
    private String lastName;
}