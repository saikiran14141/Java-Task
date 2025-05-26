package com.main2;
import com.manufacturer.*;
import com.product.*;
public class Main {

	public static void main(String[] args) {
		Manufacturer mf = Manufacturer.getManufacturerObject("kiran", "Hyd", "8247256623");
		Product pd = Product.getProductObject("Laptop", "Electronic", mf, 700000.0);
		if(mf == null || pd == null)
		{
			System.out.println("Invalid Message");
		}
		System.out.println(pd);
		System.out.println(mf);
		

	}

}
