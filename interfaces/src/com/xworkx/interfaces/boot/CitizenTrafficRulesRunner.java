package com.xworkx.interfaces.boot;

import com.xworkx.interfaces.fallowers.CitizenTrafficRules;
import com.xworkx.interfaces.rules.TrafficRules;

public class CitizenTrafficRulesRunner {
	public static void main(String[] args) {
		CitizenTrafficRules citizenTrafficRules=new CitizenTrafficRules();
		citizenTrafficRules.seatBelt();
		citizenTrafficRules.usingPhone(500);
		citizenTrafficRules.drinkAndDrive();
		citizenTrafficRules.sppeding();
		citizenTrafficRules.stopSign();
		TrafficRules rules= new CitizenTrafficRules();
		rules.seatBelt();
		rules.usingPhone(1000);
		rules.drinkAndDrive();
		rules.sppeding();
		rules.stopSign();
		
	}
	
	
	

}
