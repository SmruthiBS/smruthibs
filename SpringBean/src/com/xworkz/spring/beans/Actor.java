package com.xworkz.spring.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class Actor {
	private String name;
	private String language;
	private double age;
	public Actor(@Value("sudeep")  String name,@Value("kannada") String language, @Value("49") double age) {
	
		this.name = name;
		this.language = language;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public String getLanguage() {
		return language;
	}
	public double getAge() {
		return age;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public void setAge(double age) {
		this.age = age;
	}
	
	
	
	

}
