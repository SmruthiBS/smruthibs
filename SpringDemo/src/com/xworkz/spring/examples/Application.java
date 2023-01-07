package com.xworkz.spring.examples;

import org.springframework.stereotype.Component;

@Component
public class Application {
	public Application() {
		System.out.println("creating application using spring");
	}@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "instance of application";
	}
}
