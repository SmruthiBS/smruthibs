package com.xworkz.equal.examples;

public class WaterBottle {
private String brand;
private String colour;
private double capacity;
private String material;
private double weight;
private String dimenssion;
private boolean quality;
private int quantity;
private String shape;
private double price;
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
public double getCapacity() {
	return capacity;
}
public void setCapacity(double capacity) {
	this.capacity = capacity;
}
public String getMaterial() {
	return material;
}
public void setMaterial(String material) {
	this.material = material;
}
public double getWeight() {
	return weight;
}
public void setWeight(double weight) {
	this.weight = weight;
}
public String getDimenssion() {
	return dimenssion;
}
public void setDimenssion(String dimenssion) {
	this.dimenssion = dimenssion;
}
public boolean isQuality() {
	return quality;
}
public void setQuality(boolean quality) {
	this.quality = quality;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}
public String getShape() {
	return shape;
}
public void setShape(String shape) {
	this.shape = shape;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public WaterBottle() {
	System.out.println("default constructor of waterbottel");
}
public WaterBottle(String brand, String colour, double capacity, String material, double weight, String dimenssion,
		boolean quality, int quantity, String shape, double price) {
	super();
	this.brand = brand;
	this.colour = colour;
	this.capacity = capacity;
	this.material = material;
	this.weight = weight;
	this.dimenssion = dimenssion;
	this.quality = quality;
	this.quantity = quantity;
	this.shape = shape;
	this.price = price;
}
@Override
public String toString() {
	return "WaterBottle [brand=" + brand + ", colour=" + colour + ", capacity=" + capacity + ", material=" + material
			+ ", weight=" + weight + ", dimenssion=" + dimenssion + ", quality=" + quality + ", quantity=" + quantity
			+ ", shape=" + shape + ", price=" + price + "]";
}

@Override
	public boolean equals(Object obj) {
		System.out.println("calling equals of class waterbottel");
		if(obj instanceof WaterBottle) {
			System.out.println("obj is instance of water bottel can check properties");
			WaterBottle casted=(WaterBottle)obj;
			if(this.brand.equals( casted.brand)&&this.colour.equals(casted.colour));
			{
				System.out.println("brand and colour are same");
				return true;
			}
		}
		else {
			System.out.println("not a instance of water bottel");
		}
		return false;
}
}
		


