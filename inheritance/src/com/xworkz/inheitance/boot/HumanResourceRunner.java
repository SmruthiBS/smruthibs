package com.xworkz.inheitance.boot;

import com.xworkz.inheitance.child.HR.Akshara;

public class HumanResourceRunner {

	public static void main(String[] args) {
		Akshara akshara =new Akshara();
		akshara.hire();
		akshara.fire();
		akshara.hire("suresh");
	}

}
