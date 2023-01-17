package com.xworkz.spring.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import com.xworkz.spring.dto.TerroristDTO;

public class TerroristServiceImpl implements TerroristService {
TerroristDTO dto;
	@Override
	public boolean validateAndSave(TerroristDTO dto) {
		System.out.println("running validate and save");
		;
		System.out.println("dto passed "+dto);
		ValidatorFactory factory =Validation.buildDefaultValidatorFactory();
		Validator validator=factory.getValidator();

		Set<ConstraintViolation<TerroristDTO>> violations = factory.getValidator().validate(dto);
		if(!violations.isEmpty()) {
			System.err.println("error is there");
			violations.forEach(c->System.err.println(c.getMessage()));
			return false;
		}
		
		System.out.println("no validation errors");
		return true;
	}

}
