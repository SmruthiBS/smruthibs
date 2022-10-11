package first.com.xworkz.copy.boot;

import first.com.xworkz.copy.things.Developer;

public class DeveloperRunner {
	public static void main(String[] args) {
		Developer dev=new Developer();
		dev.name="latha";
		dev.education="B.E";
		dev.experince=5;
		dev.company="amazon";
		dev.salary=45000d;
		System.out.println("name= "+dev.name);
		System.out.println( "company= "+dev.company);
		System.out.println( "experience= "+dev.experince);
		System.out.println("salary = "+dev.salary);
		System.out.println( "educatiom= "+dev.education);
		
		
				
				
		
	}

}
