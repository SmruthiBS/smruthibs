package com.xworkz.inheitance.child.satellite;

import com.xworkz.inheitance.examples.Satellite;

public class Moon extends Satellite {
	public double diameter;

	public Moon(String name, String planet,double diameter) {
		super(name, planet);
		this.diameter=diameter;
		// TODO Auto-generated constructor stub
	}
	public void display() {
		super.display();
		System.out.println(this.diameter);
	}
	

}
