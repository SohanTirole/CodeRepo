package com.spring.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class ServiceWater {
	
	@Value("WateMessage Value Assigned by @Value annotation")
	private String waterMessage;

	public void getWaterMessage() {
		System.out.println(waterMessage);
	}

	public void setWaterMessage(String waterMessage) {
		this.waterMessage = waterMessage;
	}
	
}
