package com.xworkz.spring.examples;

import org.springframework.stereotype.Component;

@Component
public class Cycle {
	public Cycle() {
		System.out.println("crerating cycle using spring");
	}
	public String toString() {
		// TODO Auto-generated method stub
		return "instance of cycle";
	}

}
