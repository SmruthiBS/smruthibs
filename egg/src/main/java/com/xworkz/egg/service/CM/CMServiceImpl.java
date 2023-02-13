package com.xworkz.egg.service.CM;

import java.util.Collection;
import java.util.Collections;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.stereotype.Service;

import com.xworkz.egg.dto.CMDTO;
@Service
public class CMServiceImpl implements CMService {
public CMServiceImpl() {
	System.out.println("created"+this.getClass().getSimpleName());
}
	@Override
	public Set<ConstraintViolation<CMDTO>> validateAndSave(CMDTO dto) {
		System.out.println("running validate and save in cm service");
		ValidatorFactory factory=Validation.buildDefaultValidatorFactory();
		Validator validator=factory.getValidator();
		
		Set<ConstraintViolation<CMDTO>>violations=validator.validate(dto);
		if(violations!=null && !violations.isEmpty()) {
			System.err.println("ConstraintViolatios exists,return ConstraintViolation");
			return violations;
		}
		else {
			System.out.println("ConstraintViolation does not exists data can be saved");
		}
		return Collections.emptySet();
	}

}
