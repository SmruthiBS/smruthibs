package com.xworkx.interfaces.fallowers;

import com.xworkx.interfaces.rules.HospitalRule;

public class Visitor  implements  HospitalRule{

	@Override
	public boolean smoking() {
		System.out.println("running smoking");
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean maintainsilence() {
		System.out.println("running silence");
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean appointment() {
		System.out.println("running appointment");
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean noEntry() {
		System.out.println("running noEntry");
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean permission() {
		System.out.println("running permission");
		// TODO Auto-generated method stub
		return true;
	}

}
