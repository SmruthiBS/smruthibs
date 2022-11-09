package com.xworkz.inheitance.child.shoppingMall;

import com.xworkz.inheitance.examples.ShoppingMall;

public class Orion extends ShoppingMall {
	public String owner;

	public Orion(String location, int noOfStores,String owner) {
		super(location,noOfStores);
		this.owner=owner;
		// TODO Auto-generated constructor stub
	}
	public void display() {
		super.display();
		System.out.println(this.owner);
	}

}
