package com.xworkz.inheitance.child.court;

import com.xworkz.inheitance.examples.court.Court;

public class SupremeCourt {
	public int noOfCases=18000;
	public int noOfStaffs=100;
	Court court2= new Court();
	public void display()
	{
		System.out.println(noOfCases);
		System.out.println(noOfStaffs);
		court2.display();
		
	}

}
