package com.xworkz.example.pairs;

import java.util.Map;
import java.util.TreeMap;

public class Player {

	public static void main(String[] args) {
	Map<String, String>map=new TreeMap<String, String>();
	map.put("usa", "Joe Biden");
	map.put("africa", "Cyril Ramaphosa");
	map.put("austrilla", "Anthony Albanese");
	map.put("bhutan", "Lotay Tshering,");
	map.put("brazil", "Luiz Inácio Lula da Silva");
	map.put("canda", "r Justin Trudeau");
	map.put("uk", "Rishi Sunak MP.");
	map.put("russia", "Vladimir Putin");
	map.put("india", "Droupadi Murmu");
	map.put("china", "Xi Jinping,");
	map.put("japan", "Fumio Kishida");
	map.put("north korea", "Kim Jong-un");
	map.put("south korea", "Yoon Suk Yeol");
	map.put("new zeeland", "Jacinda Ardern");
	map.put("nepal", "Bidhya Devi Bhandari");
	map.put("sri lanka", "Ranil Wickremesinghe");
	map.put("uae", "Mohammed bin Zayed Al Nahyan");
	map.put("finland", "Sauli Niinistö");
	map.put("netherlands", "Mark Rutte");
	map.put("germany", "Frank-Walter Steinmeier");
	System.out.println("=========Sorting the map ascending order=========");   
	map.forEach((k, v) -> System.out.println("President :" + k + ":: Country :" + v));

	System.out.println(System.lineSeparator());
	System.out.println("Updating president name if country length is greater than ");
	System.out.println("___________________________________________________________");
	map.forEach((key, values) -> {
		System.out.println("country:" + key + ":: president :" + values);
		if (key.length() > 20) {
			map.replace(" Múte Bourup Egede", "greenland");
		}
	});

	}

}
