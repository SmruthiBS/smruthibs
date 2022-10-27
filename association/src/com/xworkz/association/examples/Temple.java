package com.xworkz.association.examples;

public abstract class Temple {
	public String name;
	public God god = new God("Chamundeshwari","female","kill the evil");
	public String mainPriest;
	public int noOfVisitors;
	public double collectionPerDay;
	
	public Temple(String name, String mainPriest, int noOfVisitors, double collectionPerDay) {
		super();
		this.name = name;
		this.mainPriest = mainPriest;
		this.noOfVisitors = noOfVisitors;
		this.collectionPerDay = collectionPerDay;
	}

	public void showoff() {
		System.out.println("name of temple: "+this.name);
		this.god.showoff();
		System.out.println("main priest : "+this.mainPriest);
		System.out.println("no of visitors: "+this.noOfVisitors);
		System.out.println("collection: "+this.collectionPerDay);
	}
	

}
