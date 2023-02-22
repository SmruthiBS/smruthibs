package com.xworkz.aeroplane.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.xworkz.aeroplane.dto.AeroplaneDTO;
import com.xworkz.aeroplane.service.AeroplaneService;

@Controller
@RequestMapping("/")
public class AeroplaneController {
	private List<String> type = Arrays.asList("Passenger", "Cargo", "FighterPlane", "PrivateJet", "JamboPlane");
	private List<String> country = Arrays.asList("India", "USA", "Rassia", "Canada", "China");
	@Autowired
	private AeroplaneService service;
public AeroplaneController() {
	System.out.println("created "+this.getClass().getSimpleName());
}
@GetMapping("plane")
public String onAir(Model model) {
	System.out.println("Running onAir in controller");
	model.addAttribute("type", type);
	model.addAttribute("country", country);
	return "Registration";
}
@PostMapping("plane")
public String onAir(Model model, AeroplaneDTO dto) {
	System.out.println("Running onAir in post in controller");
	Set<ConstraintViolation<AeroplaneDTO>> violations = this.service.validateAndSave(dto);
	if (violations.isEmpty()) {
		System.out.println("no violations in controller,goto next page");
		model.addAttribute("company", dto.getCompany());
		model.addAttribute("name", dto.getName());
		model.addAttribute("cost", dto.getCost());
		model.addAttribute("type", dto.getType());
		model.addAttribute("country", dto.getCountry());
		return "Registration";

	}
	model.addAttribute("type", type);
	model.addAttribute("country", country);
	model.addAttribute("errors", violations);
	System.err.println("violations in controller");
	return "Registration";

}

@GetMapping("find")
public String onSearch(@RequestParam int id,Model model) {
	System.out.println("Running on Search for id"+id);
	AeroplaneDTO dto=this.service.findById(id);
	if(dto!=null) {
		model.addAttribute("dto",dto);
		
	}else {
		model.addAttribute("message", "data not Found");
	}
	return "Search";
	
}
}
