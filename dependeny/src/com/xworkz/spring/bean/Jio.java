package com.xworkz.spring.bean;

import org.springframework.stereotype.Component;

import com.xworkz.spring.interfaces.Provider;
@Component
public class Jio implements Provider {
	
public Jio() {
System.out.println("created jio");
}
	@Override
	public void connect() {
System.out.println("running connect in jio");

	}

}
