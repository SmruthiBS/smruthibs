package com.xworkz.pizza.repository.theater;

import com.xworkz.pizza.dto.TheaterDTO;
import com.xworkz.pizza.exception.theater.StorageFullException;

public class TheaterRepositoryImplimentation implements TheaterRepository {
public TheaterRepositoryImplimentation() {
		super();
	}
private TheaterDTO[] dtos=new TheaterDTO[5];
private int index;
@Override
	public boolean store(TheaterDTO dto) {
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
