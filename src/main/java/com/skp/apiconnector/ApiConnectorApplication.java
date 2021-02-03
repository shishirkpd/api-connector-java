package com.skp.apiconnector;

import com.skp.apiconnector.service.ApiConnectorService;
import com.skp.apiconnector.service.ApiConnectorServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class ApiConnectorApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiConnectorApplication.class, args);
	}

	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}

	@Bean
	public ApiConnectorService getApiConnectorService(){
		return new ApiConnectorServiceImpl();
	}
}
