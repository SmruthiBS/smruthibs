package com.xworkz.inheitance.examples;

public class ShoppingMall {
public String location;
public int noOfStores;
public ShoppingMall(String location, int noOfStores) {
	super();
	this.location = location;
	this.noOfStores = noOfStores;
}
public void display()
{
	System.out.println(this.location);
	System.out.println(this.noOfStores);
	}
}
