package com.xworkz.association.examples;

public class Location {
	public String street;
	public String city;
	public String state;
	public int pincode;
	public String country;
	public Location(String street, String city, String state, int pincode, String country) {
		super();
		this.street = street;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
		this.country = country;
	}
	public void showoff()
	{
		System.out.println("street : "+this.street);
		System.out.println("city: "+this.city);
		System.out.println("state: "+this.state);
		System.out.println("pincode:"+this.pincode);
		System.out.println("country: "+this.country);
	}
}

