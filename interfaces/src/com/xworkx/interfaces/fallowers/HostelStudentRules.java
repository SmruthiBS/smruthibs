package com.xworkx.interfaces.fallowers;

import com.xworkx.interfaces.rules.HostelRules;

public class HostelStudentRules implements HostelRules {

	@Override
	public int closingTime(int time) {
System.out.println("running closingtime method");
System.out.println("closing time of hostel is "+time);
		return time;
	}

	@Override
	public boolean noVisitors() {
System.out.println("running method novisitors");
		return true;
	}

	@Override
	public boolean noOutingWithodPermession() {
		System.out.println("running method  noOutingWithodPermession");
		
		return false;
	}

	@Override
	public boolean noChangerooms() {
		System.out.println("running method novisitors noChangerooms ");
		return false;
	}

	@Override
	public boolean noPhone() {
		System.out.println("running method nophone");
		// TODO Auto-generated method stub
		return false;
	}

}
