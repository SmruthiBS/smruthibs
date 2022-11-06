package com.xworkz.inheitance.examples.object;

public class Bengaluru  extends SiliconCity{
	public Bengaluru() {
		System.out.println("calling default constructor of class bengaluru");
	}
	public void createInstance() {
		System.out.println("properties of class bengaluru");
		Bengaluru bengaluru1=new Bengaluru();
		SiliconCity scity2=new Bengaluru();
		MetroCity metro3= new Bengaluru();
		City city4= new Bengaluru();
		Capital cap5=new Bengaluru();
		Place place6 =new Bengaluru();
		Object obj7 =new Bengaluru();
		
	}

}
