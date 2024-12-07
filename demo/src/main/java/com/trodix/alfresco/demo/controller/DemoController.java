package com.trodix.alfresco.demo.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/api")
public class DemoController {

    private final RestTemplate alfrescoRestTemplate;

    public DemoController(RestTemplate alfrescoRestTemplate) {
        this.alfrescoRestTemplate = alfrescoRestTemplate;
    }

    @GetMapping(value = "home", produces = MediaType.APPLICATION_JSON_VALUE)
    public String getHome() {
        String queryBody = """
                {
                    "query": {
                        "query": "TYPE:'cm:content' AND SITE:swsdp"
                    }
                }
                """;
        return alfrescoRestTemplate.postForObject("/api/-default-/public/search/versions/1/search", queryBody, String.class);
    }

}
