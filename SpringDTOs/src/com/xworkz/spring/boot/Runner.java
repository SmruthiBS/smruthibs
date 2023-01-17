package com.xworkz.spring.boot;

import com.xworkz.spring.dto.TerroristDTO;
import com.xworkz.spring.service.TerroristService;
import com.xworkz.spring.service.TerroristServiceImpl;

public class Runner {

	public static void main(String[] args) {
	TerroristDTO dto=new TerroristDTO("ranjeeth singh", "india", "KZF", "shooting", 42, true, true);
	System.out.println(dto);
	TerroristService service=new TerroristServiceImpl();
	service.validateAndSave(dto);
		}

}
