package com.xworkz.collections.examples;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ShoesizeRunner {
	public static void main(String[] args) {
		Collection<Integer>size=new ArrayList<Integer>();
		size.add(7);
		size.add(8);
		size.add(9);
		size.add(10);
		size.add(11);
		size.add(12);
		size.add(13);
		size.add(14);
		size.add(15);
		size.add(40);
		size.add(41);
		size.add(42);
		size.add(43);
		size.add(44);
		size.add(45);
		size.add(46);
		System.out.println("size="+ size.size());
		System.out.println("iteration using for each loop");
		for(int ref:size) {
			System.out.println(ref);
		}
		System.out.println("iteration using iterator");
		Iterator<Integer>itr=size.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
		
		
		
		
		
	}

}
