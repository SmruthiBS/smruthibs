package com.xworkx.interfaces.fallowers;

import com.xworkx.interfaces.rules.CompanyRule;

public class StaffCompanyRule implements CompanyRule {
@Override
	public boolean idcard() {
		System.out.println("running idcard method");
		return true;
	}

	@Override
	public boolean dresscode() {
		System.out.println("running dresscode method");
		return true;
	}

	@Override
	public boolean ontime() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean permessionforleave() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean target() {
		// TODO Auto-generated method stub
		return false;
	}

}
