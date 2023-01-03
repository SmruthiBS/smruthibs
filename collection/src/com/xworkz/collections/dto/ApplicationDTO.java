package com.xworkz.collections.dto;

public class ApplicationDTO {
private String name;
private double version;
private String developedBy;
private double price;
private boolean free;
public ApplicationDTO() {
	super();
}
public ApplicationDTO(String name, double version, String developedBy, double price, boolean free) {
	super();
	this.name = name;
	this.version = version;
	this.developedBy = developedBy;
	this.price = price;
	this.free = free;
}
@Override
public String toString() {
	return "ApplicationDTO [name=" + name + ", version=" + version + ", developedBy=" + developedBy + ", price=" + price
			+ ", free=" + free + "]";
}
@Override
	public boolean equals(Object obj) {
	if(obj!=null) {
		if(obj instanceof ApplicationDTO) {
			ApplicationDTO dto=(ApplicationDTO)obj;
			if(dto.name.equals(this.name)&&dto.version==this.version) {
				return true;
			}
		}
	}
		return false;
	}
@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return 4;
	}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getVersion() {
	return version;
}
public void setVersion(double version) {
	this.version = version;
}
public String getDevelopedBy() {
	return developedBy;
}
public void setDevelopedBy(String developedBy) {
	this.developedBy = developedBy;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public boolean isFree() {
	return free;
}
public void setFree(boolean free) {
	this.free = free;
}

}
