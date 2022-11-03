package com.xworkz.access_specifer.examples.island;

public class Visitor {
	Island island=new Island();
	public void display() {
		System.out.println(island.getArea());
	island.setArea(500);
	System.out.println(island.getBookingContact());
	island.setBookingContact(9986448575l);
	System.out.println(island.getBookingWebsite());
	island.setBookingWebsite("malpeboating.com");
	System.out.println(island.getCity());
	island.setCity("udupi");
	System.out.println(island.getArea());
	island.setModeOfTransport("boats");
	System.out.println(island.getName());
	island.setName("st mary's");
	System.out.println(island.getNoVisitors());
	island.setNoVisitors(100);
	System.out.println(island.getOverallingRating());
	island.setOverallingRating(3);
	System.out.println(island.getPrice());
	island.setPrice(850);
	System.out.println(island.getState());
	island.setState("karnataka");
	
	
	}
		
		
	
}


