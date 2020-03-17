package com.sonata.day3;

public class Address {
	
	int doorNo;
	String Street;
	String city;
	double pin;
	public int getDoorNo() {
		return doorNo;
	}
	public void setDoorNo(int doorNo) {
		this.doorNo = doorNo;
	}
	public String getStreet() {
		return Street;
	}
	public void setStreet(String street) {
		Street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public double getPin() {
		return pin;
	}
	public void setPin(double pin) {
		this.pin = pin;
	}
	@Override
	public String toString() {
		return "Address [doorNo=" + doorNo + ", Street=" + Street + ", city=" + city + ", pin=" + pin + "]";
	}
	

}
