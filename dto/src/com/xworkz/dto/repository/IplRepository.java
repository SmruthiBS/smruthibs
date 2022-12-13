package com.xworkz.dto.repository;

import com.xworkz.dto.dto.IplDTO;

public interface IplRepository {
	boolean create(IplDTO dto);
	 default int total() {
		return 0;
		 
	 }
	
}
