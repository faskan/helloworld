package org.zcode.springcloudcontractclient;

import lombok.Builder;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class ClientService {

    @Autowired
    RestTemplate restTemplate;

    public List<Account> getAllAccounts() {
        restTemplate.getForEntity()
    }

}

@Data
@Builder
class Employee {
    private String firstName;
    private String lastName;
}