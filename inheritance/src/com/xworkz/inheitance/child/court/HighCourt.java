package com.xworkz.inheitance.child.court;

import com.xworkz.inheitance.examples.court.Court;

public class HighCourt extends Court{
	public int noOfLawers;
	public int noOfCases;
	Court court1=new Court();
	public HighCourt(int noOfLawers, int noOfCases) {
		this.noOfLawers=noOfLawers;
		this.noOfCases=noOfCases;
	}
	public void dispay() {
		court1.display();
		System.out.println(noOfCases);
		System.out.println(noOfLawers);
		
	}
	
	

}
