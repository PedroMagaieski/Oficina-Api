package com.example.Api_Oficina;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class ApiOficinaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiOficinaApplication.class, args);

	}
	@GetMapping("/")
	public String index(){
		return "ola mundo--hello world--こんにちわ世界！";
	}
}
