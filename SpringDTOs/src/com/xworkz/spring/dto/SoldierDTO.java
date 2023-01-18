package com.xworkz.spring.dto;

import javax.validation.constraints.NotBlank;
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
public class SoldierDTO extends AbstractAuditDTO {
	private int id;
	@NotNull
	@NotBlank
	@Size(min = 3,max = 20,message = "name must be >3 and <20")
	private String name;
	@NotNull
	@NotBlank
	@Size(min = 3,max = 200,message = "country must be >3 and <20")
	private String country;
	@NotNull
	@NotBlank
	@Size(min = 5,max = 20,message = "rank must be >3 and <20")
	private String rank;
	@NotNull
	@NotBlank
	@Size(min = 3,max = 20,message = "battalion must be >3 and <20")
	private String battalion;
	

}
