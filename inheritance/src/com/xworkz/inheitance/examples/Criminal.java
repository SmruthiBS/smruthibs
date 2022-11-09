package com.xworkz.inheitance.examples;

public class Criminal {
	public String name;
	public String offence;
	public Criminal(String name, String offence) {
		super();
		this.name = name;
		this.offence = offence;
	}
	public void display() {
		System.out.println(this.name);
		System.out.println(this.offence);
	}

}
