package com.xworkz.association.boot;

import com.xworkz.association.examples.person.*;

public class PersonRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Country country=new Country("india","delhi", 3287263,"Droupadi Murmu" );
State state= new State("karnataka","banglore",191791,"basavaraj bommai");
City city=new City("banglore", true, "bendakaluru",741 );
Location location=new Location(3, "swami vivekananda road", city, state, country);
Address address=new Address(location);
Company company =new Company("google", "Alphabet Inc.", address);
Job job=new Job(100000," sofware developer",true,company);
Email mail1 =new Email("radha@gmail.com","radha@123",94498840,company);
Email mail2 =new Email("radha@google.com","radha@123",94498840,company);
 Email[] mails= {mail1,mail2};



Person person=new Person("radha", job);
person.setMails(mails);
person.display();



	}

}
