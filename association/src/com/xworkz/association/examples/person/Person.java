package com.xworkz.association.examples.person;

public class Person {
	public String name;
	public Email[] mails;
	public Job job;
	public Person(String name, Job job) {
		super();
		this.name = name;
		this.job = job;
	}
	public void setMails(Email[] mails)
	{
		this.mails=mails;
	}
	public void display() {
		System.out.println(this.name);
		if(job!=null) {
			job.display();}
			else
			System.out.println("job is null");
		for(int i=0;i<this.mails.length;i++) {
			Email value=this.mails[i];
			System.out.println(value);
			value.display();
			
			}
		}
		
		
	}


