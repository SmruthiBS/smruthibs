package com.xworkz.access_specifer.boot;

import com.xworkz.access_specifer.examples.car.Car;
import com.xworkz.access_specifer.examples.car.Owner;


public class CarRunner {
	public static void main( String[] args){
	
	Owner owner=new Owner();
	Car car=new Car();
	owner.use();
	System.out.println(car.getbrand());
	System.out.println(car.getmodel());
	System.out.println(car.getOwner());
	System.out.println(car.getno());
	System.out.println(car.getnoOfseats());
	System.out.println(car.getNoOfpeople());
	System.out.println(car.getown());
	System.out.println(car.getOwner());
	System.out.println(car.getRent());
	System.out.println(car.getRented());
}
}
