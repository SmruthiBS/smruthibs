package com.xworkz.spring.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Newspaper {
	@Autowired
	@Qualifier("id")
	private int id;
	private String name;
	private String ownerName;
	@Autowired
	@Qualifier("language")
	private String language;
	private double price;
	public Newspaper(@Qualifier("name")  String name,@Qualifier("ownerName") String ownerName) {
		super();
		this.name = name;
		this.ownerName = ownerName;
	}
	@Value("10")
	public void setPrice(double price) {
		this.price=price;
	}
	@Override
	public String toString() {
		return "Newspaper [id=" + id + ", name=" + name + ", ownerName=" + ownerName + ", language=" + language
				+ ", price=" + price + "]";
	}

}
