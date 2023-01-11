package com.xworkz.spring.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Book {
	@Autowired
	@Qualifier("bookName")
	private String name;
	@Autowired
	@Qualifier("author")
	private String author;
	
	@Autowired
	@Qualifier("publication")
	private String publication;
	@Autowired
	@Qualifier("noOfPages")
	private int noOfPages;
	@Autowired
	@Qualifier("bookPrice")
	private double Price;
	@Autowired
	@Qualifier("edition")
	private int edition;
	@Autowired
	@Qualifier("totalEdition")
	private int totalEdition;
	@Autowired
	@Qualifier("language")
	private String language;
	@Autowired
	@Qualifier("seller")
	private String seller;
	@Override
	public String toString() {
		return "Book [name=" + name + ", author=" + author + ", publication=" + publication + ", noOfPages=" + noOfPages
				+ ", Price=" + Price + ", edition=" + edition + ", totalEdition=" + totalEdition + ", language="
				+ language + ", seller=" + seller + "]";
	}
}
