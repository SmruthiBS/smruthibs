package com.xworkx.interfaces.governer;

import com.xworkx.interfaces.fallowers.Passanger;
import com.xworkx.interfaces.rules.MetroRule;

public class BMRCL {
	private MetroRule rule= new Passanger();

	public BMRCL(MetroRule rule) {
		super();
		this.rule = rule;
	}
	public void checkCustomer() {
		System.out.println("running check customer");
		if(this.rule!=null) {
			boolean balance=this.rule.checkBag();
			boolean account=this.rule.checking();
			boolean time=this.rule.time();
			boolean token=this.rule.useToken();
			boolean mask=this.rule.wearMask();
			if(balance==true && account==true&& time&&true &&token==false &&mask==true) {
				System.out.println("all rules are fallowed");
			}
			else {
				System.out.println("all the rules are not fallowed");
			}
			
		}
	}

}
