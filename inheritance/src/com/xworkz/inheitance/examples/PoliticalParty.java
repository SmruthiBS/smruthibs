package com.xworkz.inheitance.examples;

public class PoliticalParty {
	public String name;
	public String founder;
	public PoliticalParty(String name, String founder) {
		super();
		this.name = name;
		this.founder = founder;
	}
public void display() {
	System.out.println(this.name);
	System.out.println(this.founder);
}
}
