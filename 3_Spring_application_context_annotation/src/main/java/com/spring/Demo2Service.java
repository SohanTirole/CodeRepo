package com.spring;

import org.springframework.stereotype.Component;

//bean by class
@Component
public class Demo2Service {
	public void printMessage() {
		System.out.println("Demo2Service is going to be print");
	}
}
