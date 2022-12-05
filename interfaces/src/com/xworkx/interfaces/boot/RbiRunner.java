package com.xworkx.interfaces.boot;

import com.xworkx.interfaces.fallowers.BankStaff;
import com.xworkx.interfaces.governer.RBI;
import com.xworkx.interfaces.rules.BankRule;

public class RbiRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankRule rule=new BankStaff();
		RBI rbi= new RBI(rule);
		rbi.checkCustomer();

	}

}
