package com.spring;

import org.springframework.beans.factory.annotation.Autowired;

public class UserService {
	private Service1 service1;
	private Service2 service2;

	@Autowired
	private Service3 service3;
	
	@Autowired
	UserService(Service2 service2){
		this.service2 = service2;
	}
	
	@Autowired
	public void setService1(Service1 service1) {
		this.service1 = service1; 
	}
	
	@Autowired
	public void actionPerformed() {
		System.out.println(service1.getMessage());
		service2.printMessage();
		service3.printMessagre();
	}
}
