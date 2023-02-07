package com.xworkz.smruthi.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class FamilyDTO {
private String type;
private String familyName;
private String fatherName;
private String motherName;
private int totalMembers;
private String nativePalace;
private String grandfatherName;
private String grandMotherName;
private double income;
private String brotherName;

}
