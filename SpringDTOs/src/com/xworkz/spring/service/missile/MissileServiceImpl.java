package com.xworkz.spring.service.missile;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.spring.dto.MissileDTO;
import com.xworkz.spring.repository.missile.MissileRepo;
@Component
public class MissileServiceImpl implements MissileService {
	@Autowired
	private Validator validator;
	private MissileRepo repo;
	
@Autowired
	public MissileServiceImpl(MissileRepo repo) {
		
		this.repo = repo;
	}

@Override
public boolean validateAndSave(MissileDTO dto) {
	System.out.println("running validate and save");
	System.out.println("missileDTO "+dto);
	Set<ConstraintViolation<MissileDTO>> violation=this.validator.validate(dto);
	if(!violation.isEmpty()) {
		System.err.println("there are violation errors");
		violation.forEach(cl->System.out.println(cl.getMessage()));
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
