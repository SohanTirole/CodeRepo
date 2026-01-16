package com.spring.service;

import org.springframework.stereotype.Component;

@Component
public class ServiceKirna {
	private String kiranaMessage;
	
	ServiceKirna(){
		kiranaMessage = "Hello ServiceKirana ";
	}
	
	public void printKiranaMessage() {
		System.out.println(kiranaMessage);
	}
}
