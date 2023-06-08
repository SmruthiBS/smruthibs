package com.xworkz.smruthi_xworkz.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Properties;
import java.util.Set;

import javax.mail.Authenticator;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.xworkz.smruthi_xworkz.dto.ZooDTO;
import com.xworkz.smruthi_xworkz.entity.ZooEntity;
import com.xworkz.smruthi_xworkz.repository.ZooRepository;

import lombok.extern.slf4j.Slf4j;
@Service
@Slf4j
public class ZooServiceImpl implements ZooService {
	@Autowired
	private ZooRepository repo;
	public ZooServiceImpl() {
		log.info("created:" + getClass().getSimpleName());	
	}

	@Override
	public Set<ConstraintViolation<ZooDTO>> validateAndSave(ZooDTO dto) {
		
		log.info("Running validateAndSave in serviceImpli");
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		Set<ConstraintViolation<ZooDTO>> violations = validator.validate(dto);
		if (violations != null && !violations.isEmpty()) {
			log.info("violations in dto");
			return violations;

	}
		else {
			log.info("violations is not there,can save");
			ZooEntity entity = new ZooEntity();
			entity.setArea(dto.getArea());
			entity.setName(dto.getName());
			entity.setEntryFees(dto.getEntryFees());
			entity.setLocation(dto.getLocation());
			entity.setVisitorType(dto.getVisitorType());
			boolean saved = this.repo.save(entity);
			log.info("saved "+saved);
			return Collections.emptySet();
		}

	}
	@Override
	public ZooDTO findById(int id) {
		if (id > 0) {
			ZooEntity entity = this.repo.findById(id);
			if (entity != null) {
				log.info("entity is found in service for id" +id);
				ZooDTO dto = new ZooDTO();
				dto.setId(entity.getId());
				dto.setLocation(entity.getLocation());
				dto.setName(entity.getName());
				dto.setEntryFees(entity.getEntryFees());
				dto.setVisitorType(entity.getVisitorType());
				dto.setArea(entity.getArea());
				return dto;
			}

		}
		return ZooService.super.findById(id);
	}
	@Override
	public List<ZooDTO> findByLocation(String location) {
		log.info("running findByLocation in service "+location); 
	if(location!=null && !location.isEmpty() ) {
		log.info("location is valid..calling repo");
		List<ZooEntity>entites=this.repo.findByLocation(location);
		List<ZooDTO>listOfDTO=new ArrayList<ZooDTO>();
		for (ZooEntity entity: entites) {
			ZooDTO dto=new ZooDTO();
			dto.setId(entity.getId());
			dto.setArea(entity.getArea());
			dto.setEntryFees(entity.getEntryFees());
			dto.setLocation(entity.getLocation());
			dto.setName(entity.getName());
			dto.setVisitorType(entity.getVisitorType());
			listOfDTO.add(dto);
			
		}
		log.info("size of dto "+listOfDTO.size());
		log.info("size of entities "+entites.size());
		return listOfDTO;
	}
	else {
		log.info("location is invalid");
	}
		return ZooService.super.findByLocation(location);
	}

	@Override
	public Set<ConstraintViolation<ZooDTO>> validateAndUpdate(ZooDTO dto) 
	{
		log.info("running the serviceImplementation");
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validtor = factory.getValidator();
		Set<ConstraintViolation<ZooDTO>> violations = validtor.validate(dto);
		if(violations!=null && !violations.isEmpty())
		{
			log.info("violations in DTO :" + dto);
			return violations;
		}
		else
		{
			log.info("violations is not there in dto and can save the data");
			ZooEntity entity = new ZooEntity();
			entity.setName(dto.getName());
			entity.setLocation(dto.getLocation());
			entity.setArea(dto.getArea());
			entity.setEntryFees(dto.getEntryFees());
			entity.setId(dto.getId());
			entity.setVisitorType(dto.getVisitorType());
			boolean saved = this.repo.update(entity);
			log.info("saved "+saved);
			return Collections.emptySet();
		}
	}
	
	@Override
	public boolean validateAndDelete(int id) 
	{
		log.info("Running the delete operation");
		if(id<0)
		{
			return false;
		}
		else
		{
			boolean deleted = this.repo.delete(id);
			log.info("Deleted :" + deleted);
			return deleted;
		}
		
	}

	@Override
	public List<ZooDTO> findByName(String name) {
		log.info("Running findByName in service " + name);
		if (name != null && !name.isEmpty()) {
			log.info("Name is valid calling repo");
			List<ZooEntity> entities = this.repo.findByName(name);
			List<ZooDTO> listOfDTO = new ArrayList<ZooDTO>();
			for (ZooEntity entity : entities) {
				ZooDTO dto = new ZooDTO();
				BeanUtils.copyProperties(entity,dto);
				
				listOfDTO.add(dto);
			}
			log.info("Size in dtos " + listOfDTO.size());
			log.info("size in entities " + entities.size());
			return listOfDTO;
		} else {
			log.info("Name is invalid");
		}
		return findByName(name);
	}

	

	@Override
	public List<ZooDTO> findByNameAndLocation(String name, String location) {
		log.info("running findByLocationAndName in service "+location +name); 
		if(location!=null && !location.isEmpty()  ) {
			log.info("location  and nameis valid..calling repo");
			List<ZooEntity>entites=this.repo.findByNameAndLocation(name,location);
			List<ZooDTO>listOfDTO=new ArrayList<ZooDTO>();
			for (ZooEntity entity: entites) {
				ZooDTO dto=new ZooDTO();
				dto.setId(entity.getId());
				dto.setArea(entity.getArea());
				dto.setEntryFees(entity.getEntryFees());
				dto.setLocation(entity.getLocation());
				dto.setName(entity.getName());
				dto.setVisitorType(entity.getVisitorType());
				listOfDTO.add(dto);
				
			}
			log.info("size of dto "+listOfDTO.size());
			log.info("size of entities "+entites.size());
			return listOfDTO;
		}
		else {
			log.info("location is invalid");
		}
			return ZooService.super.findByNameAndLocation(name,location);
		}


	@Override
	
	public List<ZooDTO> findAll() {
		log.info("Running findAll in service ");
		log.info("Entity is valid calling repo");
			List<ZooEntity> entities = this.repo.findAll();
			List<ZooDTO> listOfDTO = new ArrayList<ZooDTO>();
			for (ZooEntity entity : entities) {
				ZooDTO dto = new ZooDTO();
				BeanUtils.copyProperties(entity,dto);
				
				listOfDTO.add(dto);
			}
			log.info("Size in dtos " + listOfDTO.size());
			log.info("size in entities " + entities.size());
			return listOfDTO;
	}

	
}
