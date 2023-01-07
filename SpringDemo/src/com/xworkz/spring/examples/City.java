package com.xworkz.spring.examples;

import org.springframework.stereotype.Component;
@Component
public class City {

	public City() {
		System.out.println("creating cityn using spring");
	}
	public String toString() {
		// TODO Auto-generated method stub
		return "instance of city";
	}

}
