package com.spring.service;

import org.springframework.stereotype.Service;

@Service
public class YahooService implements EmainService {
	private String yahooMessage;
	
	@Override
	public void printEmailMessage() {
		System.out.println("Hello user, Your Yahoo mail: "+yahooMessage);
		
	}
}
