package com.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.service.ServiceElectricity;
import com.spring.service.ServiceHello;
import com.spring.service.ServiceKirna;
import com.spring.service.ServiceWater;

public class MainApplication {
	
	
	private ServiceWater water;

	
	private ServiceKirna kirana;
	private ServiceHello hello;

	@Autowired
	private ServiceElectricity electricity;

	@Autowired
	public MainApplication(ServiceHello hello) {
		this.hello = hello;
	}
	
	@Autowired
	public void setServiceWater(ServiceWater water) {
		this.water = water;
	}
//	
//	@Autowired
//	public void setServiceHello(ServiceHello hello) {
//		this.hello = hello;
//	}
//	
	@Autowired
	public void setServiceKirna(ServiceKirna kirana){
		this.kirana = kirana;
	}
//	
//	public static void actionPerformed() {
//		
//	}
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		ServiceElectricity electricity = context.getBean(ServiceElectricity.class);
		electricity.electricityMessage();
		
		ServiceKirna kirna = context.getBean(ServiceKirna.class);
		kirna.printKiranaMessage();
		
		ServiceHello hello = context.getBean(ServiceHello.class);
		System.out.println(hello.getHelloMessage());
		
		ServiceWater water = context.getBean(ServiceWater.class);
		water.getWaterMessage();
		
	
		
	}	
}
