package com.xworkx.interfaces.fallowers;

import com.xworkx.interfaces.rules.AirportRule;

public class Traveller implements AirportRule {

	@Override
	public boolean mask() {
		System.out.println("running mask");
		return false;
	}

	@Override
	public boolean checkBag() {
		// TODO Auto-generated method stub
		System.out.println("running checkBag");
		return false;
	}

	@Override
	public boolean scanning() {
		// TODO Auto-generated method stub
		System.out.println("running scanning");
		return false;
	}

	@Override
	public boolean onTime() {
		// TODO Auto-generated method stub
		System.out.println("running onTime");
		return false;
	}

	@Override
	public boolean ticket() {
		// TODO Auto-generated method stub
		System.out.println("running ticket");
		return false;
	}

}
