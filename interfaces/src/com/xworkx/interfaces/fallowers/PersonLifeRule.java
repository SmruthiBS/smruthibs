package com.xworkx.interfaces.fallowers;

import com.xworkx.interfaces.rules.LifeRules;

public class PersonLifeRule implements LifeRules {

	@Override
	public boolean letItGo() {
		System.out.println("let it go");
		return false;
	}

	@Override
	public boolean StayCalm() {
		System.out.println("stay calm");
		return false;
	}

	@Override
	public boolean BeHonest() {
		// TODO Auto-generated method stub
		System.out.println("be honest");
		return false;
	}

	@Override
	public boolean bePositive() {
		// TODO Auto-generated method stub
		System.out.println("be positive");
		return false;
	}

	@Override
	public boolean DoNotCompare() {
		System.out.println("do not compare yourself");
		return false;
	}

}
