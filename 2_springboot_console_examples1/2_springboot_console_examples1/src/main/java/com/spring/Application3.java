package com.spring;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.annotation.Order;

@SpringBootApplication
public class Application3 {

	public static void main(String[] args) {
		SpringApplication.run(Application3.class, args);
		
		System.out.println("Hello, this is the Spring Boot");
	}
	
	
	@Bean
	@Order(1)
	public CommandLineRunner printMessage1() {
		return sohan ->{
			System.out.println("Hello this is the CommandLineRunner_1| Application 3");
		};
	}
	
	
	@Bean
	@Order(2)
	public CommandLineRunner printMessage2() {
		return mohan ->{
			System.out.println("Hello, this is the CommandLineRunner_2| Application 3");
		};
	}

}
