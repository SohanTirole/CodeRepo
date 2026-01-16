package com.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	private EmailService emailService;
	private HelloService helloService;
	
	@Autowired
	private SMSService smsService;
	
	UserService(){
		System.out.println("This is user service no-argument constructor");
	}
	
	@Autowired
	UserService(EmailService emailService){
		this.emailService = emailService;	
	}
	
	@Autowired
	public void setHelloMessage(HelloService helloService){
		this.helloService = helloService;
	}
	
	public void actionPerformed() {
		emailService.printEmailMessage();
		helloService.setHelloMessage("This is hello message");
		helloService.getHelloMessage();
		smsService.smsServiceMessage();
	}
	
	
}
