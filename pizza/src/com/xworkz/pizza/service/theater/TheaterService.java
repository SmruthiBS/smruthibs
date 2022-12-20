package com.xworkz.pizza.service.theater;

import com.xworkz.pizza.dto.TheaterDTO;
import com.xworkz.pizza.exception.theater.InvalidDataException;

public interface TheaterService {
boolean saveAndValidate(TheaterDTO dto) throws InvalidDataException;
}
