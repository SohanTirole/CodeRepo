package com.spring.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

public class ServiceHello {
	
	@Value("this is hello message assingd by value annotation")
	private String helloMessage;

	public String getHelloMessage() {
		return helloMessage;
	}
	
}
