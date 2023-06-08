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

import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping("/")
@Slf4j
public class ZooContoller {
	private List<String> visitorType = Arrays.asList("child", "adult", "senior citizen" );
	@Autowired
	private ZooService service;
public ZooContoller() {
	log.info("created "+this.getClass().getSimpleName());
}
@GetMapping("fun")
public String onFun(Model model) {
	log.info("Running onfun in controller");
	model.addAttribute("visitorType",visitorType );

	return "Registration";
}
@PostMapping("fun")
public String onFun(Model model, ZooDTO dto) {
	log.info("Running onfun in post in controller");
	Set<ConstraintViolation<ZooDTO>> violations = this.service.validateAndSave(dto);
	if (violations.isEmpty()) {
		log.info("no violations in controller,goto next page");
		model.addAttribute("message", "Zoo update Success");
		
		model.addAttribute("name", dto.getName());
		model.addAttribute("location", dto.getLocation());
		model.addAttribute("entryFee", dto.getEntryFees());
		model.addAttribute("visitorType", dto.getVisitorType());
		model.addAttribute("area", dto.getArea());
		
		return "Registration";

	}
	model.addAttribute("visitorType", visitorType);
	
	model.addAttribute("errors", violations);
	log.info("violations in controller");
	return "Registration";

}
@GetMapping("find")
public String onSearch(@RequestParam int id,Model model) {
	log.info("Running on Search for id"+id);
	ZooDTO dto=this.service.findById(id);
	if(dto!=null) {
		model.addAttribute("dto",dto);
		
	}else {
		model.addAttribute("message", "data not Found");
	}
	return "Search";
	
}
@GetMapping("searchByName")
public String onSearchByName(@RequestParam String name, Model model) {
	log.info("Running on search for name " + name);
	List<ZooDTO> dto = this.service.findByName(name);
	if (dto != null) {
		model.addAttribute("dto", dto);
	} else {
		model.addAttribute("message1", "Data not found");
	}
	return "NameSearch";
}
@GetMapping("searchByLocation")
public String OnSearchByLocation(@RequestParam String location,Model model) {
	log.info("running search by location in contolller"+location);
	List<ZooDTO>list=this.service.findByLocation(location);
	if(list !=null) {
	model.addAttribute("list", list);}
	else {
		model.addAttribute("message", "no data found");
	}
	return "LocationSearch";
}



@GetMapping("update")
public String onUpdate(@RequestParam int id, Model model) {
	log.info("running onUpdate "+id);
	ZooDTO dto=this.service.findById(id);
	model.addAttribute("dto", dto);
	model.addAttribute("visitorType", visitorType);
	return "UpdateZoo";
}


	@GetMapping("searchByNameAndLocation")
	public String onSearchByNameAndLocation(@RequestParam String name, String  location, Model model) {
		log.info("Running on search for name and price " + name + location);
		List<ZooDTO> dto = this.service. findByNameAndLocation(name,location);
		
		if (dto != null ) {
			model.addAttribute("dto", dto);
		} else {
			model.addAttribute("message", "Data not found");
		}
		return "NameAndLocationSearch";
	
		
}

@PostMapping("update")
public String onUpdate(Model model, ZooDTO dto) {
	log.info("running onUpdate "+dto);
	Set<ConstraintViolation<ZooDTO>> constraintviolations = this.service.validateAndUpdate(dto);
	if(constraintviolations.size()>0) {
		model.addAttribute("errors",constraintviolations);
	}else {
		model.addAttribute("message", "Zoo update Success");
	}
	return "UpdateZoo";
}

	

@GetMapping("delete")
public String onDelete(@RequestParam int id , Model model) 
{
	log.info("delete the data :" +id);
	boolean delete = this.service.validateAndDelete(id);
	if(delete=true)
	{
		log.info("delete data of :" +id);
		model.addAttribute("delete", "delete successfully.... ");
		model.addAttribute("id",id);
	}
	else
	{
		model.addAttribute("Not delete", "id is not found");
	}
	return "LocationSearch";
}
@GetMapping("/all")
public String onSearchAll(Model model) {
	log.info("Running on search for all ");
	List<ZooDTO> dto = this.service.findAll();
	if (dto != null) {
		model.addAttribute("dto", dto);
	} else {
		model.addAttribute("message1", "Data not found");
	}
	return "findAll";
}
}
