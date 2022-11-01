package com.xworkz.association.examples.person;

public class Country {
	public String name;
	public String capital;
	public double area;
	public String president;
	public Country(String name, String capital, double area, String president) {
		super();
		this.name = name;
		this.capital = capital;
		this.area = area;
		this.president = president;
	}
	
public void display() {
	System.out.println(this.name);
	System.out.println(this.capital);
	System.out.println(this.area);
	System.out.println(this.president);
}
}
