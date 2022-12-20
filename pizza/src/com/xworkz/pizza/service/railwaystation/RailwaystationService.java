package com.xworkz.pizza.service.railwaystation;

import com.sun.media.sound.InvalidDataException;
import com.xworkz.pizza.dto.RailwayStationDTO;

public interface RailwaystationService {
boolean validateAndSave(RailwayStationDTO dto) throws InvalidDataException;
}
