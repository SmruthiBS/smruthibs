package com.xworkz.inheitance.boot;

import com.xworkz.inheitance.child.court.DistrictCourt;
import com.xworkz.inheitance.child.court.HighCourt;
import com.xworkz.inheitance.child.court.SupremeCourt;
import com.xworkz.inheitance.examples.court.Court;

public class CourtRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Court court1=new DistrictCourt();
		DistrictCourt districtcourt=(DistrictCourt)court1;
		court1.display();
		Court court2=new HighCourt(10,20);
		HighCourt highcourt=(HighCourt)court2;
		court1.display();
		SupremeCourt court3=new SupremeCourt();
		SupremeCourt supremecourt=(SupremeCourt)court3;
		court3.display();
		
	}

}

