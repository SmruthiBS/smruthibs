package com.xworkz.pizza.service.railwaystation;

import com.sun.media.sound.InvalidDataException;
import com.xworkz.pizza.dto.RailwayStationDTO;
import com.xworkz.pizza.repository.RailwayStation.RailwayStationRepository;

public class RailwayStationServiceImplimentation implements RailwaystationService {
RailwayStationRepository repo;
	public RailwayStationServiceImplimentation(RailwayStationRepository repo) {
	super();
	this.repo = repo;
}
	@Override
	public boolean validateAndSave(RailwayStationDTO dto) throws InvalidDataException {
		String name=dto.getName();
		String area=dto.getArea();
		int noOfPlatforms=dto.getNoOfPlatforms();
		int platformTuicketPrice=dto.getPlatformTicketPrice();
		boolean validName=true;
		boolean validArea=true;
		boolean validNoofPlatforms=true;
		boolean validPlatformTicketPrice=true;
		if(name!=null&& name.length()>=4&& name.length()<=20) {
			System.out.println("name is valid "+name);
			validName=true;
		}
		else
		{
			System.out.println("invalid name " +name);
		}
		if(area!=null&&area.length()>=0&&area.length()<=20) {
			System.out.println("area is valid "+area);
			validArea=true;
		}
		else {
			System.out.println("area is invalid "+area);
		}
		if(noOfPlatforms>0) {
			System.out.println("noOfPlatforms is valid "+noOfPlatforms);
		}
		else
			System.out.println("noofplatforms is invalid "+noOfPlatforms);
			if(platformTuicketPrice>0) {
				System.out.println("ticketprice is valid "+platformTuicketPrice);
			}
			else {
				System.out.println("ticket price is invalid "+platformTuicketPrice);
			}
			if(validArea&&validName&&validNoofPlatforms&&validPlatformTicketPrice) {
				System.out.println("dto is valid can be saved");
				repo.store(dto);
			}
			else {
				throw new InvalidDataException("data you have entered is invalid");
			}
				
		return false;
	}

}
