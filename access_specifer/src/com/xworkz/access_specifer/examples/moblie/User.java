package com.xworkz.access_specifer.examples.moblie;

import com.xworkz.access_specifer.examples.Jeep.Jeep;

public class User {
	public String name;
	Mobile mobile=new Mobile();
	public void use() {
		System.out.println("initial values");
		System.out.println(mobile.getcolour());
		System.out.println(mobile.getbrand());
		System.out.println(mobile.getmodel());
		System.out.println(mobile.getRating());
		System.out.println(mobile.getnoOfcameras());
		System.out.println(mobile.getos());
		System.out.println(mobile.getWorking());
		System.out.println(mobile.getOwner());
		System.out.println(mobile.getmemory());
		System.out.println(mobile.getPrice());
		System.out.println("modifiying the values");
	mobile.setbrand("samsung");
	mobile.setmodel("galaxy m32 prime");
	mobile.setOwner("hita");
	mobile.setcameras(3);
	mobile.setMemory(64);
	mobile.setOs("android 12");
	mobile.setprice(13499);
	mobile.setcolour("black");
	mobile.setScreenSize(6.4f);
	mobile.setWorking(true);
	mobile.setRating(3);
		System.out.println("after modifying");
		System.out.println("final values");
		System.out.println(mobile.getcolour());
		System.out.println(mobile.getbrand());
		System.out.println(mobile.getmodel());
		System.out.println(mobile.getRating());
		System.out.println(mobile.getnoOfcameras());
		System.out.println(mobile.getos());
		System.out.println(mobile.getWorking());
		System.out.println(mobile.getOwner());
		System.out.println(mobile.getmemory());
		System.out.println(mobile.getPrice());
		
		
	}

}
