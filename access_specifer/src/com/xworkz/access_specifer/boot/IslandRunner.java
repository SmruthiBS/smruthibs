package com.xworkz.access_specifer.boot;

import com.xworkz.access_specifer.examples.island.*;

public class IslandRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Island island = new Island();
		Visitor visitor = new Visitor();
		visitor.display();
		System.out.println(island.getArea());
		System.out.println(island.getBookingContact());
		System.out.println(island.getCity());
		System.out.println(island.getModeOfTransport());
		System.out.println(island.getName());
		System.out.println(island.getNoVisitors());
		System.out.println(island.getOverallingRating());
		System.out.println(island.getPrice());
		System.out.println(island.getState());
		System.out.println(island.getTimings());
		System.out.println(island.getBookingWebsite());
		




	}

}
