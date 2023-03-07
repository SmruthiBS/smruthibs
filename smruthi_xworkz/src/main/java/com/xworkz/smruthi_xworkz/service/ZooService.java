package com.xworkz.smruthi_xworkz.service;

import java.util.Collections;
import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;


import com.xworkz.smruthi_xworkz.dto.ZooDTO;
import com.xworkz.smruthi_xworkz.entity.ZooEntity;

public interface ZooService {
	Set<ConstraintViolation<ZooDTO>> validateAndSave(ZooDTO dto);

	default ZooDTO findById(int id) {
		return null;
	}
	default  List<ZooDTO> findByLocation(String location){
		return Collections.emptyList();
	}
	Set<ConstraintViolation<ZooDTO>>validateAndUpdate(ZooDTO dto);
	default ZooDTO ValidateAndDelete(int id) {
		return null;
		
	}

	default boolean validateAndDelete(int id) 
	{
		return false;
	}
}

