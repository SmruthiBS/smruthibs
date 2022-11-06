package com.xworkz.inheitance.examples.object;

public class City extends Capital {
	public City(){
		System.out.println("calling default constructor of the class city");
		
	}
public void createInstance() {
	System.out.println(" possible properties of class city ");
	City city=new City();
	Capital cap2=new City();
	
}
}
