package com.spring.main;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.bean.Student;
import com.spring.config.AppConfig;

public class Main {
	public static void main(String[] args) {
		ApplicationContext contex = new AnnotationConfigApplicationContext(AppConfig.class);
		//Address add = contex.getBean(Address.class);
		Student std = contex.getBean(Student.class);
		std.display();
	}
}
