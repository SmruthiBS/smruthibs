package com.xworkz.collections.dto;

public class AirportDTO {
	 private  String name;
	 private  String location;
	 private String type;
	public AirportDTO() {
		super();
	}
	public AirportDTO(String name, String location, String type) {
		super();
		this.name = name;
		this.location = location;
		this.type = type;
	}
	@Override
	public String toString() {
		return "Airport [name=" + name + ", location=" + location + ", type=" + type + "]";
	}
	 
	@Override
	public boolean equals(Object ref) {
		System.out.println("running equals in airportdto");
		if(ref!=null) {
			if(ref instanceof AirportDTO) {
				AirportDTO dto=(AirportDTO)ref;
				if(dto.type.equals(this.type)) {
				System.out.println("type match "+dto.type);
				return true;
			}
		}
		
		
	}
		return false;

}
}
