package com.xworkz.spring.examples;

import org.springframework.stereotype.Component;

@Component
public class Patient {
	public Patient() {
		System.out.println("creating patient using spring");
	}
	public String toString() {
		// TODO Auto-generated method stub
		return "instance of patient";
	}
}
