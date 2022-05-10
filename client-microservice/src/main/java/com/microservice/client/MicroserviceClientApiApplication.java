package com.microservice.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MicroserviceClientApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceClientApiApplication.class, args);
	}

}
