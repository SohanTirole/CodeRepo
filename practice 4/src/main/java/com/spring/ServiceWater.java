package com.spring;

import org.springframework.beans.factory.annotation.Value;

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
