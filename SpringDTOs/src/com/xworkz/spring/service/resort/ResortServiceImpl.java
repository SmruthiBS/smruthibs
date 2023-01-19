package com.xworkz.spring.service.resort;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.spring.dto.ResortDTO;
import com.xworkz.spring.repository.resort.ResortRepo;
@Component
public class ResortServiceImpl implements ResortSetvice {
	@Autowired
	private Validator validator;
	private ResortRepo repo;
@Autowired
	public ResortServiceImpl(ResortRepo repo) {
		
		this.repo = repo;
		System.out.println("created resort service by passing repo using spring");
	}

	@Override
	public boolean validateAndSave(ResortDTO dto) {
	System.out.println("running validate and save");
	System.out.println("resortDTO "+dto);
	Set<ConstraintViolation<ResortDTO>> violations=this.validator.validate(dto);
	if(!violations.isEmpty()) {
		System.err.println("there are violation errors");
		return false;
	}
	else {
		System.out.println("data is valid");
		boolean saved=this.repo.save(dto);
		System.out.println(saved);
		return saved;
	}
		
	}

}
