package com.xworkz.spring.examples;

import org.springframework.stereotype.Component;

@Component
public class Fish {
	
public Fish() {
	System.out.println("creating fish using spring");
}
public String toString() {
	// TODO Auto-generated method stub
	return "instance of fish";
}

}
