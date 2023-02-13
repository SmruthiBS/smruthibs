package com.xworkz.egg.dto;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class CMDTO {
	@NotNull(message = "cm name cannot be null")
	@Size(min = 3,max = 20,message = "cm name should be more than 3 and less than 20")
private String name;
	@NotNull(message = "state cannot be null")
private String state;
	@NotNull(message = "party cannot be null")

private String party;
@NotNull(message = "tenure cannot be null")
@Min(value = 1, message = "tenure should min be 1")
private int tenure;
	@NotNull(message = "portfolio cannot be null")
private String portfolio;
}
