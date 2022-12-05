package com.xworkx.interfaces.fallowers;

import com.xworkx.interfaces.rules.BankRule;

public class BankStaff  implements BankRule{

	@Override
	public boolean balance() {
		System.out.println("running balance");
		return true;
	}

	@Override
	public boolean smoking() {
		// TODO Auto-generated method stub
		System.out.println("running smoking");
		return false;
	}

	@Override
	public boolean time() {
		// TODO Auto-generated method stub
		System.out.println("running time");
		return true;
	}

	@Override
	public boolean checkSign() {
		// TODO Auto-generated method stub
		System.out.println("running checksign");
		return true;
	}

	@Override
	public boolean account() {
		System.out.println("running account");
		return true;
	}

}
