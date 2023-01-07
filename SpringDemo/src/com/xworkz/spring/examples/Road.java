package com.xworkz.spring.examples;

import org.springframework.stereotype.Component;

@Component
public class Road {
	public Road() {
		System.out.println("created road using spring");
	}
	public String toString() {
		// TODO Auto-generated method stub
		return "instance of road";
	}
}
