package com.bibernate.main;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hibernate.model.User;
import com.hibernate.utils.HibernateUtils;

public class HibernateMain {
	public static void main(String[] args) {
		User user = new User();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter username : ");
		String username = scan.nextLine();
		
		System.out.println("Enter email : ");
		String email = scan.nextLine();
		
		System.out.println("Enter password : ");
		String password = scan.nextLine();
		
		System.out.println("Enter address:");
		String address = scan.nextLine();
		
		user.setUsername(username);
		user.setEmail(email);
		user.setPassword(password);
		user.setAddress(address);
		
		
		Session session = HibernateUtils.getSessionFactory().openSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			session.persist(user);
			tx.commit();
			System.out.println("working fine");
		}catch(Exception e) {
			if(tx!=null) {
				tx.rollback();
				System.out.println("rollback takes place");
			}
		}
		
		try {
			List<User> list = session.createQuery("from User", User.class).getResultList();
			System.out.println("=========USER DETAILS===========");
			for(User obj : list) {
				System.out.println("\nUid 	: "+obj.getUid());
				System.out.println("Username : "+obj.getUsername());
				System.out.println("Email	: "+obj.getEmail());
				System.out.println("Password : "+obj.getPassword());
				System.out.println("Address 	: "+obj.getAddress());
			}
		}catch(Exception e) {
			System.out.println("Exception : "+e);
		}
	}
}
