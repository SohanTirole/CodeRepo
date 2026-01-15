package com.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	private ServiceElectricity electricity;
	private ServiceWater water;
	
	@Autowired
	private ServiceKirna kirana;
	
	@Autowired
	UserService(ServiceWater water){
		this.water = water;
	}
	
	
	@Autowired
	public void setterMethhod(ServiceElectricity electricity) {
		this.electricity = electricity;
	}
	
	public void actionPerformed() {
		water.getWaterMessage();
		electricity.electricityMessage();
		kirana.printKiranaMessage();
	}
	
}
