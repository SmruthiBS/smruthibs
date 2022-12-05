package com.xworkx.interfaces.boot;

import com.xworkx.interfaces.fallowers.Visitor;
import com.xworkx.interfaces.governer.HospitalManagement;
import com.xworkx.interfaces.rules.HospitalRule;

public class HospitalManagementRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HospitalRule rule=new Visitor();
HospitalManagement management=new HospitalManagement(rule);
management.ruleCheck();
	}

}
