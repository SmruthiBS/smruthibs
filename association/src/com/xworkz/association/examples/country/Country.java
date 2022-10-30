package com.xworkz.association.examples.country;

public class Country {
	public String name;
	public City[] city;
	public President president;

	public Country(String name, City[] city, President president) {
		super();
		this.name = name;
		this.city = city;
		this.president = president;
	}

	public void display() {
		System.out.println(this.name);
		
		if (president != null) {
			president.display();
		} else
			System.out.println("president is null");
		if (city != null) {
			for (int i = 0; i < city.length; i++) {
				
			}

		} else
			System.out.println("city is null");
	}

}
