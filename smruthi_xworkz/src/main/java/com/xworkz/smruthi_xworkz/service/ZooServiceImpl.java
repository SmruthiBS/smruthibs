package com.xworkz.smruthi_xworkz.service;

import java.util.Collections;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.xworkz.smruthi_xworkz.dto.ZooDTO;
import com.xworkz.smruthi_xworkz.entity.ZooEntity;
import com.xworkz.smruthi_xworkz.repository.ZooRepository;
@Service
public class ZooServiceImpl implements ZooService {
	@Autowired
	private ZooRepository repo;
	public ZooServiceImpl() {
		System.out.println("created:" + getClass().getSimpleName());	
	}

	@Override
	public Set<ConstraintViolation<ZooDTO>> validateAndSave(ZooDTO dto) {
		
		System.out.println("Running validateAndSave in serviceImpli");
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		Set<ConstraintViolation<ZooDTO>> violations = validator.validate(dto);
		if (violations != null && !violations.isEmpty()) {
			System.err.println("violations in dto");
			return violations;

	}
		else {
			System.out.println("violations is not there,can save");
			ZooEntity entity = new ZooEntity();
			entity.setArea(dto.getArea());
			entity.setName(dto.getName());
			entity.setEntry_Fees(dto.getEntryFees());
			entity.setLocation(dto.getLocation());
			entity.setVisitor_Type(dto.getVisitorType());
			boolean saved = this.repo.save(entity);
			return Collections.emptySet();
		}

	}
	@Override
	public ZooDTO findById(int id) {
		if (id > 0) {
			ZooEntity entity = this.repo.findById(id);
			if (entity != null) {
				System.out.println("entity is found in service for id");
				ZooDTO dto = new ZooDTO();
				dto.setLocation(entity.getLocation());
				dto.setName(entity.getName());
				dto.setEntryFees(entity.getEntry_Fees());
				dto.setVisitorType(entity.getVisitor_Type());
				dto.setArea(entity.getArea());
				return dto;
			}

		}
		return ZooService.super.findById(id);
	}
}
