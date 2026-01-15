package com.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import com.spring.service.GmailService;
import com.spring.service.HelloService;
import com.spring.service.SmsService;
import com.spring.service.YahooService;


@Component
public class MainApplication {
	@Autowired
	private HelloService hello;
	private SmsService sms;
	private GmailService gmail;
	
	@Autowired
	private YahooService yahoo;
	
	@Autowired
	public void setSms(SmsService sms) {
		this.sms = sms;
	}
	
	@Autowired
	public MainApplication(GmailService gmail) {
		this.gmail = gmail;
	}
	
	public void actionPerformed() {
		sms.printNumber();
		hello.printHelloMessage();
		gmail.printEmailMessage();
	}
	
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		MainApplication main = context.getBean(MainApplication.class);
		main.actionPerformed();
		
	}
}
