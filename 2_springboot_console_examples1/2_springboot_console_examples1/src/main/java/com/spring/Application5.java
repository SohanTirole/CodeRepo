package com.spring;

import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import ch.qos.logback.classic.Logger;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@SpringBootApplication
public class Application5 {
	public static final Logger logger = (Logger) LoggerFactory.getLogger(Application5.class);
	
	public static void main(String[] args) {
		logger.info(">>>>>>>>>>Info Befor run method execution");
		SpringApplication.run(Application5.class, args);
		logger.info(">>>>>>>>>>Info After run method exection");
	}
	
	@Bean
	public CommandLineRunner printMessage5() {
		return args->{
			logger.info(">>>>>>>>>commandline runner invoked");
		};
	}
	
	@PostConstruct
	public void message() {
		logger.info("===========post construct method invoked");
	}
	
	@PreDestroy
	public void message1() {
		logger.info("=========== pre destroy method invoked");
	}

}
