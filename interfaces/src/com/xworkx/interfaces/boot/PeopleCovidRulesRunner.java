package com.xworkx.interfaces.boot;

import com.xworkx.interfaces.fallowers.PeopleCovidRules;
import com.xworkx.interfaces.rules.CovidRules;

public class PeopleCovidRulesRunner {

	public static void main(String[] args) {
		PeopleCovidRules covid =new PeopleCovidRules ();
		covid.getVacination();
		covid.quarintine();
		covid.socialDistancing();
		covid.useHandSanitizer();
		covid.wearMask();
		CovidRules rules= new PeopleCovidRules ();
		rules.getClass();
		rules.quarintine();
		rules.socialDistancing();
		rules.useHandSanitizer();
		rules.wearMask();
	}

}
