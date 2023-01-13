package com.xworkz.spring.configure;

import java.time.LocalDate;

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
public String language() {
	
	return"english";
}
@Bean
public String name() {
	return "times of india";
}
@Bean
public String ownerName() {
	return "sahu jain";
	
}
@Bean
public double price() {
	return 5;
}
@Bean
public String engineName() {
	return "v8";
	
}
@Bean
public String type() {
	return "piston engine";
	
}
@Bean
public String company() {
	return "honda";
	
}
@Bean
public int strokes() {
	return 4;
	
}
@Bean
public int number() {
	return 1234 ;
	
}
@Bean
public double version() {
	return 3.5;
}
@Bean
public String snakeName() {
	return " king cobra";
	
}
@Bean
public String snakeType() {
	return "venomous elapid";
	
}
@Bean
public String colour() {
	return "yellow";
	
}
@Bean
public double length() {
	return 3.6;
	
}
@Bean
public boolean poisionous() {
	return true ;
	
}
@Bean
public String ghostName() {
	return "nagavalli";
	
}
@Bean
public String gender() {
	return "female";
	
}
@Bean
public String fatherName() {
	return "raja";
	
}
@Bean
public String motherName() {
	return "rani";
	
}
@Bean
public String place() {
	return "kerala";
	
}
@Bean
public String reasonOfDeath() {
	return "fire";
	
}
@Bean
public String placeOfDeath() {
	return "kerala";
	
}
@Bean
public String favFood() {
	return "rice";
	
}
@Bean
public double nailLength() {
	return 3.5;
	
}
@Bean
public int noOfYearsToDeath() {
	return 100;
	
}
@Bean
public boolean dangrous() {
	return true;
	
}
@Bean
public boolean friendly() {
	return false;
	
}
@Bean
public boolean inHeaven() {
	return true;
	
}
@Bean
public boolean inHell() {
	return false;
	
}
@Bean
public LocalDate dateOfDeath() {
	return LocalDate.of(1900, 10, 10);
	
}
@Bean
public String religion() {
	return "hindu";
	
}
@Bean
public boolean fatherAlive() {
	return false;
	
}
@Bean
public boolean motherAlive() {
	return false;
	
}
@Bean
public int noOfSiblings() {
	return 3;
	
}
@Bean
public String grandFtherName() {
	return "not known";
	
}

}
