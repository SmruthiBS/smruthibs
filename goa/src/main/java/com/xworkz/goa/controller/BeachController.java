package com.xworkz.goa.controller;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.goa.dto.BeachDTO;

@Component
@RequestMapping("/send")
public class BeachController {
	public BeachController() {
	System.out.println("created "+this.getClass().getSimpleName());
	}
@PostMapping	
public String onPlay(BeachDTO dto, Model model) {
	System.out.println("running beach "+dto);
	model.addAttribute("name",dto.getName());
	model.addAttribute("location",dto.getLocation());
	model.addAttribute("clean",dto.isClean());
	model.addAttribute("games",dto.isGames());
	
return "BeachSucess.jsp";
}

}