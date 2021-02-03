package com.skp.apiconnector.service;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.web.context.WebApplicationContext;

@Service
@Scope(WebApplicationContext.SCOPE_REQUEST)
public interface ApiConnectorService {
    public String fetchResponseFromApi();
}
