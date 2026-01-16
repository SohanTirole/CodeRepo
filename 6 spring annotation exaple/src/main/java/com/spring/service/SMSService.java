package com.spring.service;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Service
@Scope("singleton")
public class SMSService {
	
	long number;
	
	public SMSService() {
		System.out.println("SmsService Constructor Invoked");
	}
	
	@PostConstruct
	public void init() {
		System.out.println("post construct annotation called");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("invoked by spring before termination of bean");
	}
	public void printNumber() {
		System.out.println("No receive sms from : "+number);
	}

	public void smsServiceMessage() {
		System.out.println("Hello this is sms Service");
		
	}
}
