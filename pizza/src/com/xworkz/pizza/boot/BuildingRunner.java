package com.xworkz.pizza.boot;

import com.sun.media.sound.InvalidDataException;
import com.xworkz.pizza.dto.BuildingDTO;
import com.xworkz.pizza.dto.RailwayStationDTO;
import com.xworkz.pizza.repository.building.BuildingReository;
import com.xworkz.pizza.repository.building.BuildingRepositoryImplimentation;
import com.xworkz.pizza.service.Building.BuildingService;
import com.xworkz.pizza.service.Building.BuildingServiceImplimentation;


public class BuildingRunner {

	public static void main(String[] args) throws InvalidDataException {
		
			BuildingDTO dto1=new BuildingDTO(1,"moomstone",4,true,true,"appartment");
			BuildingDTO dto2=new BuildingDTO(2,"orian",4,true,true,"mall");
			BuildingDTO dto3=new BuildingDTO(3,"sphare",2,true,true,"shopping market");
			BuildingDTO dto4=new BuildingDTO(4,"dvs",4,false,true,"school");
			BuildingDTO dto5=new BuildingDTO(5,"pesitm",4,true,true,"college");
	
		BuildingReository repo=new BuildingRepositoryImplimentation();
	BuildingService service=new BuildingServiceImplimentation(repo);
		service.saveAndValidate(dto1);
		service.saveAndValidate(dto2);
		service.saveAndValidate(dto3);
		service.saveAndValidate(dto4);
		service.saveAndValidate(dto5);
			}	

	}


