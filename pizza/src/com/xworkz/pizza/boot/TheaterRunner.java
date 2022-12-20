package com.xworkz.pizza.boot;

import com.xworkz.pizza.dto.TheaterDTO;
import com.xworkz.pizza.exception.theater.InvalidDataException;
import com.xworkz.pizza.repository.theater.TheaterRepository;
import com.xworkz.pizza.repository.theater.TheaterRepositoryImplimentation;
import com.xworkz.pizza.service.theater.TheaterService;
import com.xworkz.pizza.service.theater.TheaterServiceImplimentation;

public class TheaterRunner {

	public static void main(String[] args) {
	TheaterDTO dto1=new TheaterDTO(1, "navarang", "rang", 500, "system");
	TheaterDTO dto2=new TheaterDTO(2, "mallikarjun", "cinema", 800, "system");
	TheaterDTO dto3=new TheaterDTO(3, "pvrs", "orian", 1000, "system");
	TheaterDTO dto4=new TheaterDTO(4, "bharath cinimas", "rang", 1500, "system");
	TheaterDTO dto5=new TheaterDTO(5, "lakshmi takies", "laksh", 300, "system");
	
	TheaterRepository repo=new TheaterRepositoryImplimentation();
	TheaterService service=new TheaterServiceImplimentation(repo);
	try {
		boolean save=service.saveAndValidate(dto1);
		System.out.println(save);
		service.saveAndValidate(dto2);
		service.saveAndValidate(dto3);
		service.saveAndValidate(dto4);
		service.saveAndValidate(dto5);
	} catch (InvalidDataException e) {
		
		e.printStackTrace();
	}
	}

	
}
