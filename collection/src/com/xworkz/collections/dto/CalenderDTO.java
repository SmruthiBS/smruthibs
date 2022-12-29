package com.xworkz.collections.dto;

public class CalenderDTO {
private String name;
private int year;
private double price;
public CalenderDTO(String name, int year, double price) {
	super();
	this.name = name;
	this.year = year;
	this.price = price;
}
public CalenderDTO() {
	super();
}
@Override
public String toString() {
	return "CalenderDTO [name=" + name + ", year=" + year + ", price=" + price + "]";
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getYear() {
	return year;
}
public void setYear(int year) {
	this.year = year;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}


}
