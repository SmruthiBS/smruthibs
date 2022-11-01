package com.xworkz.association.examples.person;

public class State {
 public String name;
 public String capital;
 public double area;
 public String cm;
public State(String name, String capital, double area, String cm) {
	super();
	this.name = name;
	this.capital = capital;
	this.area = area;
	this.cm = cm;
}
public void display() {
	System.out.println(this.name);
	System.out.println(this.capital);
	System.out.println(this.area);
	System.out.println(this.cm);
}

}
