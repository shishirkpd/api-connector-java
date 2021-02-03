package com.skp.apiconnector.service;

import com.fasterxml.jackson.databind.util.JSONPObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

public class ApiConnectorServiceImpl implements ApiConnectorService {

    @Value("${spring.application.api.url}")
    String url;

    @Autowired
    RestTemplate restTemplate;

    @Override
    public String fetchResponseFromApi() {
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<String> entity = new HttpEntity<String>(headers);

        ResponseEntity result =  restTemplate.exchange(url, HttpMethod.GET, entity, String.class);
        return  result.getBody().toString();
    }
}
