package com.xworkz.abstraction.boot;

import com.xworkz.abstraction.child.SbiAtm;
import com.xworkz.abstraction.example.Atm;

public class AtmRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Atm atm=new SbiAtm();
atm.checkBalance();
atm.withdraw();
	}

}
