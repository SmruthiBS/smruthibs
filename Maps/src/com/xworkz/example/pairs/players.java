package com.xworkz.example.pairs;

import java.util.Map;
import java.util.TreeMap;

public class players {

	public static void main(String[] args) {
		Map<String, Integer> map=new TreeMap<String, Integer>();
		map.put("virat", 30000);
		map.put("kl rahul", 10000);
		map.put("rahul dravid", 15000);
		map.put("rohit sharma", 9000);
		map.put("ms dhoni", 50000);
		System.out.println("____________________________________________________________");
		System.out.println("Sorting in descending order");
		map.forEach((k, v) -> System.out.println("Player :" + k + ":: Runs :" + v));
		System.out.println("____________________________________________________________");
		System.out.println(System.lineSeparator());
		System.out.println("Removing an entry if runs is lesser than 10000");
		System.out.println("____________________________________________________________");
		map.forEach((key, values) -> {
			if (values < 10000) {
				map.remove(key, values);
				System.out.println("Player:" + key + ":: Runs :" + values);
			}
		});
	
	}

}
