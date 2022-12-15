package com.xworkz.pizza.boot;

import java.time.LocalDateTime;

import com.xworkz.pizza.constant.Color;
import com.xworkz.pizza.constant.Type;
import com.xworkz.pizza.dto.HelmetDTO;
import com.xworkz.pizza.repository.helmet.HelmetRepository;
import com.xworkz.pizza.repository.helmet.HelmetRepositoryImplimentation;
import com.xworkz.pizza.service.helmet.HelmetService;
import com.xworkz.pizza.service.helmet.HelmetServiceImplimentation;

public class HelmetRunner {

	public static void main(String[] args) {
		HelmetDTO dto = new HelmetDTO(" Royal Enfield", 750d, Color.BLACK, Type.FULL);
		//dto.setColour(Color.BLUE);
		HelmetRepository repo = new HelmetRepositoryImplimentation();
		HelmetService service = new HelmetServiceImplimentation(repo);
		boolean sucess = service.saveAndVlidate(dto);
		System.out.println("sucess " + sucess);
	}

}
