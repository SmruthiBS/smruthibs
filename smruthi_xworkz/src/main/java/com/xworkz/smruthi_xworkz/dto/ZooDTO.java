package com.xworkz.smruthi_xworkz.dto;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Data
@Slf4j
public class ZooDTO {

	private int id;
	@NotBlank
	@Size(min = 5, max = 30, message = "Name should be more than 5 or less than 30 characters")
	private String name;
	@NotBlank
	@Size(min = 5, max = 30, message = "location should be more than 5 or less than 30 characters")
	private String location;
	@Min(value = 1, message = "Weight cannot be less than zero")
	@NotNull(message = "fees cannot be null or blank")
	private double entryFees;
	@Min(value = 1, message = " area cannot be less than zero")
	@NotNull(message = "area cannot be null or blank")
	private double area;
	@NotBlank
	private String visitorType;

}
