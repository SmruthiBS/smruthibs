package com.xworkz.access_specifer.examples.island;

public class Island {
	public String name="lakshadeep";
	public String state="karnataka";
	public String city="banglore";
	public double area=200;
	public int noOfVisitors=1200;
	public double  price=800;
	public String modeOfTransport="boat";
	public long bookingContact=123456789;
	public String timings="9:00 to 5:00";
	public String bookingWebsite="lak.com";
	public int overallRating=3;
	
public void setName(String name) {
		 this.name=name; 
		 }
 void setArea(double area) {
		this.area=area;
		}
 
void setState(String state) {
		 this.state=state; 
		 }
void setCity(String city) {
		this.city=city; 
		}
 void setBookingWebsite(String bookingWebsite) {
		 this.bookingWebsite=bookingWebsite;
		 }
void setBookingContact(long bookingContact) {
		 this.bookingContact=bookingContact;
		 }
void setModeOfTransport(String modeOfTransport) {
		 this.modeOfTransport=modeOfTransport; 
		 }
 void setPrice( double price) {
		this.price=price; 
		}
void setNoVisitors( int noOfVisitors) {
		 this.noOfVisitors=noOfVisitors; 
		 }
void setTimings(String timings) {
		this.timings=timings;
		}
void setOverallingRating(int overallRating ) {
		 this.overallRating=overallRating;
		 }
	

public String getName() {
	return this.name; }
public double getArea() {
	return this.area; }
public String getState() {
	return this.state; }
public String getCity() {
	return this.city; }
public String getBookingWebsite() {
	return this.bookingWebsite; }
public long getBookingContact() {
	return this.bookingContact; }
public String getModeOfTransport() {
	return this.modeOfTransport; }
public double getPrice() {
	return this.price; }
public int getNoVisitors() {
	return this.noOfVisitors; }
public String getTimings() {
	return this.timings; }
public int getOverallingRating() {
	return this.overallRating; }
}


