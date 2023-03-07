package com.xworkz.smruthi_xworkz.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
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
	@Override
	public List<ZooDTO> findByLocation(String location) {
	System.out.println("running findByLocation in service "+location); 
	if(location!=null &&!location.isEmpty() ) {
		System.out.println("location is valid..calling repo");
		List<ZooEntity>entites=this.repo.findByLocation(location);
		List<ZooDTO>listOfDTO=new ArrayList<ZooDTO>();
		for (ZooEntity entity: entites) {
			ZooDTO dto=new ZooDTO();
			dto.setId(entity.getId());
			dto.setArea(entity.getArea());
			dto.setEntryFees(entity.getEntry_Fees());
			dto.setLocation(entity.getLocation());
			dto.setName(entity.getName());
			dto.setVisitorType(entity.getVisitor_Type());
			listOfDTO.add(dto);
			
		}
		System.out.println("size of dto "+listOfDTO.size());
		System.out.println("size of entities "+entites.size());
		return listOfDTO;
	}
	else {
		System.err.println("location is invalid");
	}
		return ZooService.super.findByLocation(location);
	}

	@Override
	public Set<ConstraintViolation<ZooDTO>> validateAndUpdate(ZooDTO dto) 
	{
		System.out.println("running the serviceImplementation");
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validtor = factory.getValidator();
		Set<ConstraintViolation<ZooDTO>> violations = validtor.validate(dto);
		if(violations!=null && !violations.isEmpty())
		{
			System.err.println("violations in DTO :" + dto);
			return violations;
		}
		else
		{
			System.out.println("violations is not there in dto and can save the data");
			ZooEntity entity = new ZooEntity();
			entity.setName(dto.getName());
			entity.setLocation(dto.getLocation());
			entity.setArea(dto.getArea());
			entity.setEntry_Fees(dto.getEntryFees());
			entity.setId(dto.getId());
			entity.setVisitor_Type(dto.getVisitorType());
			boolean saved = this.repo.update(entity);
			System.out.println(saved);
			return Collections.emptySet();
		}
	}
	@Override
	public ZooDTO deleteById(int id) {
		System.out.println("running delete by id in service");
		if(id>0) {
			ZooEntity entity=this.repo.deleteById(id);
		}
		return ZooService.super.deleteById(id);
	}
}
