package com.xworkz.smruthi.controller;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.smruthi.dto.BeverageDTO;
import com.xworkz.smruthi.dto.ChatDTO;
import com.xworkz.smruthi.dto.EducationDTO;
import com.xworkz.smruthi.dto.FamilyDTO;
import com.xworkz.smruthi.dto.MobileDTO;

@Component
@RequestMapping("/")
public class DisplayController {
@GetMapping("/mail")
public String onMail(Model model) {
	System.out.println("running on mail");
	model.addAttribute("email","smruthibs.xworkz@gmail.com");
	return "index.jsp";
}
@GetMapping("/cell")
public String onCell(Model model) {
	System.out.println("running on cell");
	model.addAttribute("mob", "9482618680l");
	return "index.jsp";
}
@GetMapping("/adhar")
public String onAdhar(Model model) {
	System.out.println("running on adhar");
	model.addAttribute("number", "551364719230");
	return "index.jsp";
}
@GetMapping("/age")
public String onAge(Model model) {
	System.out.println("running on age");
	model.addAttribute("age", "24");
	return "index.jsp";
}
@GetMapping("/dob")
public String onDOB(Model model) {
	System.out.println("running on DOB");
	model.addAttribute("dob", LocalDateTime.of(1999, 9, 23, 3, 40));
	return "index.jsp";
}
@GetMapping("/salary")
public String onsalary(Model model) {
	System.out.println("running on desired salary");
	model.addAttribute("salary", "15000");
	return "index.jsp";
}
@GetMapping("/bff")
public String onbff(Model model) {
	System.out.println("running on on bff");
	List<String> list=new ArrayList();
	list.add("namratha");
	list.add("manasa");
	list.add("spoorthi");
	list.add("ganesh");
	list.add("shreshta");
	model.addAttribute("bff", list);
	return "index.jsp";
}
@GetMapping("/place")
public String onplace(Model model) {
	System.out.println("running on place");
	List<String> list=new ArrayList();
	list.add("xworkz");
	list.add("shimoga");
	list.add("n r pura");
	model.addAttribute("place", list);
	return "index.jsp";
}
@GetMapping("/skills")
public String onskills(Model model) {
	System.out.println("running on skills");
	List<String> list=new ArrayList();
	list.add("java");
	list.add("c");
	list.add("c++");
	list.add("html");
	list.add("css");
	list.add("my sql");
	model.addAttribute("skills", list);
	return "index.jsp";
}
@GetMapping("/eduDTO")
public String onEduDTO(Model model)
{
	System.out.println("running education dto");
EducationDTO dto=new EducationDTO(80.13D, "DCMC High School", 81D, "DCMC PU college", "BE", "PESITM", 58.09d, "BE", 2022, "vtu");
model.addAttribute("data", dto);
return "index.jsp";
}
@GetMapping("/fmlyDTO")
public String onFmlyDTO(Model model) {
	System.out.println("running family dto");
	FamilyDTO dto=new FamilyDTO("nuclear", "rao","suresh", "jayapadma", 3, "narasimharajpura", "subbarao", "lakshamma", 75000d, "sharath");
	model.addAttribute("value", dto);
	return "index.jsp";
}
@GetMapping("/phone")
public String onPhone(Model model) {
	System.out.println("running mobile dto");
	MobileDTO dto=new MobileDTO("redmi", "note 5 pro", 15000d, 64, "black");
	model.addAttribute("info", dto);
	return "index.jsp";
}
@GetMapping("/drink")
public String onDrink(Model model) {
	System.out.println("running beverage dto");
	BeverageDTO dto=new BeverageDTO("coffee", 10, "hot", "brown", "cofee powder", "coffee", "home","creamer");
	model.addAttribute("item", dto);
	return "index.jsp";
}
@GetMapping("/eat")
public String onEat(Model model) {
	System.out.println("running chat dto");
	ChatDTO dto=new ChatDTO("french fries", 75, "hot", "yellow", "potato", "peri peri", "hotels", "salt", "potato ,salt,oil ", "yes", "no");
	model.addAttribute("food", dto);
	return "index.jsp";
}
}
