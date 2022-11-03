package com.xworkz.access_specifer.examples.hospital;

public class Patient {
	Hospital hospital=new Hospital();
	 public void use()
	 
	 {
		 System.out.println(hospital.getContact());
		 System.out.println(hospital.getDean());
		 System.out.println(hospital.getDistrict());
		 System.out.println(hospital.getGovernment());
		 System.out.println(hospital.getLab());
		 System.out.println(hospital.getLocation());
		 System.out.println(hospital.getName());
		 System.out.println(hospital.getnoOfDoctors());
		 System.out.println(hospital.getNoOfOts());
		 System.out.println(hospital.getNoPatients());
		
		 hospital.setCity("bangolre");
		 hospital.setContact(8022065000l);
		 hospital.setDean("john");
		 hospital.setGovernment(false);
		 hospital.setLab(false);
		 hospital.setName(" St. John’s");
		 hospital.setLocation("banglore");
		 hospital.setNoOfDoctors(25);
		 hospital.setNoOfpatients(200);
		 hospital.setNoOfwords(30);
		 
		 System.out.println(hospital.getContact());
		 System.out.println(hospital.getDean());
		 System.out.println(hospital.getDistrict());
		 System.out.println(hospital.getGovernment());
		 System.out.println(hospital.getLab());
		 System.out.println(hospital.getLocation());
		 System.out.println(hospital.getName());
		 System.out.println(hospital.getnoOfDoctors());
		 System.out.println(hospital.getNoOfOts());
		 System.out.println(hospital.getNoPatients());
		 
	 }

}
