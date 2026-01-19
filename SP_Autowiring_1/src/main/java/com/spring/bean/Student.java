package com.spring.bean;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {
	private String name;
	private int roll;
	@Autowired
	private Address address;
	
	@Autowired
	private Subject subject;
	 
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	 
	public Subject getSubject() {
		return subject;
	}
	
	public void setSubject(Subject subject) {
	    this.subject = subject;  // ❌ but yeh field define nahi ki
	}

	public void display() {
		System.out.println(name);
		System.out.println(roll);
		System.out.println(address);
		System.out.println("Subects: "+subject);
	}
	 
}
