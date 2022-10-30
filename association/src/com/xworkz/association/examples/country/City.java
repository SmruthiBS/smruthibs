package com.xworkz.association.examples.country;

public class City {
	public Name name;
	public boolean capital;
	public double areaInSquareKilometers;
	public City(Name name, boolean capital, double areaInSquareKilometers) {
		super();
		this.name = name;
		this.capital = capital;
		this.areaInSquareKilometers = areaInSquareKilometers;
	}
	public void display() {
		if(name!=null) {
			name.display();
		}
		else
			System.out.println("name is null");
		System.out.println(this.capital);
		System.out.println(this.areaInSquareKilometers);
	}
	
}

