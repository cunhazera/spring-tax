package com.money;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class TaxApplication {
	
	@RequestMapping("/hello")
	String home() {
		return "Hello!";
	}

	public static void main(String[] args) {
		SpringApplication.run(TaxApplication.class, args);
	}
}
