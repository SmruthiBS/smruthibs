package com.xworkz.spring.repository.missile;

import org.springframework.stereotype.Component;

import com.xworkz.spring.dto.MissileDTO;
@Component
public class MiiseleRepoImpl implements MissileRepo {

	@Override
	public boolean save(MissileDTO dto) {
	System.out.println("running save");
	System.out.println("missileDTO "+dto);
		return true;
	}

}
