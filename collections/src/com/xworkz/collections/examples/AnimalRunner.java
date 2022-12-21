package com.xworkz.collections.examples;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

public class AnimalRunner {

	public static void main(String[] args) {
		String animal1="dog";
		String animal2="cat";
		String animal3="elephant";
		String animal4="panda";
		String animal5="lion";
		String animal6="tiger";
		String animal7="rabbit";
		String animal8="horse";
		String animal9="goat";
		String animal10="sheep";
		Collection<String> animal=new LinkedList<String>();
		animal.add(animal10);
		animal.add(animal9);
		animal.add(animal8);
		animal.add(animal7);
		animal.add(animal6);
		animal.add(animal5);
		animal.add(animal4);
		animal.add(animal3);
		animal.add(animal2);
		animal.add(animal1);
		System.out.println("iteration using for each loop");
		for(String ref:animal) {
			System.out.println(ref);
			System.out.println("iteration using iteratior");
			Iterator<String>iterate=animal.iterator();
			while(iterate.hasNext()) {
				System.out.println(iterate.next());
			}
		}
		
		

	}

}
