package com.main3;
import com.publisher.*;
import com.book.*;
public class Main {

	public static void main(String[] args) {
		Publisher pb = Publisher.getManufacturerObject("Kiran", "Hyd", "PUB123456");
		Book bk = Book.getProductObject("One8", "Kiran", pb, 2000.0);
		if(pb==null || bk == null)
		{
			System.out.println("Book creation failed due to Invalid Data.");
		}
		System.out.println(bk);
		System.out.println(pb);
	}
}
