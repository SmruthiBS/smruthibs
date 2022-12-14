package com.xworkz.dto.repository.war;

import java.time.LocalDateTime;

import com.xworkz.dto.dto.WarDTO;
import com.xworkz.dto.exception.WarDTOexceedsException;

public class WarRepositoryImplimentation implements WarRepository {
	private  WarDTO dto;
	private  WarDTO[] dtos;
	private int warIndex;
	
	

	@Override
	public boolean create(WarDTO dto) {
		
		return false;
	}

	@Override
	public boolean create(WarDTO[] dtos) {
		System.out.println("running create");
		if(this.warIndex>=dtos.length)
			throw new WarDTOexceedsException();
		this.dtos[warIndex]=dto;
		System.out.println("saved to "+dtos +"at index "+ warIndex);
		this.warIndex++;
		return true;
	}

	@Override
	public WarDTO findByStartedBy(String StartedBy) {
		System.out.println("running findbystarted by "+StartedBy);
		for(WarDTO dto:dtos) {
			if(dtos!=null&&dto.getStartedBy() )
		}
			
	
		return dto;
	}

	@Override
	public WarDTO findByStartedByAndStartedWith(String startedBy, String staetedWith) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public WarDTO findByStartedDateGreaterThanOREqualTo(LocalDateTime date) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public WarDTO findByStartedDateLesserThanOREqualTo(LocalDateTime date) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public WarDTO findByStartDateAndEndDate(LocalDateTime stat, LocalDateTime end) {
		// TODO Auto-generated method stub
		return null;
	}

}
