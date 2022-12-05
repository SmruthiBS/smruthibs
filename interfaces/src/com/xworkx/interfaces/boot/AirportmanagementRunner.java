package com.xworkx.interfaces.boot;

import com.xworkx.interfaces.fallowers.Traveller;
import com.xworkx.interfaces.governer.AirportAuthority;
import com.xworkx.interfaces.rules.AirportRule;

public class AirportmanagementRunner {
	public static void main(String[] args) {
	AirportRule rule=new Traveller();
	AirportAuthority management=new AirportAuthority(rule);
	management.ruleCheck();
	
	}
}
