package com.xworkx.interfaces.fallowers;

import com.xworkx.interfaces.rules.ArmyRules;

public class OfficerArmyRules implements ArmyRules {

	@Override
	public boolean wakeupEarly() {
		System.out.println("running method wake up early");
		return false;
	}

	@Override
	public boolean fit() {
		System.out.println("running method  fit");
		return false;
	}

	@Override
	public boolean citizen() {
		System.out.println("running method  citizen");
		return false;
	}

	@Override
	public boolean brave() {
		System.out.println("running method  brave");
		return false;
	}

	@Override
	public boolean training() {
		System.out.println("running method  training");
		return false;
	}

}
