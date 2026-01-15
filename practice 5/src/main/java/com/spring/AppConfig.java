package com.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.spring.service.ServiceElectricity;
import com.spring.service.ServiceHello;
import com.spring.service.ServiceKirna;
import com.spring.service.ServiceWater;

@Configuration
@ComponentScan("com.spring")
public class AppConfig {
	
	@Bean
	public ServiceElectricity electricity() {
		return new ServiceElectricity();
	}
	@Bean
	public ServiceHello hello() {
		return new ServiceHello();
	}
	
////	@Bean
////	public ServiceKirna kirana() {
////		return new ServiceKirna();
////	}
//	@Bean
//	public ServiceWater water() {
//		return new ServiceWater();
//	}
}
