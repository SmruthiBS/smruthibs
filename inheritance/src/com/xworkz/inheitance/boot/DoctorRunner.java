package com.xworkz.inheitance.boot;

import com.xworkz.inheitance.child.Dentist;
import com.xworkz.inheitance.child.ENT;
import com.xworkz.inheitance.child.*;
import com.xworkz.inheitance.examples.doctor.Doctor;

public class DoctorRunner {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
Doctor doctor=new Doctor();
doctor.display();
Doctor doctor2=new Dentist("mahesh", "apolo",  200.00 ,4);
Dentist dentist=(Dentist)doctor2;
doctor2.display();
Doctor doctor3=new ENT("sharada","shimoga","prasana","sharada");
ENT ent=(ENT)doctor3;
doctor3.display();
Doctor doctor4=new Cardiologist (1000000.00,20,"narendra","nisarga");
Cardiologist cardio=(Cardiologist) doctor4;
doctor4.display();



	}

}
