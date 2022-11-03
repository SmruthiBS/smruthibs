package com.xworkz.access_specifer.examples.building;

import com.xworkz.access_specifer.examples.house.House;

public class Owner {
Building building =new Building();
	public String name;
	public void use() {
		System.out.println("initial values");
		System.out.println(building.getHead());
		System.out.println(building.getLocation());
		System.out.println(building.getName());
		System.out.println(building.getno());
		System.out.println(building.getnoOfChildren());
		System.out.println(building.getNoOfpeople());
		System.out.println(building.getown());
		System.out.println(building.getOwner());
		System.out.println(building.getRent());
		System.out.println(building.getRented());
		System.out.println("modifiying the values");
		building.setHead("hita");
		building .setLocation("banglore");
		building.setName("kanasu");
		building.setNo(5);
		building.setNoChildren(3);
		building.setNoOfpeople(6);
		building.setOwn(false);
		building.setRented(true);
		building.setOwner("ramesh");
		building.setRent(10000);
		building.setWard(6);
		System.out.println("after modifying");
		System.out.println("initial values");
		System.out.println(building.getHead());
		System.out.println(building.getLocation());
		System.out.println(building.getName());
		System.out.println(building.getno());
		System.out.println(building.getnoOfChildren());
		System.out.println(building.getNoOfpeople());
		System.out.println(building.getown());
		System.out.println(building.getOwner());
		System.out.println(building.getRent());
		System.out.println(building.getRented());
		
	}


}
