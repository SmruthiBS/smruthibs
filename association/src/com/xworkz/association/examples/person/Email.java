package com.xworkz.association.examples.person;

public class Email {
	public String id;
	public String password;
	public long mobile;
	public Company company;
	public Email(String id, String password, long mobile, Company company) {
		super();
		this.id = id;
		this.password = password;
		this.mobile = mobile;
		this.company = company;
	}
	 public void display() {
		 System.out.println(this.id);
		 System.out.println(this.mobile);
		 System.out.println(this.password);
		 if(company!=null) {
			company.display();
			}
			 else
				 System.out.println("company is null");
		 }
		 
	 }
	
	


