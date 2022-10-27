package com.xworkz.association.examples;

public class Mountain {
	public String name;
	public Location location=new Location("Chamundi Hill Rd", "mysore", "karnataka",577201, "india");
	public double height;
	public Temple temple=new Temple("chamundeshwari temple", "sudakar dixit", 7400, 1340) {
	} ;
	 
	
	public Mountain(String name, double height) {
		super();
		this.name = name;
		this.height = height;
	}
	public void showoff()
	{
		System.out.println("name of mountain; "+this.name);
		if(location!=null) {
		this.location.showoff();}
		else
			System.out.println("location is null");
		System.out.println("height ; "+this.height);
		if(temple!=null) {
		this.temple.showoff();}
		else
			System.out.println("temple is null");
	}
	

}
