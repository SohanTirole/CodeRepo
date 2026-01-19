package com.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.config.AppConfig;

public class MainApplication {
	public static void main(String[] args) {
		
//		int rollno = 102;
//		String username = "peter";
//		float marks = 33;
//		String address = "indore,mp";
//		
//		String query = "insert into student(rollno, username, marks, address) values(?, ?, ?, ?)";
//		int count = jdbcTemplate.update(query,rollno, username, marks, address);
//		if(count>0) {
//			System.out.println("data inserted successfully");
//		}else {
//			System.out.println("Error Occured while inserting data");
//		}
//		
		
		
//		String query = "UPDATE student set marks=? where rollno=?";
//		jdbcTemplate.update(query,"23","102");
//		
//		String query1 = "UPDATE student set username=? where rollno=?";
//		int count = jdbcTemplate.update(query1,"raman","101");
//		
//		if(count>0)
//			System.out.println("Updated Successfully");
//		else
//			System.out.println("Error Occurred");
		
		
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		JdbcTemplate jdbcTemplate = context.getBean(JdbcTemplate.class);
		
		String query = "delete from student where rollno=?";
		int count = jdbcTemplate.update(query,101);
		if(count>0)
			System.out.println("Success");
		else
			System.out.println("Fales");
		
		
	}
}
 