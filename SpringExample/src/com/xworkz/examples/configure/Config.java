package com.xworkz.examples.configure;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
@Configuration
@ComponentScan
public class Config {
	@Bean("stringName")
	public String getName() {
		System.out.println("registering name with spring");
		String name=new String();
		return name ;	
	}
	@Bean("stringEmail")
	public String getEmail() {
		System.out.println("registering email with spring");
		String email=new String();
		return email ;	
	}
	@Bean("stringGender")
	public String getGender() {
		System.out.println("registering gender with spring");
		String gender=new String();
		return gender ;	
	}
	@Bean("stringEducation")
	public String getEducation() {
		System.out.println("registering education with spring");
		String str=new String();
		return str ;	
	}
	@Bean("stringArea")
	public String getArea() {
		System.out.println("registering area with spring");
		String edu=new String();
		return edu ;	
	}
	@Bean("stringCountry")
	public String getCountry() {
		System.out.println("registering country with spring");
		String country=new String();
		return country ;	
	}
	@Bean("booleanAlive")
	
public boolean alive() {
	System.out.println("registering alive with boolean");
	Boolean alive=new Boolean(true);
	return alive;
}
@Bean("booleanWorking")
public boolean working() {
	System.out.println("registering working with boolean");
	Boolean work=new Boolean(true);
	return work;
}
@Bean("booleanRain")
public boolean rain() {
	System.out.println("registering rain with boolean");
	Boolean rain=new Boolean(true);
	return rain;
}
@Bean("booleanFresh")
public boolean fresh() {
	System.out.println("registering alive with boolean");
	Boolean fresh=new Boolean(true);
	return fresh;
}
@Bean("booleanFun")
public boolean fun() {
	System.out.println("registering alive with boolean");
	Boolean fun=new Boolean(true);
	return fun;
}
@Bean ("salary")
public double getSalary() {
	System.out.println("registering salary");
	Double salary=14000d;
	return salary;
}
@Bean ("distance")
public double getDistance() {
	System.out.println("registering salary");
	Double distance=14000d;
	return distance ;
}
@Bean ("weight")
public double getWeight() {
	System.out.println("registering salary");
	Double weight=400d;
	return weight;
}
@Bean ("intrest")
public double getIntrest() {
	System.out.println("registering salary");
	Double intrest=14000d;
	return intrest;
}
@Bean("price")
public double getPrice() {
	System.out.println("registering price");
	Double price=1400d;
	return price;
}
@Bean("temple")
public StringBuffer getTemple() {
	System.out.println("registering temple");
	StringBuffer str=new StringBuffer("hampi");
	return str;
}
@Bean("city")
public StringBuffer getCity() {
	System.out.println("registering temple");
	StringBuffer str=new StringBuffer("banglore");
	return str;
}
@Bean("location")
public StringBuffer getLocation() {
	System.out.println("registering location");
	StringBuffer str=new StringBuffer("hampi");
	return str;
}
@Bean("god")
public StringBuffer getGod() {
	System.out.println("registering god");
	StringBuffer str=new StringBuffer("ganesha");
	return str;
}
@Bean("weapon")
public StringBuffer getWeapon() {
	System.out.println("registering weapon");
	StringBuffer str=new StringBuffer("gun");
	return str;
}
@Bean("capital")
public StringBuilder getCapital() {
	System.out.println("registring capital");
	StringBuilder str=new StringBuilder("delhi");
	return str;
}
@Bean("cake")
public StringBuilder getCake() {
	System.out.println("registring cake");
	StringBuilder str=new StringBuilder("red velvet");
	return str;
}
@Bean("climate")
public StringBuilder getClimate() {
	System.out.println("registring capital");
	StringBuilder str=new StringBuilder("sunny");
	return str;
}
@Bean("colour")
public StringBuilder getColour() {
	System.out.println("registring capital");
	StringBuilder str=new StringBuilder("red");
	return str;
}
@Bean("animal")
public StringBuilder getAnimal() {
	System.out.println("registring Animal");
	StringBuilder str=new StringBuilder("dog");
	return str;
}
@Bean("arrayList")
public ArrayList<String> GetName(){
	ArrayList<String> names=new ArrayList<String>();
	names.add("smruthi");
	names.add("anusha");
	names.add("manasa");
	names.add("anu");
	names.add("asha");
	return names;
	
}
public Map getValue() {
	Map<Integer, String> value=new HashMap<Integer, String>();
	value.put(1, "java");
	value.put(2, "C");
	value.put(3, "C++");
	value.put(4, "C#");
	value.put(5, "CSS");
	return value;
	
}
}
