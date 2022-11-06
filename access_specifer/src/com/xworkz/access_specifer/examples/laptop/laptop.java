package com.xworkz.access_specifer.examples.laptop;

public class laptop {
	public String brand="suv";
	public String model="nighteagle";
	public String colour="black";
    public String owner="ranesh";
    public int noOfcameras=5;
    public boolean working=true;
    public String os ="android";
    public double price=340000;
     public int rating=4;
	public int memory=64;
	public float ScreenSize=0;

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
		 void setcameras(int noOfcameras) {
				 this.noOfcameras= noOfcameras;
				 }
		void setprice(double price) {
				 this.price=price;
				 }
		void setRating(int noOfPeople) {
				 this.rating=rating; 
				 }
		 void setOs( String os) {
				this.os=os; 
				}
		void setWorking( boolean working) {
				 this.working=working; 
				 }
		void setMemory(int memory) {
				this.memory=memory;
				}
		void setScreenSize(float screeSize ) {
				 this.ScreenSize=ScreenSize;
				 }
		public String getbrand() {
			return this.brand; }
		public String getmodel() {
			return this.model; }
		public String getOwner() {
			return this.owner; }
		public int  getnoOfcameras() {
			return this.noOfcameras; }
		public int getmemory() {
			return this.memory; }
		public String getos() {
			return this.os; }
		public boolean getWorking() {
			return this.working; }
		public float getScreenSize() {
			return this.ScreenSize; }
		public int getRating() {
			return this.rating; }
		public double getPrice() {
			return this.price; }
		public String getcolour() {
			return this.colour; }
	

}
