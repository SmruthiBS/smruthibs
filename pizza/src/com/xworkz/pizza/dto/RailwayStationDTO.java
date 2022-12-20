package com.xworkz.pizza.dto;

public class RailwayStationDTO extends AbstractAuditDTO {
private String name;
private int noOfPlatforms;
private String area;
private int platformTicketPrice;

public RailwayStationDTO() {
	super();
}

public RailwayStationDTO(String name, int noOfPlatforms, String area, int platformTicketPrice) {
	super();
	this.name = name;
	this.noOfPlatforms = noOfPlatforms;
	this.area = area;
	this.platformTicketPrice = platformTicketPrice;
}

@Override
public String toString() {
	return "RailwayStationDTO [name=" + name + ", noOfPlatforms=" + noOfPlatforms + ", area=" + area
			+ ", platformTicketPrice=" + platformTicketPrice + ", toString()=" + super.toString() + "]";
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getNoOfPlatforms() {
	return noOfPlatforms;
}

public void setNoOfPlatforms(int noOfPlatforms) {
	this.noOfPlatforms = noOfPlatforms;
}

public String getArea() {
	return area;
}

public void setArea(String area) {
	this.area = area;
}

public int getPlatformTicketPrice() {
	return platformTicketPrice;
}

public void setPlatformTicketPrice(int platformTicketPrice) {
	this.platformTicketPrice = platformTicketPrice;
}



}
