package com.xworkz.spring.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
public class Rubber {
	@Autowired
	@Qualifier("rubberName")
private String name;
	@Autowired
	@Qualifier("rubberPrice")
private double price;
	@Autowired
	@Qualifier("rubberType")
private String type;
	@Autowired
	@Qualifier("rubberColour")
private String colour;
	@Autowired
	@Qualifier("rubberSharp")
private boolean sharp;
	@Autowired
	@Qualifier("rubberStolen")
private boolean stolen;
	@Autowired
	@Qualifier("rubberSize")
	
	private double size;
@Override
	public String toString() {
		return "Pencil [name=" + name + ", price=" + price + ", type=" + type + ", colour=" + colour + ", sharp="
				+ sharp + ", stolen=" + stolen + "]";
	}

}
