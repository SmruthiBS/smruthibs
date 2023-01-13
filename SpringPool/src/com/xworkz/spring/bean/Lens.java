package com.xworkz.spring.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Lens {
	public Lens() {
System.out.println("default constructor of lens");
	}
	@Autowired
private	Battery battery;

}
