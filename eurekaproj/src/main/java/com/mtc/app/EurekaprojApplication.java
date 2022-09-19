package com.mtc.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekaprojApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaprojApplication.class, args);
	}

}
