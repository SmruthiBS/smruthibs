package com.xworkz.association.examples;

public class Brand {
public String name;
public String gstNo;
public float rating;
public  Location location=new Location("dr rajkumar road","banglore","karnataka",577201,"india");


public Brand(String name, String gstNo, float rating) {
	super();
	this.name = name;
	this.gstNo = gstNo;
	this.rating = rating;
}


public void showoff() {
	System.out.println(this.name);
	System.out.println(this.gstNo);
	System.out.println(this.rating);
	if(location!=null) {
	this.location.showoff();}
	else
		System.out.println("location is null");
}


}
