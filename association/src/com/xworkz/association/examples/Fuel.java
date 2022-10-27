package com.xworkz.association.examples;

import com.xworkz.association.constants.FuelType;

public class Fuel {
	public Brand brand=new Brand("Bharat Petroleum","29AERTU4512V2XZ5",3.5f);
	public boolean spcial;
	public FuelType fueltype;
	public double price;
	public double quantity;
	public Fuel(boolean spcial, FuelType fueltype, double price, double quantity) {
		super();
		this.spcial = spcial;
		this.fueltype = fueltype;
		this.price = price;
		this.quantity = quantity;
	}
	public void totalprice()
	{
		double total=price*quantity;
		System.out.println("total =" +total);
	}
	public void showoff()
	{
		System.out.println(this.spcial);
		System.out.println(this.price);
		System.out.println(this.fueltype);
		System.out.println(this.quantity);
		this.totalprice();
		this.brand.showoff();
	}

	
		
	}



