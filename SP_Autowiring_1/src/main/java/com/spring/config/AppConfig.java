package com.spring.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.spring.bean.Address;
import com.spring.bean.Student;
import com.spring.bean.Subject;

@Configuration
//@ComponentScan("com.spring")
public class AppConfig {
	
	@Bean
	public Student createStudeObj() {
		Student std = new Student();
		std.setName("Ramesh");
		std.setRoll(101);
		std.getAddress();
		std.getSubject();
		return std;
	}
	
	@Bean
	public Address createAddressObj() {
		Address add = new Address();
		add.setCity("Harda");
		add.setPincode(111);
		add.setState("MP");
		return add;
		
	}
	
	
	@Bean
	public Subject createSubjectObj() {
		Subject sub = new Subject();
		List<String> sublist  = new ArrayList<>();
		sublist.add("java");
		sublist.add("rust");
		sublist.add("go");
		sub.setSubject(sublist);
		
		return sub;
	}
}