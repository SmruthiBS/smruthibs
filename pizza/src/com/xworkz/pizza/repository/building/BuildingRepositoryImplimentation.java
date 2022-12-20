package com.xworkz.pizza.repository.building;

import com.xworkz.pizza.dto.BuildingDTO;
import com.xworkz.pizza.exception.theater.StorageFullException;

public class BuildingRepositoryImplimentation implements BuildingReository {
private BuildingDTO[] dtos=new BuildingDTO[5];
	private int index;

	@Override
	public boolean store(BuildingDTO dto) {
		System.out.println("running save");
		if(this.index>dtos.length) {
			System.out.println("storage full");
			throw new StorageFullException("cannot save this dto storage is full");
		}
		this.dtos[this.index]=dto;
		System.out.println("saved "+dto +" in the index "+index);
		index++;
		return true;
	
		
	}

}
