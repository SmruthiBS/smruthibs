package com.xworkz.association.examples.person;

public class City {
	public String name;
	public boolean capital;
	public String oldName;
	public int area;
	public City(String name, boolean capital, String oldName, int area) {
		super();
		this.name = name;
		this.capital = capital;
		this.oldName = oldName;
		this.area = area;
	}
	
	public void display() {
		System.out.println(this.name);
		System.out.println(this.capital);
		System.out.println(this.area);
		System.out.println(this.oldName);
	}

}
