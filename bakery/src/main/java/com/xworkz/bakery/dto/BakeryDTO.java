package com.xworkz.bakery.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class BakeryDTO {
private String bakeryName;
private String ownerName;
private String wifeName;
private boolean married;
private int bakerySince;
private String famousFor;
}
