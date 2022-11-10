package com.xworkz.inheitance.child.HR;

import com.xworkz.inheitance.examples.HumanResource;

public class Akshara extends HumanResource {
	@Override
	public void hire() {
		super.hire();
		System.out.println("running hire method in akshara");
	}
public void hire(String name) {
	System.out.println("hiring "+name);
}

}
