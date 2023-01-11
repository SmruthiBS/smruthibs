package com.xworkz.spring.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
@ComponentScan("com.xworkz.spring")
@Configuration
public class SpringConfiguration {
	public SpringConfiguration() {
		System.out.println("running spring configuration");
	}
	@Bean
public int id() {
		System.out.println("registering id"); 
	return 1;
		
	}
	@Bean
public String address() {
		System.out.println("registering address"); 
	return "banglore";
		
	}
	
	@Bean
public String gstNo() {
		System.out.println("registering gstno"); 
	return "abcd2356";
		
	}
	
	@Bean
public String name() {
		System.out.println("registering name"); 
	return "sanvi hardwares";
		
	}
	
	@Bean
public String ownerName() {
		System.out.println("registering ownername"); 
	return "satish";
		
	}
	@Bean
public String softwareName() {
		System.out.println("registering name"); 
	return "Zoom";
		
	}
	@Bean
public String version() {
		System.out.println("registering version"); 
	return "5.12";
		
	}
	@Bean
public String developer() {
		System.out.println("registering developer"); 
	return "Eric yuan";
		
	}
	@Bean
public String date() {
		System.out.println("registering date"); 
	return "10 september 2012";
		
	}
	@Bean
public boolean free() {
		System.out.println("registering free"); 
	return true;
		
	}
	@Bean
	public double salary() {
		System.out.println("registering free"); 
	return 25000;
		
	}
	@Bean
	public String employeeName() {
		System.out.println("registering free"); 
	return "nikitha";
		
	}
	@Bean
	public String companyName() {
		System.out.println("registering free"); 
	return "tcs";
		
	}
	@Bean
	public double exprience() {
		System.out.println("registering free"); 
	return 3;
		
	}
	@Bean
	public double price() {
		System.out.println("registering price"); 
	return 3;
		
	}
	@Bean
	public String  pencilName() {
		System.out.println("registering pencilname"); 
	return "nataraj";
		
	}
	@Bean
	public String colour() {
		System.out.println("registering colour"); 
	return "red";
		
	}
	@Bean
	public String type() {
		System.out.println("registering type"); 
	return "graphite";
		
	}
	@Bean
	public boolean stolen() {
		System.out.println("registering stolen"); 
	return false;
		
	}
	@Bean
	public boolean sharp () {
		System.out.println("registering sharp"); 
	return true;
		
	}
	@Bean
	public String  rubberName() {
		System.out.println("registering pencilname"); 
	return "nataraj";
		
	}
	@Bean
	public String rubberColour() {
		System.out.println("registering colour"); 
	return "white";
		
	}
	@Bean
	public String rubberType() {
		System.out.println("registering type"); 
	return "pencil ";
		
	}
	@Bean
	public boolean rubberStolen() {
		System.out.println("registering stolen"); 
	return false;
		
	}
	@Bean
	public boolean rubberSharp () {
		System.out.println("registering sharp"); 
	return false ;
		
	}
	@Bean
	public double rubberSize () {
		System.out.println("registering size"); 
	return 10;}
	@Bean
	public double rubberPrice () {
		System.out.println("registering size"); 
	return 10;
		
	}
	@Bean
	public double bookPrice () {
		System.out.println("registering price"); 
	return 100;}
	@Bean
	public String bookName() {
		System.out.println("registering name"); 
	return "tungaBadra";}
	@Bean
	public String publication () {
		System.out.println("registering publication"); 
	return "	Indira Prakashana";}
	@Bean
	public String author () {
		System.out.println("registering author"); 
	return 	"M K Indira";}
	@Bean
	public int noOfPages () {
		System.out.println("registering noOfPages"); 
	return 10;}
	@Bean
	public int edition () {
		System.out.println("registering edition"); 
	return 3;}
	@Bean
	public int totalEdition () {
		System.out.println("registering total edition"); 
	return 4;}
	@Bean
	public String language () {
		System.out.println("registering size"); 
	return "kannada";}
	@Bean
	public String seller () {
		System.out.println("registering size"); 
	return "ambika book house";}
	
}
