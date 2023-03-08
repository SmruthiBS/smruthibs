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
	System.out.println("Running onfun in controller");
	model.addAttribute("visitorType",visitorType );
	return "Registration";
}
@PostMapping("fun")
public String onFun(Model model, ZooDTO dto) {
	System.out.println("Running onfun in post in controller");
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
@GetMapping("searchByLocation")
public String OnSearchByLocation(@RequestParam String location,Model model) {
	System.out.println("running search by location in contolller"+location);
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
	System.out.println("running the onUpdate" + id);
	ZooDTO dto = this.service.findById(id);
	model.addAttribute("visitor type", visitorType);
	model.addAttribute("dto", dto);
	return "UpdateZoo";
}
@PostMapping("update")
public String onUpdate(ZooDTO dto, Model model) {
	System.out.println("running the update" + dto);
	Set<ConstraintViolation<ZooDTO>> constraintViolations = this.service.validateAndUpdate(dto);
	if (constraintViolations.size() > 0) {
		model.addAttribute("errors", constraintViolations);
	} else {
		System.out.println("update sucess");
		model.addAttribute("message", " zoo update success....");
	}
	return "UpdateZoo";

	
}
@GetMapping("delete")
public String onDelete(@RequestParam int id , Model model) 
{
	System.out.println("delete the data :" +id);
	boolean delete = this.service.validateAndDelete(id);
	if(delete=true)
	{
		System.out.println("delete data of :" +id);
		model.addAttribute("delete", "delete successfully....: ID :");
		model.addAttribute("id",id);
	}
	else
	{
		model.addAttribute("Not delete", "id is not found");
	}
	return "LocationSearch";
}
}
