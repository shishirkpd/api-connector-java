package com.skp.apiconnector.controller;

import com.skp.apiconnector.service.ApiConnectorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

@RestController
@RequestMapping("/api/v1")
public class ApiController {

    @Autowired
    ApiConnectorService apiConnectorService;

    @GetMapping("/someapi")
    public String getInfo() {
        return apiConnectorService.fetchResponseFromApi();
    }

}
