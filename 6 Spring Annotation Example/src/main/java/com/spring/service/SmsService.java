package com.spring.service;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Service
@Scope("singleton")
public class SmsService {
	private long number;
	
	public SmsService() {
		System.out.println("SmsService Constructor is called");
	}
	
	public void printNumber() {
		System.out.println("Print Number : "+number);
	}
	
	@PostConstruct
	public void init() {
		System.out.println("Post Construct is called it means bean is created ");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("Pre Destroy is Called it means bean object is terminated");
	}

}
