package com.xworkz.spring.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
public class Pencil {
	@Autowired
	@Qualifier("pencilName")
private String name;
	@Autowired
	@Qualifier("price")
private double price;
	@Autowired
	@Qualifier("type")
private String type;
	@Autowired
	@Qualifier("colour")
private String colour;
	@Autowired
	@Qualifier("sharp")
private boolean sharp;
	@Autowired
	@Qualifier("stolen")
private boolean stolen;
@Override
	public String toString() {
		return "Pencil [name=" + name + ", price=" + price + ", type=" + type + ", colour=" + colour + ", sharp="
				+ sharp + ", stolen=" + stolen + "]";
	}
public Pencil() {
	System.out.println("default constructor of pencil");
}
}
