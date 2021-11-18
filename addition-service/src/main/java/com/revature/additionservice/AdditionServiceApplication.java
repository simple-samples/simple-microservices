package com.revature.additionservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.revature.additionservice.beans")
public class AdditionServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AdditionServiceApplication.class, args);
	}

}
