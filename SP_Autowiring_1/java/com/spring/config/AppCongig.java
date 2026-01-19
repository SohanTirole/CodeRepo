package com.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.spring.bean.Address;
import com.spring.bean.Student;

@Configuration
//@ComponentScan("com.spring")
public class AppCongig {
	
	@Bean
	public Student createStudeObj() {
		Student std = new Student();
		std.setName("Ramesh");
		std.setRoll(101);
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

}
