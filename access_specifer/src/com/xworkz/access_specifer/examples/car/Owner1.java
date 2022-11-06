package com.xworkz.access_specifer.examples.car;

public class Owner {
	Car car=new Car();
	public String name;
	public void use() {
		System.out.println("initial values");
		System.out.println(car.getcolour());
		System.out.println(car.getbrand());
		System.out.println(car.getmodel());
		System.out.println(car.getno());
		System.out.println(car.getnoOfseats());
		System.out.println(car.getNoOfpeople());
		System.out.println(car.getown());
		System.out.println(car.getOwner());
		System.out.println(car.getRent());
		System.out.println(car.getRented());
		System.out.println("modifiying the values");
		car.setbrand("ford");
		car.setmodel("2013edge");
		car.setOwner("hita");
		car.setNo("ka184563");
		car.setNoseats(5);
		car.setNoOfpeople(4);
		car.setOwn(false);
		car.setRented(true);
		car.setOwner("ramesh");
		car.setRent(10000);
		car.setprice(6000000);
		System.out.println("after modifying");
		System.out.println("final values");
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
