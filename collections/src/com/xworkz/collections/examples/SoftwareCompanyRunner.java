package com.xworkz.collections.examples;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class SoftwareCompanyRunner {
	public static void main(String[] args) {
		Collection<String>company=new LinkedHashSet<String>();
		company.add("TCS");
		company.add("wipro");
		company.add("infosys");
		company.add(" HCL Technologies");
		company.add(" Sonata Software");
		company.add(" Mphasis Limited");
		company.add("Larsen & Toubro Infotech Limited");
		company.add("Tech Mahindra");
		company.add(" Fueled");
		company.add("Cognizant");
		company.add("Eclerx");
		company.add("Accenture");
		company.add("Oracle");
		company.add("IBM");
		company.add(" Capgemini ");
		company.add("  Hexaware ");
		company.add(" ITC Infotech");
		company.add("WNS Global");
		company.add("  Rolta");
		company.add(" ntt data");
		System.out.println(company.size());
		System.out.println("iteration using for each loop");
		for(String ref:company) {
			System.out.println(ref);
		}
		System.out.println("iteration using iterator");
		Iterator<String>itr=company.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
		
		company.add("");
		company.add("");
		company.add("");
		company.add("");
		
	}

}
