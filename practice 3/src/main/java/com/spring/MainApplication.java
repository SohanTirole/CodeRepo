package com.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApplication {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context =  new ClassPathXmlApplicationContext("bean.xml");
		UserService user =(UserService) context.getBean("userservice");
		
		user.actionPerformed();
	}
}
