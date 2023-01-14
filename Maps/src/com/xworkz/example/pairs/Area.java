package com.xworkz.example.pairs;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Area {
	public static void main(String[] args) {
		
	
	Map<Integer,String>map=new HashMap<Integer,String>();
	map.put(560063, "A F station yelahanka");
	map.put(560030, "adugodi");
	map.put(560034, "agara");
	map.put(560001, "banglore bazar");
	map.put(560060, "btm");
	map.put(560064, "rr nagar");
	map.put(560065, "jayanagar");
	map.put(560066, "rajajinagar");
	map.put(560067, "devanagundui");
	map.put(560068, "vidyaramyapuram");
	
Set<Integer> keys=map.keySet() ;
System.out.println("keys");
keys.forEach(ele->System.out.println(ele));
Collection<String> values=map.values();
System.out.println("values");

values.forEach(e->System.out.println(e));
System.out.println("pair");
System.out.println(map);

	}

}
