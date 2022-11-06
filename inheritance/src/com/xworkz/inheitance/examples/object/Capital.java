package com.xworkz.inheitance.examples.object;

public class Capital extends Place {
	public Capital() {
		System.out.println("calling default constructor of the class Capital");

	}
	public void createInstance()
	{
		System.out.println(" possible properties of class capital ");
		Capital cap1=new Capital();
		Place place2= new Capital();
		Object obj3=new Capital();
	}

}
