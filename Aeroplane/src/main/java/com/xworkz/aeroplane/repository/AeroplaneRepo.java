package com.xworkz.aeroplane.repository;

import com.xworkz.aeroplane.entity.AeroplaneEntity;

public interface AeroplaneRepo {
	boolean save(AeroplaneEntity entity);

	default AeroplaneEntity findById(int id) {
		return null;
	}
}
