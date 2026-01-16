package com.spring.service;

public class HelloService {
	private String helloMessage;

	public void getHelloMessage() {
		System.out.println("This is HelloServiceMessage : "+helloMessage);
	}

	public void setHelloMessage(String helloMessage) {
		this.helloMessage = helloMessage;
	}
	
}
