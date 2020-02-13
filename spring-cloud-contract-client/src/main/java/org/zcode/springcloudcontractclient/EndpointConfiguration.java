package org.zcode.springcloudcontractclient;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "endpoints")
@Data
public class EndpointConfiguration {

    private String employeesUrl;
}
