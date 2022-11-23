package com.xworkz.equal.examples;

public class Institution
 {
	private String name;
	private String founder;
	private  int since;
	private String location;
	private String branch;
	private String hr;
	private String website;
	private long contact;
	private int noOfStudents;
	private int noOfTrainers;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFounder() {
		return founder;
	}
	public void setFounder(String founder) {
		this.founder = founder;
	}
	public int getSince() {
		return since;
	}
	public void setSince(int since) {
		this.since = since;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getHr() {
		return hr;
	}
	public void setHr(String hr) {
		this.hr = hr;
	}
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	public long getContact() {
		return contact;
	}
	public void setContact(long contact) {
		this.contact = contact;
	}
	public int getNoOfStudents() {
		return noOfStudents;
	}
	public void setNoOfStudents(int noOfStudents) {
		this.noOfStudents = noOfStudents;
	}
	public int getNoOfTrainers() {
		return noOfTrainers;
	}
	public void setNoOfTrainers(int noOfTrainers) {
		this.noOfTrainers = noOfTrainers;
	}
	public Institution() {
		super();
		System.out.println("default constructor of class institute");
	}
	public Institution(String name, String founder, int since, String location, String branch, String hr,
			String website, long contact, int noOfStudents, int noOfTrainers) {
		this();
		this.name = name;
		this.founder = founder;
		this.since = since;
		this.location = location;
		this.branch = branch;
		this.hr = hr;
		this.website = website;
		this.contact = contact;
		this.noOfStudents = noOfStudents;
		this.noOfTrainers = noOfTrainers;
	}
	@Override
	public String toString() {
		return "Institution [name=" + name + ", founder=" + founder + ", since=" + since + ", location=" + location
				+ ", branch=" + branch + ", hr=" + hr + ", website=" + website + ", contact=" + contact
				+ ", noOfStudents=" + noOfStudents + ", noOfTrainers=" + noOfTrainers + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
	System.out.println("equal method of class Institution");
	if(obj instanceof Institution) {
		System.out.println("obj is instance of Institution");
		Institution casted= (Institution)obj;
		if(this.name.equals(casted.name) && this.contact==casted.contact&&this.branch.equals(casted.branch)&&this.founder. equals(casted.founder)&&this.hr.equals(casted.hr)&&this.location.equals(casted.location)&&this.noOfStudents==casted.noOfStudents&&this.noOfTrainers==casted.noOfTrainers&& this.since==casted.since&&this.website.equals(casted.website));
		System.out.println("both instances are same");
		return true;
	}
	else {
		System.out.println("obj is not instance of Institution");
	}
	return false;
	}
	
	

}
