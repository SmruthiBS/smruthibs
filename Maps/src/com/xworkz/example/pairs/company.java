package com.xworkz.example.pairs;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class company {
	public static void main(String[] args) {
		Map<String,String>map=new HashMap<String,String>();
		map.put("facebook", "meta");
		map.put("whatsapp", "meta");
		map.put("eclipse", "oracle");
		map.put("VS code", "microsoft");
		map.put("instagram", "meta");
		map.put("gmail", "google");
		map.put("classroom", "google");
		map.put("teams", "microsoft");
		map.put("photos", "google");
		map.put("drive", "google");
		
	Set<String> keys=map.keySet() ;
	System.out.println("keys");
	keys.forEach(ele->System.out.println(ele));
	Collection<String> values=map.values();
	System.out.println("values");

	values.forEach(e->System.out.println(e));
	System.out.println("pair");
	System.out.println(map);

		}

	
	
	}


