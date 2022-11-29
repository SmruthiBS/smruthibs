package com.xworkx.interfaces.fallowers;

import com.xworkx.interfaces.rules.SchoolRules;

public class StudentSchoolRules implements SchoolRules {

	@Override
	public boolean uniform() {
		System.out.println("running uniform method");
		return false;
	}

	@Override
	public int assembly(int time) {
		System.out.println("running assembly method");
		System.out.println("assembly is at "+time);
		return time;
	}

	@Override
	public boolean ontime() {
System.out.println("running ontime method");
		return false;
	}

	@Override
	public boolean idcard() {
		System.out.println("running id card method");
		return false;
	}

	@Override
	public boolean attendclass() {
System.out.println("running attend class method");
		return false;
	}

}
