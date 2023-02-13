package com.xworkz.egg.service.CM;

import java.util.Set;

import javax.validation.ConstraintViolation;

import org.springframework.stereotype.Service;

import com.xworkz.egg.dto.CMDTO;


public interface CMService {
Set<ConstraintViolation<CMDTO>>  validateAndSave(CMDTO dto);

}
