package com.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.stereotype.Component;

import com.spring.service.EmailService;
import com.spring.service.HelloService;
import com.spring.service.SMSService;

@Component
public class MainApplication {

	private EmailService emailService;
	private SMSService smsService;
	
	@Autowired
	private HelloService helloService;
	
	@Autowired
	public MainApplication(EmailService emailService) {
		this.emailService = emailService;
	}
	
	public void setSMSService(SMSService smsService) {
		this.smsService = smsService;
	}
	
	public void actionPerformed(){
		helloService.getHelloMessage();
		emailService.printEmailMessage();
	}
	
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		MainApplication mainApp = context.getBean(MainApplication.class);
		mainApp.actionPerformed();
		
		SMSService sms1 = context.getBean(SMSService.class);
		sms1.smsServiceMessage();
		sms1.printNumber();
		System.out.println("Sms2 : "+sms1);
		SMSService sms2 = context.getBean(SMSService.class);
		sms1.smsServiceMessage();
		sms1.printNumber();
		System.out.println("Sms2 : "+sms2);
		
		((AbstractApplicationContext)context).close();
		
	}
}
	