package com.ems;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200")
@SpringBootApplication
@RestController
public class EmsBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmsBackendApplication.class, args);
		System.out.println("EMS APP.");
	}

	@GetMapping("/")
	public Welcome welcome() {
		return new Welcome("Welcome to EMS Application Version v1.1.0.0");
	}
}
