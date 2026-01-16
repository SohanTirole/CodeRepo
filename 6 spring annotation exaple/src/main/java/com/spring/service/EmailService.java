package com.spring.service;

public class EmailService {
	private String emailMessage;
//
	public void printEmailMessage() {
		System.out.println("This is EamilService message : "+emailMessage);
	}

	EmailService(String emailMessage) {
		this.emailMessage = emailMessage;
	} 
}
