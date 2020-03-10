package org.zcode.springcloudcontractclient;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;

import java.util.List;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class ClientControllerWiremockIntegrationTest {

    @Autowired
    TestRestTemplate testRestTemplate;

    @LocalServerPort
    int port;

    @BeforeAll
    public static void init(){

    }
    @Test
    void getAllAccounts() throws Exception {
        List<Account> accountList = (List<Account>) testRestTemplate.getForEntity("http://localhost:" + port + "/accounts", List.class);
    }
}