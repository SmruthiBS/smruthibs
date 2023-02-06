package com.xworkz.goa.controller;




import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.goa.dto.CasinoDTO;

@Component
@RequestMapping("/submit")
public class CasinoController {
	public CasinoController() {
		System.out.println("created "+this.getClass().getSimpleName());
	}
	@PostMapping
	public String onSubmit(CasinoDTO dto,Model model) {
		System.out.println("running casino "+dto);
	model.addAttribute("name",dto.getName());
	model.addAttribute("cruise",dto.getCruise());
	model.addAttribute("entryfee",dto.getEntryfee());
	model.addAttribute("freeFood",dto.getFreeFood());
	model.addAttribute("freeAlcohol",dto.getFreeAlcohol());
		return "CasinoSucess.jsp";
	}
	

}
