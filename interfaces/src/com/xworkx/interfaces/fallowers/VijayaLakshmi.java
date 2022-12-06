package com.xworkx.interfaces.fallowers;

public class VijayaLakshmi extends JavaTrainee implements KarnatakaRTO {

public VijayaLakshmi(String name, String gender, int age, long phone, String email) {
		super(name, gender, age, phone, email);
		System.out.println("name: "+name +" gender: "+gender +" age "+age +" phone "+phone+ " email "+email);
		
	}

	@Override
	public boolean paidTax(double amount) {
	System.out.println("running method paid tax");
	System.out.println("tax paid ="+amount);
		return true;
	}


	
	@Override
	public double gst() {
		System.out.println("running method gst");
		return 0 ;
	}

	@Override
	public double vat() {
		System.out.println("running method vat");
		return 0;
	}

}
