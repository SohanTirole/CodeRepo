package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.config.AppConfig;
import com.spring.dao.UserDao;
import com.spring.model.User;

public class MainApplication{
	
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		UserDao userDao = context.getBean(UserDao.class);
		
		
		userDao.addUser(new User(101,"Andrew Anderson","andrew@gmail.com","Indore"));
		userDao.addUser(new User(102,"Peter Parker","peter@gmail.com","Dewas"));
		userDao.addUser(new User(103,"Jackson Jack","jackson@gmail.com","Ujjain"));
		userDao.addUser(new User(104,"Mathew Math","mathew@gmail.com","Nagda"));
		userDao.addUser(new User(105,"Simon Sim","simon@gmail.com","Jabalpur"));
		System.out.println("Data Inserted Successfully");
		
		userDao.updateUser(new User(101,"Sohan Tirole", "sohan@gmail.com", "Harda,Mp"));
		System.out.println("Data Inserted Successfully");
		
		userDao.deleteUser(104);
		System.out.println("User Deleted Successfylly");
		
		userDao.getUser(105);
		System.out.println("User Fetch By Id Successfylly");
		
		userDao.getAllUser();
		System.out.println("All User Fetched Successfully");
	}
}