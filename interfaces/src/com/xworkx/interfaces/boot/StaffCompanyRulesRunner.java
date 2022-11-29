package com.xworkx.interfaces.boot;

import com.xworkx.interfaces.fallowers.StaffCompanyRule;
import com.xworkx.interfaces.rules.CompanyRule;

public class StaffCompanyRulesRunner {

	public static void main(String[] args) {
		StaffCompanyRule rules=new StaffCompanyRule();
		rules.dresscode();
		rules.idcard();
		rules.ontime();
		rules.permessionforleave();
		rules.target();
		CompanyRule company=new StaffCompanyRule();
		company.dresscode();
		company.idcard();
		company.ontime();
		company.permessionforleave();
		company.target();
		
	}

}
