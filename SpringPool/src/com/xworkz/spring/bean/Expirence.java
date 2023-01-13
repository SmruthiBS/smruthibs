package com.xworkz.spring.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Expirence {
	@Autowired
	 private Skill skill;
	 public Expirence() {
	System.out.println("default constructor of experince");
	}

}
