package com.xworkz.access_specifer.boot;



import com.xworkz.access_specifer.examples.house.House;
import com.xworkz.access_specifer.examples.house.contractor;

public class HouseRunner {
	public static void main( String[] args){
	House house=new House();
	contractor builder=new contractor();
	builder.use();
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
