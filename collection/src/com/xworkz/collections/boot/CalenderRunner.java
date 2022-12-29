package com.xworkz.collections.boot;

import java.util.ArrayList;
import java.util.Collection;

import com.xworkz.collections.dto.CalenderDTO;
import com.xworkz.collections.dto.HolidayDTO;

public class CalenderRunner {
	public static void main(String[] args) {
		CalenderDTO dto1=new CalenderDTO("SBI", 2023, 35);
		CalenderDTO  dto2=new CalenderDTO("sunshine", 2023, 20);
		CalenderDTO  dto3=new CalenderDTO("vijaya", 2023, 25);
		CalenderDTO	 dto4=new CalenderDTO("king show", 2023, 15);
		CalenderDTO  dto5=new CalenderDTO("new year", 2023, 30);
		boolean equals = dto1.equals(dto3);
		System.out.println("equals " + equals);
		equals = dto2.equals(dto3);
		System.out.println("equals " + equals);
		Collection<CalenderDTO> airport = new ArrayList<CalenderDTO>();
		airport.add(dto5);
		airport.add(dto4);
		airport.add(dto3);
		airport.add(dto2);
		airport.add(dto1);
		boolean contains = airport.contains(dto1);
		System.out.println("contains " + contains);


		}


}
