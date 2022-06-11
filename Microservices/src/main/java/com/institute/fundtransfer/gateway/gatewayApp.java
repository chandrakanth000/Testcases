package com.institute.fundtransfer.gateway;

import org.springframework.boot.SpringApplication;

@SpringBootApplication
@EnableEurekaClient

public class gatewayApp {

    public static void main(String[] args) {
		SpringApplication.run(GatewayComponentApplication.class, args);
	}
    
}
