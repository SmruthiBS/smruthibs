
package com.xworkz.spring.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Engine {
private String name;
private String type;
private String company;
@Autowired
@Qualifier("number")
private int number;
@Autowired
@Qualifier("version")
private double version;
@Autowired
@Qualifier("strokes")
private int strokes;
public Engine(@Qualifier("engineName") String name,@Qualifier("type") String type,@Qualifier("company") String company) {
	super();
	this.name = name;
	this.type = type;
	this.company = company;
}
public void setStrokes() {
	this.strokes=strokes;
}
@Override
public String toString() {
	return "Engine [name=" + name + ", type=" + type + ", company=" + company + ", number=" + number + ", version="
			+ version + ", strokes=" + strokes + "]";
}
}
