package com.xworkz.spring.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Assistant {
	@Autowired
	private Company company;
	public Assistant() {
		System.out.println("default constructor of  assistant");
	}

}
