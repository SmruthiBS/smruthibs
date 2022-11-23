package com.xworkz.equal.examples;

public class Hospital {
	private String name;
	private String location;
	private String headDoctor;
	private int noOfbeds;
	private int noOPfPatients;
	private int rating;
	private int noOfStaffs;
	private String website;
	private long contact;
	public Hospital() {
		super();
	}
	public Hospital(String name, String location, String headDoctor, int noOfbeds, int noOPfPatients, int rating,
			int noOfStaffs, String website, long contact) {
		super();
		this.name = name;
		this.location = location;
		this.headDoctor = headDoctor;
		this.noOfbeds = noOfbeds;
		this.noOPfPatients = noOPfPatients;
		this.rating = rating;
		this.noOfStaffs = noOfStaffs;
		this.website = website;
		this.contact = contact;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getHeadDoctor() {
		return headDoctor;
	}
	public void setHeadDoctor(String headDoctor) {
		this.headDoctor = headDoctor;
	}
	public int getNoOfbeds() {
		return noOfbeds;
	}
	public void setNoOfbeds(int noOfbeds) {
		this.noOfbeds = noOfbeds;
	}
	public int getNoOPfPatients() {
		return noOPfPatients;
	}
	public void setNoOPfPatients(int noOPfPatients) {
		this.noOPfPatients = noOPfPatients;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public int getNoOfStaffs() {
		return noOfStaffs;
	}
	public void setNoOfStaffs(int noOfStaffs) {
		this.noOfStaffs = noOfStaffs;
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
	@Override
	public String toString() {
		return "Hospital [name=" + name + ", location=" + location + ", headDoctor=" + headDoctor + ", noOfbeds="
				+ noOfbeds + ", noOPfPatients=" + noOPfPatients + ", rating=" + rating + ", noOfStaffs=" + noOfStaffs
				+ ", website=" + website + ", contact=" + contact + "]";
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		System.out.println("equals method of class hospital");
		if(obj instanceof Hospital) {
			System.out.println("obj is instance of class hospital");
			Hospital casted =(Hospital)obj;
			if (this.contact==casted.contact&&this.headDoctor.equals(casted.headDoctor)&&this.location.equals(casted.location)&& this.name.equals(casted.name)&&this.noOfbeds==casted.noOfbeds){
				System.out.println("instances are same");
				return true;
			}
		}
		else {
			System.out.println("obj not instance of hospital");
		}
	return false;
	}

}
