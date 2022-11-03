package com.xworkz.access_specifer.examples.Jeep;

public class Jeep {
	public String brand="suv";
	public String model="nighteagle";
	public String colour="black";
    public String owner="ranesh";
    public int noOfseats=5;
    public boolean own=true;
    public boolean rented=false;
    public double price=340000;
     public int noOfPeople=4;
	public String no="ka181285";
	public int rent=0;
	
	
	
	  void setbrand(String brand) {
			this.brand=brand;
		}
		 void setmodel(String model ) {
				this.model=model;
				}
		 
		void setcolour(String colour) {
				 this.colour=colour; 
				 }
		void setOwner(String owner) {
				this.owner=owner; 
				}
		 void setNoseats(int noOfseats) {
				 this.noOfseats= noOfseats;
				 }
		void setprice(double price) {
				 this.price=price;
				 }
		void setNoOfpeople(int noOfPeople) {
				 this.noOfPeople=noOfPeople; 
				 }
		 void setRent( int rent) {
				this.rent=rent; 
				}
		void setOwn( boolean own) {
				 this.own=own; 
				 }
		void setRented(boolean rented) {
				this.rented=rented;
				}
		void setNo(String no ) {
				 this.no=no;
				 }
		public String getbrand() {
			return this.brand; }
		public String getmodel() {
			return this.model; }
		public String getOwner() {
			return this.owner; }
		public int  getnoOfseats() {
			return this.noOfseats; }
		public int getNoOfpeople() {
			return this.noOfPeople; }
		public String getno() {
			return this.no; }
		public boolean getown() {
			return this.own; }
		public boolean getRented() {
			return this.rented; }
		public int getRent() {
			return this.rent; }
		public double getPrice() {
			return this.price; }
		public String getcolour() {
			return this.colour; }
	
			// TODO Auto-generated method stub
			
		}



