package com.school1;

public class School {
	 private String schoolName;
	 private String schoolAddress;
	 private String schoolMotto;
	 
	 
	private School(String schoolName, String schoolAddress, String schoolMotto) {
		this.schoolName = schoolName;
		this.schoolAddress = schoolAddress;
		this.schoolMotto = schoolMotto;
	}
	public String getSchoolName() {
		return schoolName;
	}
	public void setSchoolName(String schoolName) {
		
		this.schoolName = schoolName;
	}
	public String getSchoolAddress() {
		return schoolAddress;
	}
	public void setSchoolAddress(String schoolAddress) {
		this.schoolAddress = schoolAddress;
	}
	public String getSchoolMotto() {
		return schoolMotto;
	}
	public void setSchoolMotto(String schoolMotto) {
		this.schoolMotto = schoolMotto;
	}


	public static School getSchoolDetails(String schoolName, String schoolAddress, String schoolMotto)
	{
		if(schoolName == null || schoolAddress == null || schoolMotto == null || schoolName.isEmpty() || schoolAddress.isEmpty() || schoolMotto.isEmpty())
		{
			return null;
		}
		return new School(schoolName, schoolAddress, schoolMotto);
	}
	
	public String toString()
	{
		return "School Name :"+" ["+schoolName+"] "+" School Address :"+" ["+schoolAddress+"] "+" School Motto :"+" ["+schoolMotto+"] ";
				
	}
}
