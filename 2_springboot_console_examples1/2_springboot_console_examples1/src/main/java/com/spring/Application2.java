package com.spring;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.annotation.Order;

@SpringBootApplication
public class Application2 {

	public static void main(String[] args) {
		SpringApplication.run(Application2.class, args);
		System.out.println("Hello, Inside main method");
	}
	
	@Bean 	
	@Order(3)
	public CommandLineRunner printMessage() {
		return args-> {
			System.out.println("Hello this is CommandLineController Example | Application 2");
		};
	}
}
