package com.manufacturer;

public class Manufacturer {
	private String manufacturer;
	private String manufacturerAddress;
	private String registrationNumber;
	
	private Manufacturer(String manufacturer, String manufacturerAddress, String registrationNumber) {
		this.manufacturer = manufacturer;
		this.manufacturerAddress = manufacturerAddress;
		this.registrationNumber = registrationNumber;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public String getManufacturerAddress() {
		return manufacturerAddress;
	}
	public void setManufacturerAddress(String manufacturerAddress) {
		this.manufacturerAddress = manufacturerAddress;
	}
	public String getRegistrationNumber() {
		return registrationNumber;
	}
	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}
	public String toString() {
		return "Manufacturer Name:"+" ["+manufacturer+"] "+" Manufacturer Address :"+" ["+manufacturerAddress+"] "+" Reg#"+" ["+registrationNumber+"]";
	}
	
	public static Manufacturer getManufacturerObject(String manufacturer, String manufacturerAddress,String registrationNumber)
	{
		if(registrationNumber.length()!=10)
		{
			return null;
		}
		return new Manufacturer(manufacturer, manufacturerAddress, registrationNumber);
	}
	
	
	

}
