package com.xworkz.association.examples;

public class Weapon {
	public String name;
	public String use;
	public double weight;
	public Weapon(String name, String use, double weight) {
		super();
		this.name = name;
		this.use = use;
		this.weight = weight;
	}
	public void showoff() {
		System.out.println("name of the weapon : "+this.name);
		System.out.println("use of the weapon : "+this.use);
		System.out.println("weight of the weapon : "+this.weight);
	}

}
