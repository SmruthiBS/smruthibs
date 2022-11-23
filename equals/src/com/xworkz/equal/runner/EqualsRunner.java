package com.xworkz.equal.runner;

import com.xworkz.equal.examples.Currency;
import com.xworkz.equal.examples.God;
import com.xworkz.equal.examples.Hospital;
import com.xworkz.equal.examples.Institution;
import com.xworkz.equal.examples.Lipstick;
import com.xworkz.equal.examples.Paint;
import com.xworkz.equal.examples.Vechile;
import com.xworkz.equal.examples.WaterBottle;

public class EqualsRunner {
	public static void main(String[] args) {
		boolean equals;
		Paint paint1= new Paint();
		paint1.setBrand("doms");
		paint1.setColour("multi");
		paint1.setNonToxic(true);
		paint1.setPackaageType("pallate");
		paint1.setPrice(100);
		paint1.setQuality(true);
		paint1.setQuantity(1);
		paint1.setRating(4);
		paint1.setSoldBy("cocoblu retail");
		paint1.setType("water colour");
		System.out.println(paint1);
		Paint paint2=new Paint("doms","red",200,"water colour",2,true,3,"doms",true,"bottle");
		System.out.println(paint2);
		 equals=paint1.equals(paint2);
		System.out.println(equals);
		System.out.println("------------------------------------------------------------------------------------");
		//instance of class vechile
		Vechile vechile1=new Vechile();
		vechile1.setColour("red");
		vechile1.setCompany("tesla");
		vechile1.setEfficient(true);
		vechile1.setFuel("electricity");
		vechile1.setModel("model 2");
		vechile1.setModeOfTransport("road");
		vechile1.setNoOfPassangers(6);
		vechile1.setNoOfWheels(4);
		vechile1.setPrice(1000000000);
		vechile1.setType("car");
		System.out.println(vechile1);
		Vechile vechile2=new Vechile("car","tesla"," Model S","black",100000000,"electricity",4,6,"road",true);
		System.out.println(vechile2);
		equals=vechile1.equals(vechile2);//invoking equals method
		System.out.println(equals);
	
		System.out.println("------------------------------------------------------------------------------------");
		//instance of waterbottel
		WaterBottle bottel1=new WaterBottle("cello9", "black", 500, "plastic", 100, "10X20X30", true, 1,"cylinder", 0);
		System.out.println(bottel1);
		WaterBottle bottel2=new WaterBottle("cello9", "black", 500, "plastic", 100, "10X20X30", true, 1,"cylinder", 0);
		System.out.println(bottel2);
		equals=bottel1.equals(bottel2);
		System.out.println(equals);
		System.out.println("------------------------------------------------------------------------------------");
		Currency currency1 = new Currency("doller", "US", 50, '$', true, 81.71d, "paper","Ecuador, El Salvador, Zimbabwe,..");
		Currency currency2 = new Currency("doller", "US", 50, '$', true, 81.71d, "paper","Ecuador, El Salvador, Zimbabwe,..");


		
		boolean same = currency1.equals(currency2);
		System.out.println(same);
		//instance of god
		System.out.println("------------------------------------------------------------------------------------");
		God god1=new God("shiva", "parvathi", "kill evil", "nandi", "rudra", "kedarnath","trisula", 2, "ladak", "ganesha");
		System.out.println(god1);
		God god2=new God("shiva", "parvathi", "kill evil", "nandi", "rudra", "kashi","trisula", 2, "kashi", "ganesha");
		System.out.println(god2);
		equals=god1.equals(god2);
		System.out.println(equals);
		System.out.println("------------------------------------------------------------------------------------");
		//instance of institution
		Institution inst1=new Institution("xworkz","omkar",2018,"rajajinagar","BTM","akshara","xworkz.com",9886971483l,500,5);
		System.out.println(inst1);
		Institution inst2=new Institution("xworkz","omkar",2018,"rajajinagar","BTM","akshara","xworkz.com",9886971483l,500,5);
		System.out.println(inst2);
		equals=inst1.equals(inst2);
		System.out.println(equals);
		//instance of hospital
		System.out.println("------------------------------------------------------------------------------------");
		Hospital hospital1=new Hospital("appolo", "banglore", "dhanush",10, 20, 5, 60, "appolo.com", 9449498848l);
		System.out.println(hospital1);
		Hospital hospital2=new Hospital("appolo", "banglore", "dhanush",10, 20, 5, 60, "appolo.com", 9449498848l);
		System.out.println(hospital2);
		equals=hospital1.equals(hospital2);
		System.out.println(equals);
		//instance of hospital
				System.out.println("------------------------------------------------------------------------------------");
				Lipstick lipstick1=new Lipstick("l18", "pink", "peach", 1, 200, 4, true, "mate", 6);
				System.out.println(lipstick1);
				Lipstick lipstick2=new  Lipstick("l18", "pink", "peach", 1, 200, 4, true, "mate", 6);
				System.out.println(lipstick2);
				equals=lipstick1.equals(lipstick2);
				System.out.println(equals);
		
		
	


		
		
	}

}
