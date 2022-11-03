package com.xworkz.access_specifer.boot;

import com.xworkz.access_specifer.examples.food.Consumer;
import com.xworkz.access_specifer.examples.food.Food;



public class FoodRunner {
public static void main(String[] args) {
		
		Food lunch = new Food
				();
	Consumer owner=new Consumer();
		
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
