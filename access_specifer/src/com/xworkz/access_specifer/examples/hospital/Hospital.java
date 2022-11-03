package com.xworkz.access_specifer.examples.hospital;

public class Hospital {
	public String name;
	public String location;
	public String dean;
	public int noOfDoctors;
	public int noOfPatients;
	public int noOfWard;
	public boolean government;
	public int noOfOOfts;
	public boolean lab;
	public long contact;
	public String district;
	 public void setName(String name) {
		this.name=name;
	}
	 void setLocation(String location) {
			this.location=location;
			}
	 
	void setDean(String dean) {
			 this.dean=dean; 
			 }
	void setCity(String district) {
			this.district=district; 
			}
	 void setNoOfwords(int noOfWard) {
			 this.noOfWard= noOfWard;
			 }
	void setContact(long Contact) {
			 this.contact=contact;
			 }
	void setNoOfpatients(int noOfPatients) {
			 this.noOfPatients=noOfPatients; 
			 }
	 void setPrice( int noOfOts) {
			this.noOfOOfts=noOfOOfts; 
			}
	void setGovernment( boolean government) {
			 this.government=government; 
			 }
	void setLab(boolean lab) {
			this.lab=lab;
			}
	void setNoOfDoctors(int noOfDoctors ) {
			 this.noOfDoctors=noOfDoctors;
			 }
		

	public String getName() {
		return this.name; }
	public long getContact() {
		return this.contact; }
	public String getDean() {
		return this.dean; }
	public String getDistrict() {
		return this.district; }
	public String getLocation() {
		return this.location; }
	public int getnoOfDoctors() {
		return this.noOfDoctors; }
	public boolean getGovernment() {
		return this.government; }
	public boolean getLab() {
		return this.lab; }
	public int getNoPatients() {
		return this.noOfPatients; }
	public int getNoOfOts() {
		return this.noOfOOfts; }
	public int NoOfward() {
		return this.noOfWard; }
	
	}
	
