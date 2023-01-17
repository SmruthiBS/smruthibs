package com.xworkz.example.pairs;

import java.util.Map;
import java.util.TreeMap;

public class mobile {
	public static void main(String[] args) {
		Map<String, Integer>map=new TreeMap<String, Integer>();
		map.put("oppo", 30000);
		map.put("vivo", 15000);
		map.put("redmi note 9", 12000);
		map.put("redmi note 5 pro", 18000);
		map.put("redmi note 5", 15000);
		map.put("realme note s", 25000);
		map.put("oneplus", 20000);
		map.put("redmi note 5", 18000);
		map.put("realme note", 9000);
		map.put("relme  1 plus", 100000);
		System.out.println("Printing all key values in capital letters");
		map.forEach((k, v) -> System.out.println("Mobile :" + k.toUpperCase() + " Price :" + v));

		System.out.println(System.lineSeparator());
		System.out.println("Printing all entries if price is greater than 50000");
		map.forEach((k, v) -> {
			if (v > 10000) {
				System.out.println("Mobile :" + k + " Price :" + v);
			}
		});

		System.out.println(System.lineSeparator());
		System.out.println("Printing all entries k is less than 5 characters");
		map.forEach((key, value) -> {
			if (key.length() < 5) {
				System.out.println("Mobile :" + key + " Price :" + value);
			}
		});
		System.out.println(System.lineSeparator());

		System.out.println("Printing all entries in descending order");
		map.forEach((k, v) -> System.out.println("Mobile :" + k + " Price :" + v));
	}

		
	
}
