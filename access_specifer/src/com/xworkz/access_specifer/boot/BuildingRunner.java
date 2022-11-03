package com.xworkz.access_specifer.boot;

import com.xworkz.access_specifer.examples.building.Building;
import com.xworkz.access_specifer.examples.house.House;
import com.xworkz.access_specifer.examples.house.contractor;

public class BuildingRunner {
	public static void main( String[] args){
	House house=new House();
	contractor builder=new contractor();
	Building building=new Building();
	builder.use();
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
