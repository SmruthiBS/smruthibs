package com.xworkz.collections.dto;

public class PlaceDTO {
private String name;
private String state;
private String district;
public PlaceDTO(String name, String state, String district) {
	super();
	this.name = name;
	this.state = state;
	this.district = district;
}
public PlaceDTO() {
	super();
}
@Override
public String toString() {
	return "PlaceDTO [name=" + name + ", state=" + state + ", district=" + district + "]";
}
@Override
public boolean equals(Object ref) {
	System.out.println("running equals in place dto");
	if(ref!=null) {
		if(ref instanceof PlaceDTO) {
			PlaceDTO dto=(PlaceDTO)ref;
			if(dto.state.equals(this.state)) {
			System.out.println("type match "+dto.state);
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
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
public String getDistrict() {
	return district;
}
public void setDistrict(String district) {
	this.district = district;
}



}
