package com.xworkz.collections.examples;

import java.util.Collection;

import java.util.TreeSet;

public class currencies {
	public static void main(String[] args) {
	String currency1=" United States Dollar";
	String currency2="Rupee";
	String currency3="Euro";
	String currency4="Ruble";
	String currency5="Chinese Yuan";
	String currency6="Afghan Afghani";
	String currency7="The UAE Dirham";
	String currency8="Thai Baht";
	String currency9="Turkish lira";
	String currency10="Egyptian Pound";
	String currency11="Australian Dollar";
	String currency12="Canadian Dollar";
	String currency13="Argentine Peso";
	String currency14="New Zealand Dollar";
	String currency15="naira";
	String currency16="Norwegian Krone";
	String currency17="Danish Krone";
	String currency18="Hungarian Forint";
	String currency19="Hong Kong Dollar";
	String currency20="Swedish Krona";
	String currency21="Singapore Dollar";
	String currency22="Ukrainian hryvnia";
	String currency23="Pakistani Rupee";
	String currency24="Nepalese Rupee ";
	String currency25="Malaysian Ringgit ";
	String currency26="Kazakhstani Tenge ";
	Collection<String> collection=new TreeSet<String>();
	collection.add(currency1);
	collection.add(currency2);
	collection.add(currency3);
	collection.add(currency4);
	collection.add(currency5);
	collection.add(currency6);
	collection.add(currency7);
	collection.add(currency8);
	collection.add(currency9);
	collection.add(currency10);
	collection.add(currency11);
	collection.add(currency12);
	collection.add(currency13);
	collection.add(currency14);
	collection.add(currency15);
	collection.add(currency16);
	collection.add(currency17);
	collection.add(currency18);
	collection.add(currency19);
	collection.add(currency20);
	collection.add(currency21);
	collection.add(currency22);
	collection.add(currency23);
	collection.add(currency24);
	collection.add(currency25);
	collection.add(currency26);
	System.out.println("size of collection before clearing "+collection.size());
	collection.clear();
	System.out.println("size of collection after clearing "+collection.size());
	

}
}

