package com.xworkz.spring.repository.resort;

import org.springframework.stereotype.Component;

import com.xworkz.spring.dto.ResortDTO;
@Component
public class ResortRepoImpl implements ResortRepo {

	@Override
	public boolean save(ResortDTO dto) {
		System.out.println("running save");
		System.out.println("resportDTO"+dto);
		return true;
	}

}
