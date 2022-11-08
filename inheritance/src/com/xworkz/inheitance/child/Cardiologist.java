package com.xworkz.inheitance.child;

import com.xworkz.inheitance.examples.doctor.Doctor;

 public class Cardiologist extends Doctor {
	public double income;
	public int noOfPatients;
	Doctor doc3=new Doctor();
	public Cardiologist(double income, int noOfPatients,String name,String hospitalName ) {
		super();
		this.income = income;
		this.noOfPatients = noOfPatients;
		this.hospitalName=hospitalName;
		this.name=name;
		
	}
	public void display()
	{
		doc3.display();
		System.out.println(income);
		System.out.println(noOfPatients);
	}

}
