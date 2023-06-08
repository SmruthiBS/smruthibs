package com.xworkz.smruthi_xworkz.repository;


import java.util.Collections;
import java.util.List;

import com.xworkz.smruthi_xworkz.entity.ZooEntity;

public interface ZooRepository {
	boolean save(ZooEntity entity);
boolean update (ZooEntity entity);
	default ZooEntity findById(int id) {
		return null;
	}
	default  List<ZooEntity> findByLocation(String location){
		return Collections.emptyList();
	}
	default boolean delete(int id) {
		return false;
		
	}
	default  List<ZooEntity> findByName(String name){
		return Collections.emptyList();
	}
	default  List<ZooEntity> findByNameAndLocation(String location,String name){
		return Collections.emptyList();
	}
	default  List<ZooEntity> findAll(){
		return Collections.emptyList();
	}
}

