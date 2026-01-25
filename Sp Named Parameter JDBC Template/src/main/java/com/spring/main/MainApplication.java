package com.spring.main;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import com.spring.config.AppConfig;

public class MainApplication {
	public static void main(String[] args) {
		ApplicationContext contex = new AnnotationConfigApplicationContext(AppConfig.class);
		NamedParameterJdbcTemplate npJdbcTemplate = contex.getBean(NamedParameterJdbcTemplate.class);
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("rollno", 105);
		map.put("name", "Ramesh Jha");
		map.put("marks",344.3f);
		map.put("address","Sehore");
		
		String query = "Insert into student values(:rollno, :name, :marks, :address)";
		int count = npJdbcTemplate.update(query, map);
		if(count>0)
			System.out.println("Data Inserted Successfully");
		else
			System.err.println("Error Occored while Inserting");
			
	}
}
