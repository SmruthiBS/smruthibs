package com.xworkz.collections.dto;

import com.xworkz.collections.constant.Type;

public class DataBaseVendorDTO {
	private String name;
	private String developedBy;
	private double size;
	private double licensePrice;
	private Type type;
	public DataBaseVendorDTO() {
		super();
	}
	public DataBaseVendorDTO(String name, String developedBy, double size, double licensePrice, Type type) {
		super();
		this.name = name;
		this.developedBy = developedBy;
		this.size = size;
		this.licensePrice = licensePrice;
		this.type = type;
	}
	@Override
	public String toString() {
		return "DataBaseVendorDTO [name=" + name + ", developedBy=" + developedBy + ", size=" + size + ", LicensePrice="
				+ licensePrice + ", type=" + type + "]";
	}
	public boolean equals(Object obj) {
		if(obj!=null) {
			if(obj instanceof DataBaseVendorDTO) {
				DataBaseVendorDTO dto=(DataBaseVendorDTO)obj;
				if(dto.name.equals(this.name)&&dto.size==this.size) {
					return true;
				}
			}
		}
			return false;
		}
	
	
	@Override
	public int hashCode() {
	return 45;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDevelopedBy() {
		return developedBy;
	}
	public void setDevelopedBy(String developedBy) {
		this.developedBy = developedBy;
	}
	public double getSize() {
		return size;
	}
	public void setSize(double size) {
		this.size = size;
	}
	public double getLicensePrice() {
		return licensePrice;
	}
	public void setLicensePrice(double licensePrice) {
		this.licensePrice = licensePrice;
	}
	public Type getType() {
		return type;
	}
	public void setType(Type type) {
		this.type = type;
	}
	

}
