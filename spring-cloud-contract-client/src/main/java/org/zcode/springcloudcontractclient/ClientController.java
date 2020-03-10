package org.zcode.springcloudcontractclient;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class ClientController {

    private ClientService clientService;

    @GetMapping("/accounts")
    public List<Account> getAllAccounts() {
        return clientService.getAllAccounts();
    }
}
