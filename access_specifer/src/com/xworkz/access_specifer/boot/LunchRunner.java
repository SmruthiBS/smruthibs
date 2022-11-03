package com.xworkz.access_specifer.boot;

import com.xworkz.access_specifer.lunch.Lunch;
import com.xworkz.access_specifer.lunch.Owner;

public class LunchRunner {
	public static void main(String[] args) {
		
		Lunch lunch = new Lunch();
		Owner owner=new Owner();
		
		owner.useLunchInfo(lunch);
		System.out.println("Reading  private properties of another class(encapsulation)");
		System.out.println(lunch.getHotelName());
		System.out.println(lunch.getChat());
		System.out.println(lunch.getDiscount());
		System.out.println(lunch.getMainCourse());
		System.out.println(lunch.getOrderedBy());
		System.out.println(lunch.getOrderedOn());
		System.out.println(lunch.getOrderNo());
		System.out.println(lunch.getPrice());
		System.out.println(lunch.getQuantity());
		System.out.println(lunch.getSideDish());
		System.out.println(lunch.getStarters());
	}
	

}
