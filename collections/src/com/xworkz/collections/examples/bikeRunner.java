package com.xworkz.collections.examples;

import java.util.Collection;
import java.util.LinkedHashSet;

public class bikeRunner {
	public static void main(String[] args) {
	Collection<String>collect=new LinkedHashSet();
	collect.add("Yamaha MT 15 V2");
	collect.add("Royal Enfield Classic 350");
	collect.add("Royal Enfield Hunter 350");
	collect.add("Yamaha R15S");
	collect.add("Hero Splendor Plus");
	collect.add("TVS Raider");
	collect.add("TVS Apache RTR 160");
	collect.add("Royal Enfield Bullet 350");
	collect.add("Kawasaki Ninja H2");
	collect.add("Bajaj Pulsar NS200");
	collect.add("Yamaha R15 V4");
	collect.add("KTM 390 Duke");
	collect.add("TVS Apache RTR 160 4V");
	collect.add("Ducati DesertX");
	collect.add("Royal Enfield Meteor 350");
	collect.add("Hero HF Deluxe");
	collect.add("Jawa 42");
	collect.add("Yezdi Roadster ");
	System.out.println("size of collection before clearing "+collect.size());
	collect.clear();
	System.out.println("size of collection after clearing "+collect.size());
	
	
	}

}
