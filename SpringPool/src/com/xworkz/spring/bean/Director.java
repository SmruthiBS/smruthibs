package com.xworkz.spring.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Director {
	@Autowired
	private Expirence experince;
	public Director() {
		System.out.println("default constructor of director");
	}
	

}
