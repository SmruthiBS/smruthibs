package com.xworkz.access_specifer.examples.laptop;

import com.xworkz.access_specifer.examples.moblie.Mobile;

public class user {
	public String name;
	Mobile mobile=new Mobile();
	laptop lap=new laptop();
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
	lap.setbrand("samsung");
	lap.setmodel("galaxy m32 prime");
	lap.setOwner("hita");
	lap.setcameras(3);
	lap.setMemory(64);
	lap.setOs("android 12");
	lap.setprice(13499);
	lap.setcolour("black");
	lap.setScreenSize(6.4f);
	lap.setWorking(true);
	lap.setRating(3);
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
