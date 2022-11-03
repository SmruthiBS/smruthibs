package com.xworkz.access_specifer.lunch;

public class Owner {
	public String ownerName = "Rajanna";
	public int age = 54;
	public Lunch lunch = new Lunch();

	public void useLunchInfo(Lunch lunch) {
		this.lunch = lunch;

		System.out.println(ownerName);
		System.out.println(age);

		System.out.println("Lunch information befor");

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

		lunch.setProperties("Ambika", 500, 1, "tomato soup", "Meals", "NA", false, "chips", false, 333, "Nayana",
				"Nov1", 5);

		System.out.println("Lunch information after Modification");

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
