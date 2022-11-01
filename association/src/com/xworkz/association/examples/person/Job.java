package com.xworkz.association.examples.person;

public class Job {
public double salary;
public String role;
public boolean bond;
public Company company;
public Job(double salary, String role, boolean bond, Company company) {
	super();
	this.salary = salary;
	this.role = role;
	this.bond = bond;
	this.company = company;
}
	

public void display() {
	System.out.println(this.salary);
	System.out.println(this.bond);
	System.out.println(this.role);
	if(company!=null) {
		company.display();
	}
	else {
		System.out.println("company is null");
	}
	
	
	
}
}
