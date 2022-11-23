package com.xworkz.equal.examples;

public class Lipstick {
	private String brand;
	private String colour;
	private String shade;
	private int quantity;
	private double price;;
	private int rating;
	private boolean quality;
	private String type;
	private int shadeCode;
	
	public Lipstick(String brand, String colour, String shapde, int quantity, double price, int rating, boolean quality,
			String type, int shadeCode) {
		super();
		this.brand = brand;
		this.colour = colour;
		this.shade = shade;
		this.quantity = quantity;
		this.price = price;
		this.rating = rating;
		this.quality = quality;
		this.type = type;
		this.shadeCode = shadeCode;
	}

	public Lipstick() {
		super();
	}

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

	public String getShade() {
		return shade;
	}

	public void setShade(String shade) {
		this.shade = shade;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public boolean isQuality() {
		return quality;
	}

	public void setQuality(boolean quality) {
		this.quality = quality;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getShadeCode() {
		return shadeCode;
	}

	public void setShadeCode(int shadeCode) {
		this.shadeCode = shadeCode;
	}

	@Override
	public String toString() {
		return "Lipstick [brand=" + brand + ", colour=" + colour + ", shade=" + shade + ", quantity=" + quantity
				+ ", price=" + price + ", rating=" + rating + ", quality=" + quality + ", type=" + type + ", shadeCode="
				+ shadeCode + "]";
	}
@Override
public boolean equals(Object obj) {
	// TODO Auto-generated method stub
	System.out.println("running equals of lipstick");
	if(obj instanceof Lipstick) {
		System.out.println("obj is instance of lipstick");
		Lipstick casted= (Lipstick)obj;
		if(this.brand.equals(casted.brand) && this.price==casted.price&&this.colour.equals(casted.colour)&&this.price==casted.price);
		

		System.out.println("both instances are same");
		return true;
	}
	else {
		System.out.println("obj not a instance of lipstick");
		return false;
	}

}
}

