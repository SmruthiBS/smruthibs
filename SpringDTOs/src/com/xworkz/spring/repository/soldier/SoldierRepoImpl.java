package com.xworkz.spring.repository.soldier;

import com.xworkz.spring.dto.SoldierDTO;

public class SoldierRepoImpl implements SoldierRepo {

	@Override
	public boolean save(SoldierDTO dto) {
		System.out.println("running save");
		System.out.println("DTO "+dto);
		return false;
	}


	

}
