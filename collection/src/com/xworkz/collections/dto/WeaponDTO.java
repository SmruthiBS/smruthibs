package com.xworkz.collections.dto;

import java.time.LocalDate;

import com.xworkz.collections.constant.weaponType;

public class WeaponDTO {
	private String name;
	private String madeBy;
	private LocalDate madeOn;
	private Double price;
	private weaponType type;
	public WeaponDTO() {
		super();
	}
	public WeaponDTO(String name, String madeBy, LocalDate madeOn, Double price, weaponType type) {
		super();
		this.name = name;
		this.madeBy = madeBy;
		this.madeOn = madeOn;
		this.price = price;
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMadeBy() {
		return madeBy;
	}
	public void setMadeBy(String madeBy) {
		this.madeBy = madeBy;
	}
	public LocalDate getMadeOn() {
		return madeOn;
	}
	public void setMadeOn(LocalDate madeOn) {
		this.madeOn = madeOn;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public weaponType getType() {
		return type;
	}
	public void setType(weaponType type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "WeaponDTO [name=" + name + ", madeBy=" + madeBy + ", madeOn=" + madeOn + ", price=" + price + ", type="
				+ type + "]";
	}
	@Override
	public boolean equals(Object obj) {
		if(obj!=null) {
			if(obj instanceof WeaponDTO) {
				WeaponDTO dto=(WeaponDTO)obj;
				if(dto.name.equals(this.name)) {
					return true;
				}
			}
		}
	
		return false;
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return 10;
	}
	

}
