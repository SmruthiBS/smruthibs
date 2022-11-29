package com.xworkx.interfaces.fallowers;

import com.xworkx.interfaces.rules.CovidRules;

public class PeopleCovidRules implements CovidRules  {

	@Override
	public boolean wearMask() {
		System.out.println("running method wear mask ");
		return false;
	}

	@Override
	public boolean socialDistancing() {
		System.out.println("running method  social distancing");
		return false;
	}

	@Override
	public boolean useHandSanitizer() {
		System.out.println("running method  use hand santizer");
		return false;
	}

	@Override
	public boolean quarintine() {
		System.out.println("running method  quarintine");
		return false;
	}

	@Override
	public boolean getVacination() {
		System.out.println("running method  vacination");
		return false;
	}

}
