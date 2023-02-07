package com.xworkz.smruthi.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class BeverageDTO {
private String name;
private double price;
private String type;
private String colour;
private String mainIngredient;
private String flavour;
private String availableAt;
private String topings;
}
