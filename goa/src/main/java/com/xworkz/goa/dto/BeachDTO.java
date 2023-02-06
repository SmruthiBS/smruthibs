package com.xworkz.goa.dto;

import lombok.Data;
import lombok.ToString;

@Data
public class BeachDTO {
private String name;
private String location;
private boolean clean ;
private boolean games ;
@Override
public String toString() {
	return "BeachDTO [name=" + name + ", location=" + location + ", clean=" + clean + ", games=" + games + "]";
}


}
