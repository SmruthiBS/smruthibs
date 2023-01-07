package com.xworkz.spring.examples;

import org.springframework.stereotype.Component;

@Component
public class Park {
	public Park() {
		System.out.println("creating park using spring");
	}
	public String toString() {
		// TODO Auto-generated method stub
		return "instance of park";
	}

}
