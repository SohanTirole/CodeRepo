package com.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.spring")
public class AppConfig {
	
	@Bean
	public ServiceElectricity serviceElectricity() {
		return new ServiceElectricity();
	}
	
	@Bean
	public ServiceWater serviceWater() {
		return new ServiceWater();
	}
	
	@Bean
	public String msg() {
		return "Hello Kirana";
	}
}

