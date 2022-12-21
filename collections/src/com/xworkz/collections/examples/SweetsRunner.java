package com.xworkz.collections.examples;

import java.util.Collection;
import java.util.LinkedList;

public class SweetsRunner {

	public static void main(String[] args) {
		String Sweet1="kaju barfi";
		String Sweet2="payasa";
		String Sweet3="jamun";
		String Sweet4="mysore pak";
		String Sweet5="jangeer";
		String Sweet6="jalebi";
		String Sweet7="ladu";
		String Sweet8="modaka";
		String Sweet9="holige";
		String Sweet10="sompapudi";
		String Sweet11="halwa";
		String Sweet12="kobrimetai";
		String Sweet13="rasgulla";
		Collection<String> collection=new LinkedList();
		collection.add(Sweet1);
		collection.add(Sweet2);
		collection.add(Sweet3);
		collection.add(Sweet4);
		collection.add(Sweet5);
		collection.add(Sweet6);
		collection.add(Sweet7);
		collection.add(Sweet8);
		collection.add(Sweet9);
		collection.add(Sweet10);
		collection.add(Sweet11);
		collection.add(Sweet12);
		collection.add(Sweet13);
		System.out.println("size of collection before clearing "+collection.size());
		collection.clear();
		System.out.println("size of collection after clearing "+collection.size());
		
		
	}

}
