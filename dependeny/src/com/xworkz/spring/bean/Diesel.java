package com.xworkz.spring.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.xworkz.spring.interfaces.Fuel;
@Component
public class Diesel implements Fuel {

public Diesel() {
	System.out.println("created disel");
}
	@Override
	public void consume() {
		System.out.println("running consume in disel");

	}

}
