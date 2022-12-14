package com.xworkz.pizza.service;

import com.xworkz.pizza.constant.PizzaSize;
import com.xworkz.pizza.dto.PizzaDTO;

public class PizzaServiceImplimentation implements PizzaService {

	@Override
	public boolean validateAndSave(PizzaDTO dto) {		
		System.out.println("running validate and save method");
	String name=dto.getName();
	String company=dto.getCompany();
	PizzaSize size=dto.getSize();
	double price=dto.getPrice();

	boolean validname=false;
	boolean validcompany=false;
	boolean validsize=false;
	boolean validprice=false;
	boolean validflavour=false;
	boolean validType=false;

	if(name!=null && name.length()>=4&& name.length()<=20) {
		System.out.println("name is valid "+name);
		validname=true;
	}

	else {
		System.out.println("name is invalid "+name);
	return false;
		
	}
	
	if(company!=null && company.length()>=4&&company.length()<=20 ) {
		System.out.println("company is valid "+company);
		validcompany=true;
	}
	else {
		System.out.println("company is invalid "+company);
		return false;
	}

	if(size!=null) {
		System.out.println("pizza size is valid "+size);
		validsize=true;
	}
	else
	{
		System.out.println("pizza size invalid");
		return false;
	}
	if(price>=50 && price<=2000) {
		System.out.println("price is valid "+price);
		validprice=true;
	}
	else
	{
		System.err.println("price is invalid "+price);
	}
	String flavour=dto.getFlavour();
	if(flavour!=null &&flavour.length()>=3&& flavour.length()<=20) {
		System.out.println("flavours is valid "+flavour);
		validflavour=true;
	}
	else
		System.err.println("flavour is invalid "+flavour);

	String type=dto.getType();
	if(type!=null&&type=="veg"||type=="nonveg") {
		System.out.println("type is valid "+type);
	}
	else
		System.out.println("type is invalid "+type);
	return false;
	}
}
