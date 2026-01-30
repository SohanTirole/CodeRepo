package com.spring;

import org.slf4j.Logger;//slf4j = simple logging facade for java
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application4 {
	
	private final static Logger logger = LoggerFactory.getLogger(Application4.class);

	public static void main(String[] args) {
		SpringApplication.run(Application4.class, args);
		
		logger.info(">>>>>>>>>>This is an example of logger.info");
		logger.error(">>>>>>>..This is an example of logger.error");
		logger.debug("/////////This is an example of logger.debug");
	}
	
	
	@Bean
	public CommandLineRunner printMessage4() {
		
		return ramesh->{System.out.println("hello | Application 4");};
	}

}
