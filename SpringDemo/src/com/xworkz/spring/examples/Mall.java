package com.xworkz.spring.examples;

import org.springframework.stereotype.Component;

@Component
public class Mall {
	public Mall() {
		System.out.println("creating mall using spring");
	}
	public String toString() {
		// TODO Auto-generated method stub
		return "instance ofmall";
	}
}
