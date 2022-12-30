package com.xworkz.collections.examples;

import java.util.ArrayList;
import java.util.List;

public class ListRunner {

	public static void main(String[] args) {
		List<String>list=new ArrayList<String>();
		System.out.println("**********ADDING***********");
		list.add("A");
		list.add("E");
		list.add("I");
		list.add("U");
		list.add(3, "O");//adds O at index 3
		list.add("B");
		list.add("c");
		for (String string : list) {
			System.out.println(string);
		}
		System.out.println("**********REMOVING***********");
		list.remove(6);//removes element at index 6
		list.remove("B");//removes element B
		for (String string : list) {
			System.out.println(string);
			
		}
		System.out.println("**********UPDATING***********");
		list.set(0, "vowels");//updates values at index 0 to vowels
		list.add(1, "A");
		for (String string : list) {
			System.out.println(string);
			
		}
	
		

	}

}
