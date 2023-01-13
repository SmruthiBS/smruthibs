package com.xworkz.spring.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class Producer {
	@Autowired
	private Assistant assistant;
	public Producer() {
		System.out.println("default constructor of producer");
	}

}
