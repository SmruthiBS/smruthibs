package com.xworkz.collections.examples;

import java.util.Collection;
import java.util.LinkedHashSet;

public class coupon {

	public static void main(String[] args) {
		Collection<String>collect =new LinkedHashSet();
		collect.add("amazon coupon");
		collect.add("zomato coupon");
		collect.add("myntra coupon");
		collect.add("trends coupon");
		collect.add("swiggy coupon");
		collect.add("dominos coupon");
		collect.add("ajio coupon");
		collect.add("bookmyshow coupon");
		collect.add("flipkart coupon");
		collect.add("mesho coupon");
		collect.add("blinkit coupon");
		collect.add("big basket coupon");
		System.out.println("size of collection before clearing "+collect.size());
		collect.clear();
		System.out.println("size of collection after clearing "+collect.size());
		

	}

}
