package com.xworkz.inheitance.child;

import com.xworkz.inheitance.examples.doctor.Doctor;

public class Dentist extends Doctor
{
Doctor doc= new Doctor();
public Double fees;
public  int experience;

public Dentist(String name, String hospitalName, Double fees, int experience) {
	this.name=name;
	this.hospitalName=hospitalName;
	this.fees = fees;
	this.experience = experience;
}

public void display() {
	doc.display();
	System.out.println(fees);
	System.out.println(experience);
}
}
