package com.xworkz.collections.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import com.xworkz.collections.dto.SanitizerDTO;

public class SanitizerRunner {

	public static void main(String[] args) {
		SanitizerDTO dto1=new SanitizerDTO(1, "lifebuoy", 245, "clear");
		SanitizerDTO dto2=new SanitizerDTO(2, "savlon", 249, "blue");
		SanitizerDTO dto3=new SanitizerDTO(3, "himalaya", 241, "orange");
		SanitizerDTO dto4=new SanitizerDTO(4, "himalaya", 205, "clear");
		SanitizerDTO dto5=new SanitizerDTO(5, "presto",410, "green");
		SanitizerDTO dto6=new SanitizerDTO(6, "sterlomax", 645, "pink");
		SanitizerDTO dto7=new SanitizerDTO(7, "detol", 193, "clear");
		SanitizerDTO dto8=new SanitizerDTO(8, "salimo", 300, "clear");
		SanitizerDTO dto9=new SanitizerDTO(9, "purell", 200, "clear");
		SanitizerDTO dto10=new SanitizerDTO(10, "sterillium", 150, "clear");
		
		Collection<SanitizerDTO>sanitizer=new ArrayList<SanitizerDTO>();
		sanitizer.add(dto10);
		sanitizer.add(dto9);
		sanitizer.add(dto8);
		sanitizer.add(dto7);
		sanitizer.add(dto6);
		sanitizer.add(dto5);
		sanitizer.add(dto4);
		sanitizer.add(dto3);
		sanitizer.add(dto2);
		sanitizer.add(dto1);
		Iterator<SanitizerDTO>price=sanitizer.iterator();
		while(price.hasNext()) {
			SanitizerDTO element=price.next();
		if(element.getBrand().length()>5) {
			System.out.println("price is greater than 5 "+element);
		}
		}
		Iterator<SanitizerDTO>nullCheck=sanitizer.iterator();
		while(nullCheck.hasNext()) {
			SanitizerDTO element=nullCheck.next();
			if(element.getBrand()==null||element.getColor()==null||element.getId()==0||element.getPrice()==0) {
				System.out.println( "there is a null value in "+element);
			}

			Iterator<SanitizerDTO> max =sanitizer.iterator();
			while (max.hasNext()) {
				SanitizerDTO big = max.next();
				if (element.getPrice() >= 300) {
					System.out.println("Printing sanitizer max rupees " + big);
				}

			}
			Iterator<SanitizerDTO> secondMax = sanitizer.iterator();
			while (secondMax.hasNext()) {
				SanitizerDTO secondBig = secondMax.next();
				if (element.getPrice() >= 250) {
					System.out.println("Printing sanitizer second Max " + element);
				}
			}
		

	}
		Iterator<SanitizerDTO>colourCheck=sanitizer.iterator();
		while(colourCheck.hasNext()) {
			SanitizerDTO element=colourCheck.next();
			if(element.getColor()=="green"||element.getColor()=="red"||element.getColor()=="blue") {
				colourCheck.remove();
				System.out.println("element removed "+element);
			}
			Iterator<SanitizerDTO> min = sanitizer.iterator();
			while (min.hasNext()) {
				SanitizerDTO small = min.next();
				if (element.getPrice() < 100) {
					System.out.println("Printing sanitizer is minimum rupees " + small);
				}
			}
	
}
		
		
		
}
}

