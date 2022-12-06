package com.xworkx.interfaces.examples;

public abstract class Person {
	private String name;
	private String gender;
	private int age;
	private long phone;
	private String email;
	
	public abstract void  eat();
	public abstract void sleep();
	public Person(String name, String gender, int age, long phone, String email) {
		super();
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.phone = phone;
		this.email = email;
	}
	
	

}
