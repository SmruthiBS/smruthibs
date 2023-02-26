package com.xworkz.smruthi_xworkz.controller;

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


import com.xworkz.smruthi_xworkz.dto.ZooDTO;
import com.xworkz.smruthi_xworkz.service.ZooService;

@Controller
@RequestMapping("/")
public class ZooContoller {
	private List<String> visitorType = Arrays.asList("child", "adult", "senior citizen" );
	@Autowired
	private ZooService service;
public ZooContoller() {
	System.out.println("created "+this.getClass().getSimpleName());
}
@GetMapping("fun")
public String onFun(Model model) {
	System.out.println("Running onAir in controller");
	model.addAttribute("visitorType",visitorType );
	return "Registration";
}
@PostMapping("fun")
public String onFun(Model model, ZooDTO dto) {
	System.out.println("Running onAir in post in controller");
	Set<ConstraintViolation<ZooDTO>> violations = this.service.validateAndSave(dto);
	if (violations.isEmpty()) {
		System.out.println("no violations in controller,goto next page");
		
		model.addAttribute("name", dto.getName());
		model.addAttribute("location", dto.getLocation());
		model.addAttribute("entryFee", dto.getEntryFees());
		model.addAttribute("visitorType", dto.getVisitorType());
		model.addAttribute("area", dto.getArea());
		return "Registration";

	}
	model.addAttribute("visitorType", visitorType);
	
	model.addAttribute("errors", violations);
	System.err.println("violations in controller");
	return "Registration";

}
@GetMapping("find")
public String onSearch(@RequestParam int id,Model model) {
	System.out.println("Running on Search for id"+id);
	ZooDTO dto=this.service.findById(id);
	if(dto!=null) {
		model.addAttribute("dto",dto);
		
	}else {
		model.addAttribute("message", "data not Found");
	}
	return "Search";
	
}
}
