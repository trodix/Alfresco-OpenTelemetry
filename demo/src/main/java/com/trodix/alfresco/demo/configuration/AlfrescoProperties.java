package com.trodix.alfresco.demo.configuration;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "alfresco")
@Data
public class AlfrescoProperties {
    private String url;
    private String username;
    private String password;
}