package com.xworkz.access_specifer.examples.house;

public class House {
	public String name="kushi";
	public String location="banglore";
	public String head="ramesh";
	public int noOfchildren=2;
	public int noOfPeople=4;
	public int no=4;
	public boolean own=true;
	public int rent=0;
	public boolean rented=false;
	public int ward=5 ;
	public String owner="ramesh";
	 public void setName(String name) {
			this.name=name;
		}
		 void setLocation(String location) {
				this.location=location;
				}
		 
		void setHead(String head) {
				 this.head=head; 
				 }
		void setOwner(String owner) {
				this.owner=owner; 
				}
		 void setNoChildren(int noOfchildren) {
				 this.noOfchildren= noOfchildren;
				 }
		void setWard(int ward) {
				 this.ward=ward;
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
		void setNo(int no ) {
				 this.no=no;
				 }
		public String getName() {
			return this.name; }
		public String getLocation() {
			return this.location; }
		public String getOwner() {
			return this.owner; }
		public int  getnoOfChildren() {
			return this.noOfchildren; }
		public int getNoOfpeople() {
			return this.noOfPeople; }
		public int getno() {
			return this.no; }
		public boolean getown() {
			return this.own; }
		public boolean getRented() {
			return this.rented; }
		public int getRent() {
			return this.rent; }
		public String getHead() {
			return this.head; }
		public int ward() {
			return this.ward; }

}
