package com.main1;
import com.school1.*;
import com.student.*;

public class Main {	

public static void main(String[] args) {
	School sc = School.getSchoolDetails("Hi", "A","1st Rank");
	Student st =Student.getStudentObjects("Kiran", "A", sc, 98.5);
	if(sc==null || st==null)
	{
		System.out.println("Invalid Message");
	}
	System.out.println(st);
	System.out.println(sc);
}
	
}