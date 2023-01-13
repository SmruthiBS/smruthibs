package com.xworkz.spring.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Movie {
	@Autowired
	 private Director director;
	@Autowired
	private Producer producer;
	public Movie() {
System.out.println("default constructor of movie");
	}

}
