package com.xworkz.pizza.repository.RailwayStation;

import com.xworkz.pizza.dto.RailwayStationDTO;
import com.xworkz.pizza.exception.theater.StorageFullException;

public class RailwayStationRepositoryImplimentation  implements RailwayStationRepository{
private RailwayStationDTO[] dtos= new RailwayStationDTO[5];
int index;
	@Override
	public boolean store(RailwayStationDTO dto) {
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
