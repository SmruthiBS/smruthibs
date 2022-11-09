package com.xworkz.inheitance.child.criminal;

import com.xworkz.inheitance.examples.Criminal;

public class Ravi extends Criminal {
	public boolean arrested;

	public Ravi(String name, String offence,boolean arrested) {
		super(name, offence);
		this.arrested=arrested;
		// TODO Auto-generated constructor stub
	}
	public void display() {
		super.display();
		System.out.println(this.arrested);
	}
	

}
