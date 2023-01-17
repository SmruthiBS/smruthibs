package com.xworkz.spring.dto;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public  class TerroristDTO extends AbstractAuditDTO {
	@NotNull(message = "name cannot be null")
	@Size(min = 3,max = 20,message = "name is invalid should be more than 3 and less than 20")
	private String name;
	@NotNull(message = "country cannot be null")
	@Size(min = 3,max = 20,message = "name is invalid should be more than 3 and less than 20")
	private String country;
	@NotNull(message = "organization cannot be null")
	@Size(min = 3,max = 100,message = "name is invalid should be more than 3 and less than 100")
	private String organization;
	@NotNull(message = "spcialization cannot be null")
	@Size(min = 3,max = 20,message = "name is invalid should be more than 3 and less than 20")
	private String spcialization;
	@NotNull(message = "age cannot be null")
	@Min(value = 1,message = "age must be greater than 1 and less than 150")
	@Max(value = 150,message = "age must be greater than 1 and less than 150")
	
	private int age;
	private boolean alive;
	private boolean prision;;
	
	

}
