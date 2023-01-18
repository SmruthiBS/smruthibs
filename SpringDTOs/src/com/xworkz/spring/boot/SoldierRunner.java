package com.xworkz.spring.boot;

import com.xworkz.spring.dto.SoldierDTO;
import com.xworkz.spring.repository.soldier.SoldierRepo;
import com.xworkz.spring.repository.soldier.SoldierRepoImpl;
import com.xworkz.spring.service.soldier.SoldierServiceImpl;

public class SoldierRunner {

	public static void main(String[] args) {
		SoldierDTO dto=new SoldierDTO(1, "Sandeep unnikrishnan", "india", "Lieutenant", "bihar regiment");
		SoldierServiceImpl service=new SoldierServiceImpl();
		SoldierRepo repo=new SoldierRepoImpl();
		service.setRepo(repo);
		service.validateAndSave(dto);
		

	}

}
