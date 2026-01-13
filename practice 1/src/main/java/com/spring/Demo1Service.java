package com.spring;

public class Demo1Service {
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	public void printMessage() {
		System.out.println("This msg from Demo1Service | printMessage");
	}
	
}
