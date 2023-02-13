package com.xworkz.egg.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.egg.dto.EggDTO;
import com.xworkz.egg.repository.EggRepository;

@Service
public class EggServiceImpl implements EggService {
	@Autowired
private EggRepository repo;
	@Override
	public boolean validateAndSave(EggDTO dto) {
System.out.println("running validate and save");
repo.save(dto);
		return false;
	}

}
