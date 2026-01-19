package com.spring.bean;

public class Address {
	 private String city, state;
	 private int pincode;
	 public String getCity() {
		 return city;
	 }
	 public void setCity(String city) {
		 this.city = city;
	 }
	 public String getState() {
		 return state;
	 }
	 public void setState(String state) {
		 this.state = state;
	 }
	 public int getPincode() {
		 return pincode;
	 }
	 public void setPincode(int pincode) {
		 this.pincode = pincode;
	 }
	 @Override
	 public String toString() {
		// TODO Auto-generated method stub
		return "State: "+state+", City: "+city+", Pincode: "+pincode;
	 }
	 
	 
}
