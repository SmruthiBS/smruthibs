package com.xworkx.interfaces.boot;

import com.xworkx.interfaces.fallowers.Passanger;
import com.xworkx.interfaces.governer.BMRCL;
import com.xworkx.interfaces.rules.MetroRule;

public class MetroRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MetroRule rule=new Passanger();
		BMRCL bmrcl=new BMRCL(rule);
		bmrcl.checkCustomer();

	}

}
