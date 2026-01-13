package com.spring;

public class Service2 {
	private String message;
	Service2(String message){
		this.message = message;
	}
	
	public void printMessage() {
		System.out.println("Service2 Method Invoked : "+message);
	}
}
