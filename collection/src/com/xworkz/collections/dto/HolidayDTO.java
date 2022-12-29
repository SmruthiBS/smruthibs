package com.xworkz.collections.dto;

public class HolidayDTO {
private String name;
private String date;
private String type;
public HolidayDTO() {
	super();
}
public HolidayDTO(String name, String date, String type) {
	super();
	this.name = name;
	this.date = date;
	this.type = type;
}
@Override
public String toString() {
	return "HolidayDTO [name=" + name + ", date=" + date + ", type=" + type + "]";
	
}
public boolean equals(Object ref) {
	System.out.println("running equals in place dto");
	if(ref!=null) {
		if(ref instanceof PlaceDTO) {
			HolidayDTO dto=(HolidayDTO)ref;
			if(dto.type.equals(this.type)) {
			System.out.println("type match "+dto.type);
			return true;
		}
	}
	
	
}
	return false;
}

	
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDate() {
	return date;
}
public void setDate(String date) {
	this.date = date;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}

	
	}


