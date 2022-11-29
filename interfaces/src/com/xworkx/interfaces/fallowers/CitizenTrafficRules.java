package com.xworkx.interfaces.fallowers;

import com.xworkx.interfaces.rules.TrafficRules;

public class CitizenTrafficRules  implements TrafficRules{

	@Override
	public boolean seatBelt() {
	System.out.println("running method seatBelt");
		return false;
	}

	@Override
	public int usingPhone(int fine) {
		System.out.println("running method usingphone");
		System.out.println("fine for not following this rule is "+fine);
		return fine;
	}

	@Override
	public boolean sppeding() {
		System.out.println("running method sppeding");
		return false;
	}

	@Override
	public boolean drinkAndDrive() {
		System.out.println("running method drinkanddrive");
		return false;
	}

	@Override
	public boolean stopSign() {
		System.out.println("running method stopsign");
		return false;
	}

}
