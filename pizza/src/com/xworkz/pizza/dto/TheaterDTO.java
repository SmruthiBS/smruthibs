package com.xworkz.pizza.dto;

public class TheaterDTO extends AbstractAuditDTO {
private int id;
private String name;
private String brand;
private int seats;
public TheaterDTO() {
	super();
}
public TheaterDTO(int id, String name, String brand, int seats,String createdby) {
	super(createdby);
	this.id = id;
	this.name = name;
	this.brand = brand;
	this.seats = seats;
}
@Override
public String toString() {
	return "Theater [id=" + id + ", name=" + name + ", brand=" + brand + ", seats=" + seats + ", toString()="
			+ super.toString() + "]";
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getBrand() {
	return brand;
}
public void setBrand(String brand) {
	this.brand = brand;
}
public int getSeats() {
	return seats;
}
public void setSeats(int seats) {
	this.seats = seats;
}



}
