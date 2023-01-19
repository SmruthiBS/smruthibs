package com.xworkz.spring.service.firstaid;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;



import com.xworkz.spring.dto.FirstAidDTO;
import com.xworkz.spring.repository.firstaid.FirstAidRepo;
@Component
public class FirstAidServiceImpl implements FirstAidService {
	@Autowired
	private Validator validator;
	
	private FirstAidRepo repo;
	

@Autowired
	public FirstAidServiceImpl(FirstAidRepo repo) {
		this.repo = repo;
		System.out.println("created service by passing repo from spring");
	}



	@Override
	public boolean validateAndSave(FirstAidDTO dto) {
		System.out.println("running validate and save");
		System.out.println("firstaid dto "+dto);
		Set<ConstraintViolation<FirstAidDTO>>violations=this.validator.validate(dto);
		if(!violations.isEmpty()) {
			System.err.println("there are validation errors");
			return false;
		}
		else
		{
			System.out.println("datAa is valid..can be saved");
			boolean saved=repo.save(dto);
			System.out.println("dto saved "+saved);
			return saved;
		}
		
	}



}
