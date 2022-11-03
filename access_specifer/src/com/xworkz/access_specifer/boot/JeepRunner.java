package com.xworkz.access_specifer.boot;

import com.xworkz.access_specifer.examples.Jeep.Jeep;
import com.xworkz.access_specifer.examples.Jeep.Owner;

public class JeepRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Jeep jeep=new Jeep();
		Owner owner=new Owner();
		System.out.println(jeep.getbrand());
		System.out.println(jeep.getmodel());
		System.out.println(jeep.getOwner());
		System.out.println(jeep.getno());
		System.out.println(jeep.getnoOfseats());
		System.out.println(jeep.getNoOfpeople());
		System.out.println(jeep.getown());
		System.out.println(jeep.getOwner());
		System.out.println(jeep.getRent());
		System.out.println(jeep.getRented());
		owner.use();
	}

}
