package com.xworkz.access_specifer.examples.Jeep;

public class Owner {
	public String name;
	Jeep jeep=new Jeep();
	public void use() {
		System.out.println("initial values");
		System.out.println(jeep.getcolour());
		System.out.println(jeep.getbrand());
		System.out.println(jeep.getmodel());
		System.out.println(jeep.getno());
		System.out.println(jeep.getnoOfseats());
		System.out.println(jeep.getNoOfpeople());
		System.out.println(jeep.getown());
		System.out.println(jeep.getOwner());
		System.out.println(jeep.getRent());
		System.out.println(jeep.getRented());
		System.out.println("modifiying the values");
		jeep.setbrand("suv");
		jeep.setmodel("sport");
		jeep.setOwner("hita");
		jeep.setNo("ka184563");
		jeep.setNoseats(5);
		jeep.setNoOfpeople(4);
		jeep.setOwn(false);
		jeep.setRented(true);
		jeep.setOwner("ramesh");
		jeep.setRent(10000);
		jeep.setprice(6000000);
		System.out.println("after modifying");
		System.out.println("final values");
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
		
	}

}
