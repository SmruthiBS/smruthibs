package com.xworkz.spring.examples;

import org.springframework.stereotype.Component;

@Component
public class Mask {
	public Mask() {
		System.out.println("creating mask using spring");
	}
	public String toString() {
		// TODO Auto-generated method stub
		return "instance of mask";
	}

}
