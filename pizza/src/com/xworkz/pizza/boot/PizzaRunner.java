package com.xworkz.pizza.boot;

import java.time.LocalDateTime;

import com.xworkz.pizza.constant.PizzaSize;
import com.xworkz.pizza.dto.AbstractAuditDTO;
import com.xworkz.pizza.dto.PizzaDTO;
import com.xworkz.pizza.service.PizzaService;
import com.xworkz.pizza.service.PizzaServiceImplimentation;

public class PizzaRunner {

	public static void main(String[] args) {
		PizzaDTO dto=new PizzaDTO("veggie loaded", "dominos", PizzaSize.MEDIUM, false, 250, "veegies", "veg","system",LocalDateTime.now());
		PizzaService service=new PizzaServiceImplimentation();
		service.validateAndSave(dto);
		//dto.setCreatedBy("system");
		//dto.setCreatedDate(LocalDateTime.now());
	//	System.out.println(dto.getCreatedBy());
		//System.out.println(dto.getCreatedDate());
		System.out.println(dto.toString());
		

	}

}
