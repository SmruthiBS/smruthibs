package com.xworkz.pizza.boot;

import com.sun.media.sound.InvalidDataException;
import com.xworkz.pizza.dto.RailwayStationDTO;
import com.xworkz.pizza.repository.RailwayStation.RailwayStationRepository;
import com.xworkz.pizza.repository.RailwayStation.RailwayStationRepositoryImplimentation;
import com.xworkz.pizza.service.railwaystation.RailwayStationServiceImplimentation;
import com.xworkz.pizza.service.railwaystation.RailwaystationService;

public class RailwayStationRunner {

	public static void main(String[] args) {
	RailwayStationDTO dto1=new RailwayStationDTO("yashwanthpura", 6, "dr ambedkar nagar", 30);
	RailwayStationDTO dto2=new RailwayStationDTO("tumkur", 4, "csi layout", 50);
	RailwayStationDTO dto3=new RailwayStationDTO("mysore", 6, "dr ambedkar nagar", 60);
	RailwayStationDTO dto4=new RailwayStationDTO("shimoga", 3, "basvangudi", 80);
	RailwayStationDTO dto5=new RailwayStationDTO("chikkamagalur", 2, "railway station road", 130);
RailwayStationRepository repo=new RailwayStationRepositoryImplimentation();
RailwaystationService service=new RailwayStationServiceImplimentation(repo);
try {
	service.validateAndSave(dto1);
	service.validateAndSave(dto2);
	service.validateAndSave(dto3);
	service.validateAndSave(dto4);
	service.validateAndSave(dto5);
	//service.validateAndSave(dto5);
	
} catch (InvalidDataException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
	}

}
