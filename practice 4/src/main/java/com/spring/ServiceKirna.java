package com.spring;

import org.springframework.stereotype.Component;

@Component
public class ServiceKirna {
	private String kiranaMessage;
	
	ServiceKirna(String obj){
		kiranaMessage = obj;
	}
	
	public void printKiranaMessage() {
		System.out.println(kiranaMessage);
	}
}
