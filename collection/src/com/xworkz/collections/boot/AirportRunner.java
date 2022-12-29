package com.xworkz.collections.boot;

import java.util.ArrayList;
import java.util.Collection;

import com.xworkz.collections.dto.AirportDTO;
import com.xworkz.collections.dto.GamesDTO;

public class AirportRunner {

	public static void main(String[] args) {
		AirportDTO dto1=new AirportDTO("Kempegowda International Airport,", "Bengaluru", "international");
		AirportDTO dto2=new AirportDTO(". Mangalore Airport  ,", ". Mangalore  ", "international");
		AirportDTO dto3=new AirportDTO("Hubballi  Airport,", "Hubballi", "Domestic");
		AirportDTO dto4=new AirportDTO(" Belgaum Airport,", "Belgaum", "domestic");
		AirportDTO dto5=new AirportDTO("  Mysore Airport,", "Mysore", "domestic");
		boolean equals = dto1.equals(dto3);
		System.out.println("equals " + equals);
		equals = dto2.equals(dto3);
		System.out.println("equals " + equals);
		Collection<AirportDTO> airport = new ArrayList<AirportDTO>();
		airport.add(dto5);
		airport.add(dto4);
		airport.add(dto3);
		airport.add(dto2);
		airport.add(dto1);
		boolean contains = airport.contains(dto1);
		System.out.println("contains " + contains);


	}

}
