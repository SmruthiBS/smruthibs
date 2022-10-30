package com.xworkz.association.boot;

import com.xworkz.association.constants.Gender;
import com.xworkz.association.examples.country.City;
import com.xworkz.association.examples.country.Country;
import com.xworkz.association.examples.country.Name;
import com.xworkz.association.examples.country.President;

public class CountryRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		President president =new President("droupadi murmu", 3, Gender.FEMALE);
		Name name1=new Name("pune", "poona", null);
		Name name2=new Name("bengaluru", "bendakaluru", null);
		City city1=new City(name1, false, 281);
		City city2=new City(name2, true, 741);
		City[] cities= {city1,city2};
		
		Country country=new Country("India",cities,president);
country.display();
city1.display();
city2.display();
		}
}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
		
		

	


