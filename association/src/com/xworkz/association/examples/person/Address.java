package com.xworkz.association.examples.person;

public class Address {
	Location location;

	public Address(Location location) {
		super();
		this.location = location;
	}
	public void display() {
		if(location!=null) {
			location.display();
		}
		else
			System.out.println("location is empty");
			
	}

}
