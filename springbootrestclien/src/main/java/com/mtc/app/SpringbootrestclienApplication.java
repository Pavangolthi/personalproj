package com.mtc.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;

import com.mtc.app.dto.ProductDTO;

@SpringBootApplication
public class SpringbootrestclienApplication implements CommandLineRunner{
	
	@Autowired
	private RestTemplate restTemplate;
	
	private static final String baseURL = "http://localhost:8081/products/";

	public static void main(String[] args) {
		SpringApplication.run(SpringbootrestclienApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		ProductDTO productDTO = restTemplate.getForEntity(baseURL+1, ProductDTO.class).getBody();
		System.out.println(productDTO);
	}

}
