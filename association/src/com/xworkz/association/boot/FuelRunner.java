package com.xworkz.association.boot;

import com.xworkz.association.constants.FuelType;
import com.xworkz.association.examples.Fuel;

public class FuelRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fuel fuel=new Fuel(true,FuelType.PETROL, 101.92, 10);
		fuel.showoff();

	}

}
