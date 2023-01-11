package com.xworkz.spring.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
public class SoftwareEngineer {
	@Autowired
	@Qualifier("employeeName")
	private String name;
	@Autowired
	@Qualifier("companyName")
	private String company;
	@Autowired
	@Qualifier("exprience")
	private double exprience;
	@Autowired
	@Qualifier("salary")
	private double salary;
public SoftwareEngineer() {
	System.out.println("default constructor of softwareEngineer");
}	
	@Override
	public String toString() {
		return "SoftwareEngineer [name=" + name + ", company=" + company + ", exprience=" + exprience + ", salary="
				+ salary + "]";
	}
	
	

}
