package com.xworkz.collections.examples;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class MetroCityRunner {
	public static void main(String[] args) {
		Collection<String>city=new LinkedHashSet<String>();
		city.add("delhi");
		city.add("mumbai");
		city.add("chennai");
		city.add("banglore");
		city.add("Kolkata");
		System.out.println("iteration using for each loop");
		for(String ref:city) {
			System.out.println(ref);
		}
		System.out.println("iteration using iterator");
		Iterator<String>itr=city.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
	}
	

}
