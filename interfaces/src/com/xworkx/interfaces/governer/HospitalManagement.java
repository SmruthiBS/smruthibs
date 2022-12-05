package com.xworkx.interfaces.governer;


import com.xworkx.interfaces.fallowers.Visitor;
import com.xworkx.interfaces.rules.HospitalRule;


public class HospitalManagement {
	private HospitalRule rule=new Visitor();

	 public HospitalManagement(HospitalRule rule) {
		super();
		this.rule = rule;
	}

	 public void ruleCheck() {
		if (this.rule!=null){
			boolean appointment=this.rule.appointment();
		boolean silence=this.rule.maintainsilence();
		boolean entry=this.rule.noEntry();
		boolean smoke=this.rule.smoking();
		boolean permission=this.rule.permission();
		if(permission==true&& silence==true&& appointment==true&&smoke==false &&entry==true) {
			System.out.println("all rules are fallowed");
		}
		else
		{
			System.out.println("all rules are not fallowed");
		}
		
	}

}

}
