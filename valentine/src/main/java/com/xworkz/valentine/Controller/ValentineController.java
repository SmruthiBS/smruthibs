package com.xworkz.valentine.Controller;

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

import com.xworkz.valentine.dto.ValentineDTO;
import com.xworkz.valentine.service.ValentineService;

@Controller
@RequestMapping("/valentine")
public class ValentineController {

	@Autowired
	private ValentineService service;	
	private List<String> places=Arrays.asList("cubbon park","BTM","CCD","J P nagar","indira nagar","lal bagh");
	private List<String>gifts=Arrays.asList("chocolate","roses","teddy","saree","ring","dress");
	
public	ValentineController() {
	System.out.println("created "+this.getClass().getSimpleName());
}
@GetMapping
public String onValentine(Model model) {
System.out.println("running onvalentine get method");
List<String> places=Arrays.asList("cubbon park","BTM","CCD","J P nagar","indira nagar","lal bagh");
List<String>gifts=Arrays.asList("chocolate","roses","teddy","saree","ring","dress");
model.addAttribute("places",places);
model.addAttribute("gifts",gifts);
return "Valentine";
}
@PostMapping
public String onValentine(Model model,ValentineDTO dto) {
	System.out.println("running onvalentine post method "+dto);
	Set<ConstraintViolation<ValentineDTO>> violations=service.validateAndSave(dto);
	if(violations.isEmpty()) {
		System.out.println("no violations in contoller go to sucess");
		return "ValentineSucess";
	}
	model.addAttribute("places",places);
	model.addAttribute("gifts",gifts);
	model.addAttribute("errors",violations);
	model.addAttribute("dto",dto);
	System.err.println("violations in controller");
	return "Valentine";
}
}
