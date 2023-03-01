package com.xworkz.smruthi_xworkz.repository;


import java.util.Collections;
import java.util.List;

import com.xworkz.smruthi_xworkz.entity.ZooEntity;

public interface ZooRepository {
	boolean save(ZooEntity entity);

	default ZooEntity findById(int id) {
		return null;
	}
	default  List<ZooEntity> findByLocation(String location){
		return Collections.emptyList();
	}
}
