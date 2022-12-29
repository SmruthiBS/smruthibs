package com.xworkz.collections.boot;

import java.util.ArrayList;
import java.util.Collection;

import com.xworkz.collections.dto.AirportDTO;
import com.xworkz.collections.dto.PlaceDTO;

public class PlaceRunner {

	public static void main(String[] args) {
	PlaceDTO dto1=new PlaceDTO("shimoga", "karnataka", "shimoga");
	PlaceDTO dto2=new PlaceDTO("agra", "uttar pradesh", "agra");
	PlaceDTO dto3=new PlaceDTO("kupalli", "karnataka", "shimoga");
	PlaceDTO dto4=new PlaceDTO("jog falls", "karnataka", "shimoga");
	PlaceDTO dto5=new PlaceDTO("sagara", "karnataka", "shimoga");
	boolean equals = dto1.equals(dto3);
	System.out.println("equals " + equals);
	equals = dto2.equals(dto3);
	System.out.println("equals " + equals);
	Collection<PlaceDTO> airport = new ArrayList<PlaceDTO>();
	airport.add(dto5);
	airport.add(dto4);
	airport.add(dto3);
	airport.add(dto2);
	airport.add(dto1);
	boolean contains = airport.contains(dto1);
	System.out.println("contains " + contains);


	}

}
