package com.xworkz.aeroplane.service;

import java.util.Collections;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.aeroplane.dto.AeroplaneDTO;
import com.xworkz.aeroplane.entity.AeroplaneEntity;
import com.xworkz.aeroplane.repository.AeroplaneRepo;

@Service
public class AeroplaneServiceimpl implements AeroplaneService{
	@Autowired
	private AeroplaneRepo repo;

	public AeroplaneServiceimpl() {
		System.out.println("created:" + getClass().getSimpleName());
	}
	@Override
	
	public Set<ConstraintViolation<AeroplaneDTO>> validateAndSave(AeroplaneDTO dto) {

	 
		System.out.println("Running validateAndSave in serviceImpli");
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		Set<ConstraintViolation<AeroplaneDTO>> violations = validator.validate(dto);
		if (violations != null && !violations.isEmpty()) {
			System.err.println("violations in dto");
			return violations;

		} else {
			System.out.println("violations is not there,can save");
			AeroplaneEntity entity = new AeroplaneEntity();
			entity.setCompany(dto.getCompany());
			entity.setName(dto.getName());
			entity.setCost(dto.getCost());
			entity.setCountry(dto.getCountry());
			entity.setType(dto.getType());
			boolean saved = this.repo.save(entity);
			return Collections.emptySet();
		}
	}

	@Override
	public AeroplaneDTO findById(int id) {
		if (id > 0) {
			AeroplaneEntity entity = this.repo.findById(id);
			if (entity != null) {
				System.out.println("entity is found in service for id");
				AeroplaneDTO dto = new AeroplaneDTO();
				dto.setCompany(entity.getCompany());
				dto.setName(entity.getName());
				dto.setCost(entity.getCost());
				dto.setType(entity.getType());
				dto.setCountry(entity.getCountry());
				return dto;
			}

		}
		return AeroplaneService.super.findById(id);
	}
}
