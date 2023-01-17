package com.xworkz.spring.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.xworkz.spring.interfaces.Fuel;
@Component
public class Petrol implements Fuel {


public Petrol() {
	System.out.println("created petrol");
}
	@Override
	public void consume() {
		System.out.println("running consume in petrol");

	}

}
