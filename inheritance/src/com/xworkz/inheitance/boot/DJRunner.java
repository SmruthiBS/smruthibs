package com.xworkz.inheitance.boot;

import com.xworkz.inheitance.child.DJ.ClubDJ;
import com.xworkz.inheitance.examples.DJ;

public class DJRunner {
	public static void main(String[] args) {
		DJ dj=new ClubDJ("banglore", 250, 1000);
		dj.display();
		
		
	}

}
