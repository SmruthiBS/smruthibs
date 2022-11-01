package com.xworkz.association.examples.person;

public class Company {
	public String name;
	public String owner;
	public Address address;
	public Company(String name, String owner, Address address) {
		super();
		this.name = name;
		this.owner = owner;
		this.address = address;
	}
	public void display() {
		System.out.println(this.name);
		System.out.println(this.owner);
		if(address!=null)
		{
			address.display();
		}
		else
			System.out.println("address is empty");
	}
	
	
	

}
