package com.xworkz.smruthi_xworkz.repository;


import com.xworkz.smruthi_xworkz.entity.ZooEntity;

public interface ZooRepository {
	boolean save(ZooEntity entity);

	default ZooEntity findById(int id) {
		return null;
	}
}
