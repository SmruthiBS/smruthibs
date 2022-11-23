package com.xworkz.equal.examples;

public class Paint {
	private String brand;
	private String colour;
	private double price;
	private String type;
	private double quantity;
	private boolean quality;
	private double rating;
	private String soldBy; 
	private boolean nonToxic;
	private String packaageType;
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
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
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getQuantity() {
		return quantity;
	}
	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}
	public boolean isQuality() {
		return quality;
	}
	public void setQuality(boolean quality) {
		this.quality = quality;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	public String getSoldBy() {
		return soldBy;
	}
	public void setSoldBy(String soldBy) {
		this.soldBy = soldBy;
	}
	public boolean isNonToxic() {
		return nonToxic;
	}
	public void setNonToxic(boolean nonToxic) {
		this.nonToxic = nonToxic;
	}
	public String getPackaageType() {
		return packaageType;
	}
	public void setPackaageType(String packaageType) {
		this.packaageType = packaageType;
	}
	public Paint() {
		System.out.println("default constructor of class paint");
	}
	public Paint(String brand, String colour, double price, String type, double quantity, boolean quality,
			double rating, String soldBy, boolean nonToxic, String packaageType) {
		this();
		this.brand = brand;
		this.colour = colour;
		this.price = price;
		this.type = type;
		this.quantity = quantity;
		this.quality = quality;
		this.rating = rating;
		this.soldBy = soldBy;
		this.nonToxic = nonToxic;
		this.packaageType = packaageType;
	}
	@Override
	public String toString() {
		return "Paint [brand=" + brand + ", colour=" + colour + ", price=" + price + ", type=" + type + ", quantity="
				+ quantity + ", quality=" + quality + ", rating=" + rating + ", soldBy=" + soldBy + ", nonToxic="
				+ nonToxic + ", packaageType=" + packaageType + "]";}
	
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("running equals method");
		if(obj instanceof Paint)//check if instance of same class
		{
			System.out.println("obj is the instance paint can check properties");
		
		Paint casted=(Paint)obj;//casting from object to paint
		if(this.brand.equals(casted.brand)) {
			System.out.println("brand is same");
			return true;
		}
		else {
			System.out.println("obj is not an instance of paint");
		}
	
		}
		return false;
	}
}
	

	
	


