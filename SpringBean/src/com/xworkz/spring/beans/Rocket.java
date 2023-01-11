package com.xworkz.spring.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Rocket {
	@Value("india")
	private String country;
	@Value("vikram")
	private String name;
	@Value("1200000")
	private double budget;
	public Rocket() {
		System.out.println("default constructor of rocket");
	}
	public String getCountry() {
		return country;
	}
	public String getName() {
		return name;
	}
	public double getBudget() {
		return budget;
	}
	

}
