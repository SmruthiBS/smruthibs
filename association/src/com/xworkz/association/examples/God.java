package com.xworkz.association.examples;

public class God {
	public String name;
	public String gender;
	public String mainPower;
	public Weapon weapon=new Weapon("trisula", "kill the evil", 100);
	public God(String name, String gender, String mainPower) {
		super();
		this.name = name;
		this.gender = gender;
		this.mainPower = mainPower;
	}
	public void showoff() {
		System.out.println("name of god: "+this.name);
		System.out.println("main power: "+this.mainPower);
		System.out.println("gender: "+this.gender);
		this.weapon.showoff();
		
	}

}
