package com.xworkz.inheitance.examples;

public class Satellite {
	public String name;
	public String planet;
	public Satellite(String name, String planet) {
		super();
		this.name = name;
		this.planet = planet;
	}
	public void display() {
		System.out.println(this.name);
		System.out.println(this.planet);
	}
	

}
