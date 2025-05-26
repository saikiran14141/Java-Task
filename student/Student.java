package com.student;
import com.school1.*;

public class Student {
	
	private String studentName;
	private String grade;
	private School school;
	private double averageMarks;
	private Student(String studentName, String grade, School school, double averageMarks) {
		this.studentName = studentName;
		this.grade = grade;
		this.school = school;
		this.averageMarks = averageMarks;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public School getSchool() {
		return school;
	}
	public void setSchool(School school) {
		this.school = school;
	}
	public double getAverageMarks() {
		return averageMarks;
	}
	public double setAverageMarks(double averageMarks) {
		return this.averageMarks=averageMarks;
	}
	
	public String toString() {
		return "Student Name:"+" ["+studentName+"] "+" Grade :"+" ["+grade+"] "+" School"+" ["+school+"] "+" AverageMarks"+" ["+averageMarks+"] ";
	}
	
	public static Student getStudentObjects(String studentName, String grade,School school , double averageMarks)
	{
		if(averageMarks<0 || averageMarks>100 || school==null)
		{
			return null;
		}
		return new Student(studentName,grade,school,averageMarks);
	}
	
	
	
	
}




