package com.xworkz.dto.repository.war;

import java.time.LocalDateTime;

import com.xworkz.dto.dto.WarDTO;

public interface WarRepository {
	boolean create (WarDTO dto);
	boolean create (WarDTO[] dtos);
	default int total() {
		return 0;
	}
	 WarDTO findByStartedBy(String StartedBy);
		
	
	 WarDTO findByStartedByAndStartedWith(String startedBy,String staetedWith); 
		
		 WarDTO findByStartedDateGreaterThanOREqualTo(LocalDateTime date ) ;
		 WarDTO findByStartedDateLesserThanOREqualTo(LocalDateTime date ) ;
		 WarDTO findByStartDateAndEndDate( LocalDateTime stat,LocalDateTime end  );
			
		
	}

