package com.trodix.alfresco.demo.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
@EnableConfigurationProperties(AlfrescoProperties.class)
public class AlfrescoConfig {

    @Bean
    RestTemplate alfrescoRestTemplate(RestTemplateBuilder restTemplateBuilder, AlfrescoProperties alfrescoProperties) {
        return restTemplateBuilder
                .rootUri(alfrescoProperties.getUrl())
                .basicAuthentication(alfrescoProperties.getUsername(), alfrescoProperties.getPassword())
                .build();
    }


}
