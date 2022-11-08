package com.xworkz.inheitance.boot;

import com.xworkz.inheitance.child.jail.CentralJail;
import com.xworkz.inheitance.child.jail.DistrictJail;
import com.xworkz.inheitance.child.jail.SubJail;
import com.xworkz.inheitance.examples.Jail;

public class JailRunner {
public static void main(String[] args) {
		
		Jail jail=new Jail();
		System.out.println(jail.name);
		System.out.println(jail.place);
		
		Jail jail1=new CentralJail();
		CentralJail centraljail=(CentralJail)jail1;
		System.out.println(centraljail.name);
		System.out.println(centraljail.place);
		System.out.println(centraljail.noOfPrisoners);
		System.out.println(centraljail.noOfCells);
		
		DistrictJail jail2=new DistrictJail();
		DistrictJail districtjail=(DistrictJail)jail2;
		System.out.println(districtjail.name);
		System.out.println(districtjail.place);
		System.out.println(districtjail.location);
		System.out.println(districtjail.noOfSecurity);
		
		Jail jail3=new SubJail();
		SubJail subjail=(SubJail)jail3;
		System.out.println(subjail.name);
		System.out.println(subjail.place);
		System.out.println(subjail.jailHead);
		System.out.println(subjail.district);

		
	}


}
