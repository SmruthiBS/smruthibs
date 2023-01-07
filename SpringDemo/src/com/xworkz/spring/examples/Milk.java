package com.xworkz.spring.examples;

import org.springframework.stereotype.Component;

@Component
public class Milk {
	public Milk() {
		System.out.println("creating milk using spring");
	}
	public String toString() {
		// TODO Auto-generated method stub
		return "instance of milk";
	}

}
