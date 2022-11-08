package com.xworkz.inheitance.child.court;

import com.xworkz.inheitance.examples.court.Court;

public class DistrictCourt extends Court{

	public int noOfWorkingDays=220;
	public int workingHours=8;
	Court court3=new Court();
	public void display() {
		System.out.println(noOfWorkingDays);
		System.out.println(workingHours);
		court3.display();
		
	}
}


