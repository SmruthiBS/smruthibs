package com.xworkz.dto.repository;

import com.xworkz.dto.dto.IplDTO;
import com.xworkz.dto.exception.IplDtoSizeExceedsException;

public class IplDTORpositoryImplimentation implements IplRepository  {
	private IplDTO[] ipldtos=new IplDTO[10];
	private int iplIndex=0;

	
	@Override
	public boolean create( IplDTO dto) {
		System.out.println("running create");
		if(this.iplIndex>=ipldtos.length) {
			throw new IplDtoSizeExceedsException();
			
		}
		this.ipldtos[this.iplIndex]=dto;
		System.out.println("saved "+dto +" in the index "+iplIndex);
		iplIndex++;
		return true;
	
	}

}
