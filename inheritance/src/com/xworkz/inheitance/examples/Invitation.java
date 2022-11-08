package com.xworkz.inheitance.examples;

import com.xworkz.inheitance.constant.CardType;

public class Invitation {
public int copies;
public double price;
public CardType type;
public Invitation(int copies, double price, CardType type) {
	super();
	this.copies = copies;
	this.price = price;
	this.type = type;
}
public void display() {
	System.out.println(this.copies);
	System.out.println(this.price);
	System.out.println(this.type);
}
}
