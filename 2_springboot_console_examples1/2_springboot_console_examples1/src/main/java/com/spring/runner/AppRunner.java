package com.spring.runner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class AppRunner implements ApplicationRunner{
	private final static Logger logger = LoggerFactory.getLogger(AppRunner.class);
	
	public void run(ApplicationArguments args) {
		logger.info(">>>>>>>>>>>>>Application Runner Executes##############");
		for( String arg : args.getSourceArgs()) {
			System.out.println("=> args : "+arg);
		}
	}
}
