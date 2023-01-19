package com.xworkz.spring.repository.firstaid;

import org.springframework.stereotype.Component;

import com.xworkz.spring.dto.FirstAidDTO;
@Component
public class FirstAidRepoImpl implements FirstAidRepo {

	@Override
	public boolean save(FirstAidDTO dto) {
		System.out.println("running save");
		System.out.println("airstAidDTO "+dto);
		return true;
	}

	

}
