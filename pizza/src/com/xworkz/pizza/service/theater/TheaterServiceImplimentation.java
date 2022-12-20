package com.xworkz.pizza.service.theater;

import com.xworkz.pizza.dto.TheaterDTO;
import com.xworkz.pizza.exception.theater.InvalidDataException;
import com.xworkz.pizza.repository.theater.TheaterRepository;

public class TheaterServiceImplimentation implements TheaterService {
	TheaterRepository repo;


public TheaterServiceImplimentation(TheaterRepository repo) {
		super();
		this.repo = repo;
	}


@Override
	public boolean saveAndValidate(TheaterDTO dto) throws InvalidDataException  {
	String name=dto.getName();
	String brand=dto.getBrand();
	Integer id=dto.getId();
    Integer seats=dto.getSeats();
	boolean validName=false;
	boolean validBrand=false;
	boolean validId=false;
	boolean validSeat=false;
	if(name!=null&&name.length()>4&&name.length()<=20) {
		System.out.println("name is valid "+name);
		validName=true;
	}
	else {
		System.out.println("name is invalid "+name);
	
		return false;
	}
	
	if(brand!=null &&brand.length()>=4&&brand.length()<=20) {
		System.out.println("brand is valid "+brand);
		validBrand=true;
	}
	if(id!=null) {
		System.out.println("id is valid "+id);
		validId=true;
	}
	else {
		System.out.println("id is invalid "+id);
	}
	if(seats!=null) {
		System.out.println("seats is valid "+seats);
		validSeat=true;
	}
	else {
		System.out.println("seats are invalid "+seats);
	}
	
	if(validBrand&&validId&&validBrand&&validSeat) {
		boolean save=this.repo.store(dto);
		System.out.println("theater dto is saved "+dto);
	System.out.println(save);
		return true;
	}
	else {
		
		throw new InvalidDataException("data you have entered seems to be invalid...please give valid data");
		
	}
	
	}

}
