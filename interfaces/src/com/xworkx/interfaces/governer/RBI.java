package com.xworkx.interfaces.governer;

import com.xworkx.interfaces.fallowers.BankStaff;
import com.xworkx.interfaces.rules.BankRule;

public class RBI {
	private BankRule bankrule=new BankStaff();

	public RBI(BankRule bankrule) {
		super();
		this.bankrule = bankrule;
	}
	public void checkCustomer() {
		System.out.println("running check customer");
		if(this.bankrule!=null) {
			boolean balance=this.bankrule.balance();
			boolean account=this.bankrule.account();
			boolean sign=this.bankrule.checkSign();
			boolean smoke=this.bankrule.smoking();
			boolean time=this.bankrule.time();
			if(balance==true && account==true&& sign&&true &&smoke==false &&time==true) {
				System.out.println("all rules are fallowed");
			}
			else {
				System.out.println("all the rules are not fallowed");
			}
			
		}
	}

}
