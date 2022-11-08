package com.xworkz.inheitance.boot;

import com.xworkz.inheitance.child.Money;
import com.xworkz.inheitance.examples.Dowry;

public class DowryRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dowry dowry=new Money("bride", 1000000, "groom");
		dowry.display();

	}

}
