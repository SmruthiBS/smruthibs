package com.xworkz.spring.examples;

import org.springframework.stereotype.Component;

@Component
public class God {
	public God() {
		System.out.println("creating god using spring");
	}
	public String toString() {
		// TODO Auto-generated method stub
		return "instance of god";
	}

}
