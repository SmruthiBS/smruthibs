package com.xworkz.smruthi_xworkz.service;

import java.util.Set;

import javax.validation.ConstraintViolation;


import com.xworkz.smruthi_xworkz.dto.ZooDTO;

public interface ZooService {
	Set<ConstraintViolation<ZooDTO>> validateAndSave(ZooDTO dto);

	default ZooDTO findById(int id) {
		return null;
	}
}

