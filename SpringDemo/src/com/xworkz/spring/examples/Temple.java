package com.xworkz.spring.examples;

import org.springframework.stereotype.Component;

@Component
public class Temple {
	public Temple() {
		System.out.println("creating temple using spring");
	}
	public String toString() {
		// TODO Auto-generated method stub
		return "instance of temple";
	}
}
