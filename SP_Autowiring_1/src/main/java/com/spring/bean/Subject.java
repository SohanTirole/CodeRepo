package com.spring.bean;

import java.util.ArrayList;
import java.util.List;

public class Subject {
	private List<String> subject =new ArrayList<>();

	public List<String> getSubject() {
		return subject;
	}

 

	@Override
	public String toString() {
		String list = String.join(", ", subject);
		return list;
	}

	public void setSubject(List<String> sublist) {
		this.subject = subject;
		
	}

}
