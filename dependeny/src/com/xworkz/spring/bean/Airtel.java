package com.xworkz.spring.bean;

import org.springframework.stereotype.Component;

import com.xworkz.spring.interfaces.Provider;
@Component
public class Airtel implements Provider {

	@Override
	public void connect() {
System.out.println("running connect in airtel");

	}

}
