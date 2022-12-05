package com.xworkx.interfaces.governer;

import com.xworkx.interfaces.fallowers.Traveller;
import com.xworkx.interfaces.rules.AirportRule;

public class AirportAuthority {
	private AirportRule rule=new Traveller();

	
	public AirportAuthority(AirportRule rule) {
		super();
		this.rule = rule;
	}


	public void ruleCheck() {
		if (this.rule!=null){
			boolean bag=this.rule.checkBag();
		boolean mask=this.rule.mask();
		boolean time=this.rule.onTime();
		boolean scan=this.rule.scanning();
		boolean ticket=this.rule.ticket();
		if(mask==true&& ticket==true&& time==true&&scan==true &&bag==true) {
			System.out.println("all rules are fallowed");
		}
		else
		{
			System.out.println("all rules are not fallowed");
		}
		
	}

}

}
