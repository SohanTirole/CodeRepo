package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApplication {
	
	ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
	UserService service = context.getBean(UserService.class);
	service.ctionPerformed();
}