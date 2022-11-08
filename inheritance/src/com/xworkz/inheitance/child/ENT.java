package com.xworkz.inheitance.child;

import com.xworkz.inheitance.examples.doctor.Doctor;

public class ENT extends Doctor{
	public String clinicName;
	public String clinicAddress;
	Doctor doc2=new Doctor();
	public void display() {
		doc2.display();
		System.out.println(this.clinicName);
		System.out.println(this.clinicAddress);
	}
	public ENT(String clinicName, String clinicAddress ,String name,String hospitalName) {
		super();
		this.name=name;
		this.hospitalName=hospitalName;
		this.clinicName = clinicName;
		this.clinicAddress = clinicAddress;
	}
	
	

}
