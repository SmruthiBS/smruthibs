package com.xworkz.equal.examples;

public class Vechile {

	private String type;
	private String company;
	private String model;
	private String colour;
	private double price;
	private String fuel;
	private int noOfWheels;
	private int noOfPassangers;
	private String modeOfTransport;
	private boolean efficient;
	public Vechile() {
		System.out.println("default constructor of class Vechile");
	}
	public Vechile(String type, String company, String model, String colour, double price, String fuel, int noOfWheels,
			int noOfPassangers, String modeOfTransport, boolean efficient) {
		super();
		this.type = type;
		this.company = company;
		this.model = model;
		this.colour = colour;
		this.price = price;
		this.fuel = fuel;
		this.noOfWheels = noOfWheels;
		this.noOfPassangers = noOfPassangers;
		this.modeOfTransport = modeOfTransport;
		this.efficient = efficient;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getFuel() {
		return fuel;
	}
	public void setFuel(String fuel) {
		this.fuel = fuel;
	}
	public int getNoOfWheels() {
		return noOfWheels;
	}
	public void setNoOfWheels(int noOfWheels) {
		this.noOfWheels = noOfWheels;
	}
	public int getNoOfPassangers() {
		return noOfPassangers;
	}
	public void setNoOfPassangers(int noOfPassangers) {
		this.noOfPassangers = noOfPassangers;
	}
	public String getModeOfTransport() {
		return modeOfTransport;
	}
	public void setModeOfTransport(String modeOfTransport) {
		this.modeOfTransport = modeOfTransport;
	}
	public boolean isEfficient() {
		return efficient;
	}
	public void setEfficient(boolean efficient) {
		this.efficient = efficient;
	}
	@Override
	public String toString() {
		return "Vechile [type=" + type + ", company=" + company + ", model=" + model + ", colour=" + colour + ", price="
				+ price + ", fuel=" + fuel + ", noOfWheels=" + noOfWheels + ", noOfPassangers=" + noOfPassangers
				+ ", modeOfTransport=" + modeOfTransport + ", efficient=" + efficient + "]";
	}
	@Override
	public boolean equals(Object obj) {
		System.out.println("running equals method of class vechile");
		if(obj instanceof Vechile) {
			System.out.println("obj is instance of vechile can check properties");
		}
		Vechile casted=(Vechile)obj;
		if(this.company.equals( casted.company)&&this.model.equals( casted.model) && this.type.equals( casted.type)&&this.fuel.equals( casted.fuel))
		{
			System.out.println("company,model,type and fuel are same");
			return true;
		}
		else
		{
			System.out.println("obj is not an instance of vechile");
		}
		return false;
		
	
	}
	
}
