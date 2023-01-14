package com.xworkz.example.pairs;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Chocolates {

	public static void main(String[] args) {
		Map<String ,Double>map=new HashMap<String, Double>();
		map.put("kitkat", 40d);
		map.put("dairymilk", 180d);
		map.put("munch", 10d);
		map.put("kinderjoy", 35d);
		map.put("5 star", 15d);
		map.put("gems", 5d);
		map.put("milkyway", 30d);
		map.put("milkybar", 10d);
		map.put("toblerone", 100d);
		map.put("snickers", 20d);
	Set<String> keys=map.keySet() ;
	System.out.println("keys");
	keys.forEach(ele->System.out.println(ele));
	Collection<Double> values=map.values();
	System.out.println("values");

	values.forEach(e->System.out.println(e));
	System.out.println("pair");
	System.out.println(map);

		}

	}

