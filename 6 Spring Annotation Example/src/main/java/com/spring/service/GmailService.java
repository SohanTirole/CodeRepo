package com.spring.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class GmailService implements EmainService{
	
	@Value("sohan@gamil.com")
	private String gmailMessage;
	
	@Override
	public void printEmailMessage() {
		System.out.println("Hello user your Gmail email: "+gmailMessage);
	}
}
