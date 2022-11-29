package com.xworkx.interfaces.fallowers;

import com.xworkx.interfaces.rules.CircketRules;

public class PlayerCricketRules implements CircketRules
{

	@Override
	public int ofplayers() {
	System.out.println("running no of players method");
		return 0;
	}

	@Override
	public boolean noball() {
	System.out.println("running no ball method");
		return false;
	}

}
