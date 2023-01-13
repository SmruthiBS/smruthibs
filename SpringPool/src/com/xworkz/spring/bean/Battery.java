package com.xworkz.spring.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Battery {
	public Battery() {
 System.out.println("default constructor of battery");
	}
	@Autowired
	private Capacity capacity;

}
