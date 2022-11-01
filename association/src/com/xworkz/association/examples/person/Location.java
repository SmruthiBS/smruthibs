package com.xworkz.association.examples.person;

public class Location {
	public int no;
	public String street;
	public City city;
	public State state;
	public Country country;
	public Location(int no, String street, City city, State state, Country country) {
		super();
		this.no = no;
		this.street = street;
		this.city = city;
		this.state = state;
		this.country = country;
	}
public void display()
{
	System.out.println(this.no);
	System.out.println(this.street);
	if (city!=null)
	{
		city.display();
	}
	else
		System.out.println("city is null");
	if(state!=null) {
		state.display();
		}
	else
		System.out.println("state is null");
	if(country!=null) {
		country.display();
		}
	else
		System.out.println("country is null");
	
}

	// TODO Auto-generated method stub
	
}

