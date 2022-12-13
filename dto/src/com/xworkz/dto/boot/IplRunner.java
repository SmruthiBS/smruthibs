package com.xworkz.dto.boot;

import java.time.LocalDateTime;

import com.xworkz.dto.dto.*;

import com.xworkz.dto.repository.IplDTORpositoryImplimentation;

public class IplRunner {

	public static void main(String[] args) {
		IplDTORpositoryImplimentation ipl = new IplDTORpositoryImplimentation();
		IplDTO dto1 = new IplDTO("RCB", "Virat", 107, 113, true, 85.0);
		dto1.setCreatedBy("system");
		dto1.setCreatedDate(LocalDateTime.now());
		ipl.create(dto1);
		IplDTO dto2 = new IplDTO("RCB", "Virat", 107, 113, true, 85.0);
		IplDTO dto3 = new IplDTO("CSK", "MS Dhoni", 121, 86, true, 85.0);
		IplDTO dto4 = new IplDTO("MI", "Rohit Sharma", 129, 98, true, 85.0);
		IplDTO dto5 = new IplDTO("RR", "Sanju Samson", 94, 93, true, 85.0);
		IplDTO dto6 = new IplDTO("SRH", "Mayank Agarwal", 74, 74, true, 85.0);
		IplDTO dto7 = new IplDTO("KKR", "Shreyas Iyer", 113, 106, true, 85.0);
		IplDTO dto8 = new IplDTO("DC", "Rishabh Pant", 100, 118, true, 85.0);
		IplDTO dto9 = new IplDTO("Punjab kings", "", 98, 116, true, 85.0);
		IplDTO dto10 = new IplDTO("Gujarat Titans", "Hardik Pandya", 12, 4, true, 85.0);
		ipl.create(dto2);
		ipl.create(dto3);
		ipl.create(dto4);
		ipl.create(dto5);
		ipl.create(dto6);
		ipl.create(dto7);
		ipl.create(dto8);
		ipl.create(dto9);
		ipl.create(dto10);
		// ipl.create(dto10);
		System.out.println(dto1.getCreatedBy());
		 System.out.println(dto1.getCreatedDate());

	}

}
