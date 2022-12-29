package com.xworkz.collections.boot;

import java.util.ArrayList;
import java.util.Collection;

import com.xworkz.collections.dto.HolidayDTO;



public class HolidayRunner {

	public static void main(String[] args) {
		HolidayDTO dto1=new HolidayDTO("deepavali", "23 november", "festival");
		HolidayDTO  dto2=new HolidayDTO("independence day", "15th agust", "national holiday");
		HolidayDTO  dto3=new HolidayDTO("republic day", "26th jan", "national holiday");
		HolidayDTO 	 dto4=new HolidayDTO("may day", "may 1", "national holiday");
		HolidayDTO  dto5=new HolidayDTO("kannada rajyosthva", "1st nov", "regional holiday");
		boolean equals = dto1.equals(dto3);
		System.out.println("equals " + equals);
		equals = dto2.equals(dto3);
		System.out.println("equals " + equals);
		Collection<HolidayDTO> airport = new ArrayList<HolidayDTO>();
		airport.add(dto5);
		airport.add(dto4);
		airport.add(dto3);
		airport.add(dto2);
		airport.add(dto1);
		boolean contains = airport.contains(dto1);
		System.out.println("contains " + contains);


		}

	}


