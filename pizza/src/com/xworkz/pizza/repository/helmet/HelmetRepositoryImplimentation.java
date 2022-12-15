package com.xworkz.pizza.repository.helmet;

import com.xworkz.pizza.dto.HelmetDTO;

public class HelmetRepositoryImplimentation implements HelmetRepository{
private HelmetDTO[] dtos=new HelmetDTO[10];
private int currentIndex;
	@Override
	public boolean save(HelmetDTO dto) {
		System.out.println("running save");
		if(this.currentIndex>dtos.length) {
			System.out.println("storage full");
			return false;
		}
		this.dtos[this.currentIndex]=dto;
		System.out.println("saved "+dto +" in the index "+currentIndex);
		currentIndex++;
		return true;
	}

}
