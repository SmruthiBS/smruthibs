package com.xworkz.spring.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Camera {
	@Autowired
	 private Lens lens;
	 public Camera() {
		System.out.println("default constructor of camera");
	}

}
