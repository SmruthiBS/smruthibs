package com.xworkz.example.pairs;

import java.util.Set;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class PG {

	public static void main(String[] args) {
	Map<String ,Double>map=new HashMap<String, Double>();
	map.put("venna pg", 5500d);
	map.put("kushi pg", 6500d);
	map.put("queens p pg", 5000d);
	map.put("  princess pg", 5500d);
	map.put("leela pg", 5700d);
	map.put("rakshitha pg", 7500d);
	map.put("deepika pg", 6500d);
	map.put("golden pg", 5500d);
	map.put("sri krishna pg", 5500d);
	map.put("guru pg", 5500d);
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
