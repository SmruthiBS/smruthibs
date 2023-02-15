package com.xworkz.valentine.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class ValentineDTO {
@Size(min = 3,max = 20,message = "name should not  be less than 3 and greater than 20")	
private String name;
@Size(min = 3,max = 20,message = " valentine name should not  be less than 3 and greater than 20")	
private String valentineName;
@NotBlank(message = "place should  be filled")
private String place;
@NotBlank(message = "gift should  be filled")
private String gift;
}
