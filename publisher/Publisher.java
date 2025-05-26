package com.publisher;
public class Publisher {
	private String publisherName;
	private String publisherAddress;
	private String licenseCode;
	
	
	private Publisher(String publisherName, String publisherAddress, String licenseCode) {
		this.publisherName = publisherName;
		this.publisherAddress = publisherAddress;
		this.licenseCode = licenseCode;
	}
	
	
	public String getPublisherName() {
		return publisherName;
	}


	public void setPublisherName(String publisherName) {
		this.publisherName = publisherName;
	}


	public String getPublisherAddress() {
		return publisherAddress;
	}


	public void setPublisherAddress(String publisherAddress) {
		this.publisherAddress = publisherAddress;
	}


	public String getLicenseCode() {
		return licenseCode;
	}


	public void setLicenseCode(String licenseCode) {
		this.licenseCode = licenseCode;
	}


	public String toString() {
		return "Publisher Name:"+" ["+publisherName+"] "+" Publisher Address :"+" ["+publisherAddress+"] "+" License Code :"+" ["+licenseCode+"]";
	}
	
	public static Publisher getManufacturerObject(String publisherName, String publisherAddress,String licenseCode)
	{
		if(licenseCode.length() == 8 && licenseCode.startsWith("PUB"))
		{
			return null;
		}
		return new Publisher(publisherName, publisherAddress, licenseCode);
	}

}
