package com.xworkz.collections.dto;

import java.io.Serializable;

public class GamesDTO implements Serializable{
private String name;
private int TotalPlayers;
private String type;
public GamesDTO() {
	super();
}
public GamesDTO(String name, int totalPlayers, String type) {
	super();
	this.name = name;
	TotalPlayers = totalPlayers;
	this.type = type;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getTotalPlayers() {
	return TotalPlayers;
}
public void setTotalPlayers(int totalPlayers) {
	TotalPlayers = totalPlayers;
}
public String getType() {
	return type;
}
@Override
public String toString() {
	return "GamesDTO [name=" + name + ", TotalPlayers=" + TotalPlayers + ", type=" + type + "]";
}
public void setType(String type) {
	this.type = type;
}
@Override
public boolean equals(Object obj) {
	System.out.println("running eqals in gamesDTO");
	if(obj!=null) {
		if (obj instanceof GamesDTO) {
			GamesDTO dto=(GamesDTO)obj;
			if(dto.name.equals(this.name)) {
				System.out.println("game names match "+dto.name);
				return true;
			}
			
		}
	}
	return false;
	
}

}
