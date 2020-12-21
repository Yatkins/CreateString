package com.example.RestTemplateA;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class RestTemplateAApplication {

	@Bean
	public static void main(String[] args) {
		SpringApplication.run(RestTemplateAApplication.class, args);
	}

}
