package com.xworkz.spring.service.soldier;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import com.xworkz.spring.dto.SoldierDTO;
import com.xworkz.spring.repository.soldier.SoldierRepo;

public class SoldierServiceImpl implements SoldierService {
	SoldierRepo repo;
	public SoldierServiceImpl() {
		System.out.println("soliderservice implimentation created");
	}
	 public void setRepo(SoldierRepo repo) {
		this.repo = repo;
	}

	@Override
	public boolean validateAndSave(SoldierDTO dto) {
	System.out.println("running validate and save");
	System.out.println("dto passed "+dto);
	ValidatorFactory factory=Validation.buildDefaultValidatorFactory();//creating factory
	Validator validator=factory.getValidator();
	Set<ConstraintViolation<SoldierDTO>> violations=validator.validate(dto);
	if(!violations.isEmpty()) {
		System.err.println("there are validation error");
		violations.forEach(v->{System.err.println("violating message "+v.getMessage());
	});
		return false;}
	
		else {
			System.out.println("data is valid");
			 boolean saved =repo.save(dto);
			 System.out.println("dto saved using repo "+saved);
			 return saved;
		}
	
	
	}

}
