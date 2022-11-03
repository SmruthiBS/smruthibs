package com.xworkz.access_specifer.examples.house;

public class contractor {
	House house=new House();
	public String name;
	public void use() {
		System.out.println("initial values");
		System.out.println(house.getHead());
		System.out.println(house.getLocation());
		System.out.println(house.getName());
		System.out.println(house.getno());
		System.out.println(house.getnoOfChildren());
		System.out.println(house.getNoOfpeople());
		System.out.println(house.getown());
		System.out.println(house.getOwner());
		System.out.println(house.getRent());
		System.out.println(house.getRented());
		System.out.println("modifiying the values");
		house.setHead("hita");
		house.setLocation("banglore");
		house.setName("kanasu");
		house.setNo(5);
		house.setNoChildren(3);
		house.setNoOfpeople(6);
		house.setOwn(false);
		house.setRented(true);
		house.setOwner("ramesh");
		house.setRent(10000);
		house.setWard(6);
		System.out.println("after modifying");
		System.out.println("initial values");
		System.out.println(house.getHead());
		System.out.println(house.getLocation());
		System.out.println(house.getName());
		System.out.println(house.getno());
		System.out.println(house.getnoOfChildren());
		System.out.println(house.getNoOfpeople());
		System.out.println(house.getown());
		System.out.println(house.getOwner());
		System.out.println(house.getRent());
		System.out.println(house.getRented());
		
	}

}
