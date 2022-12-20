package com.xworkz.pizza.service.Building;

import com.xworkz.pizza.dto.BuildingDTO;
import com.xworkz.pizza.repository.building.BuildingReository;

public class BuildingServiceImplimentation implements BuildingService {
	private BuildingReository repo;

	public BuildingServiceImplimentation(BuildingReository repo) {
		super();
		this.repo = repo;
	}

	@Override
	public boolean saveAndValidate(BuildingDTO dto) {
		String name = dto.getName();
		String type = dto.getType();
		int no = dto.getNo();
		int floors = dto.getFloors();
		boolean left = dto.isLift();
		boolean parking = dto.isParking();
		boolean validName=true;
		boolean validType=true;
		boolean validleft=true;
		boolean validFloors=true;
		boolean validParking=true;
		boolean validNo=true;
		if(name!=null&&name.length()>=4&&name.length()<20) {
			System.out.println("name is valid "+name);
			validName=true;
		}
		else {
			System.out.println("name is invalid "+name);
			
		}
		if(type!=null &&type.length()>=4&&type.length()<=20) {
			System.out.println("type is valid "+type);
			validType=true;
		}
		else {
		System.out.println("type is invalid "+type);
		
	}
		if(floors>0){
			System.out.println("floors is valid"+floors);
			validFloors=true;
		}
		else
			System.out.println("floors is invalid"+floors);
		if(no>0) {
			System.out.println("no is valid "+no);
			validNo=true;
		}
		else {
			System.out.println("no is invalid"+no);
		}
		return false;
	}
}



