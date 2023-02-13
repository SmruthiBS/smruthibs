package com.xworkz.egg.controller;

import java.util.Set;

import javax.validation.ConstraintViolation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.egg.dto.CMDTO;
import com.xworkz.egg.service.CM.CMService;

@Controller
@RequestMapping("/cm")
public class CMController {
	@Autowired
	private CMService service;
public CMController() {
System.out.println("created "+this.getClass().getSimpleName());
}
@PostMapping
public String omcm(CMDTO dto,Model model) {
	System.out.println("running oncm" +dto);
	Set<ConstraintViolation<CMDTO>> violations=this.service.validateAndSave(dto);
	if(!violations.isEmpty()) {
		System.out.println("validations failed display error message");
		violations.forEach((cv)->System.err.println(cv.getMessage()));
		}
	else {
		System.out.println("validation sucess display sucess message");
	}
	return "CM.jsp";
	}

}
