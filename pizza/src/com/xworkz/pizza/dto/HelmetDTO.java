package com.xworkz.pizza.dto;

import java.time.LocalDateTime;

import com.xworkz.pizza.constant.Color;
import com.xworkz.pizza.constant.Type;

public class HelmetDTO extends AbstractAuditDTO{
private String brand;
private Double price;
private Color colour;
private Type type;

public HelmetDTO(String brand, Double price, Color colour, Type type) {
	super();
	this.brand = brand;
	this.price = price;
	this.colour = colour;
	this.type = type;
}

@Override
public String toString() {
	return "HelmetDTO [brand=" + brand + ", price=" + price + ", colour=" + colour + ", type=" + type + ", toString()="
			+ super.toString() + "]";
}
public String getBrand() {
	return brand;
}
public void setBrand(String brand) {
	this.brand = brand;
}
public Double getPrice() {
	return price;
}
public void setPrice(Double price) {
	this.price = price;
}
public Color getColour() {
	return colour;
}
public void setColour(Color colour) {
	this.colour = colour;
}
public Type getType() {
	return type;
}
public void setType(Type type) {
	this.type = type;
}

}
