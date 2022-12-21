package com.xworkz.collections.examples;

import java.util.Collection;
import java.util.Iterator;
import java.util.TreeSet;

public class WatchRunner {

	public static void main(String[] args) {
		Collection<String>watch=new TreeSet<String>();
		watch.add("sonata");
		watch.add("fossil");
		watch.add("rolex");
		watch.add("fastrack");
		watch.add("apple");
		System.out.println("iteration using for each loop");
		for(String ref:watch) {
			System.out.println(ref);
		}
		System.out.println("iteration using iterator");
		Iterator<String>itr=watch.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		

	}

}
