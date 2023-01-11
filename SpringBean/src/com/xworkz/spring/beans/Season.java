package com.xworkz.spring.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Season {
	private String name;
	private String startingMonth;
	private double duration;
	public Season() {
		System.out.println("default constructor of season");
		
	}
	public String getName() {
		return name;
	}
	public String getStartingMonth() {
		return startingMonth;
	}
	public double getDuration() {
		return duration;
	}
	@Value("summer")
	public void setName(String name) {
		this.name = name;
	}
	@Value("march")
	public void setStartingMonth(String startingMonth) {
		this.startingMonth = startingMonth;
	}
	@Value("3")
	public void setDuration(double duration) {
		this.duration = duration;
	}
	

}
