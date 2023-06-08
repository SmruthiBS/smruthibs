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
	
		default boolean validateAndDelete(int id) 
	{
		return false;
	}

		List<ZooDTO> findByName(String name);

		default List<ZooDTO> findByNameAndLocation(String name, String location){
			return Collections.emptyList();
		}
		default  List<ZooDTO> findAll(){
			return Collections.emptyList();
		
}
		
}

