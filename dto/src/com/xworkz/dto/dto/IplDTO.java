package com.xworkz.dto.dto;

import com.xworkz.dto.dto.AbstractAuditDTO;

public class IplDTO extends AbstractAuditDTO {
	private String teamName;
	private String captionName;
	private int wins;
	private int losses;
	private Boolean ownerAlive;
	private Double purse;
	
	public IplDTO() {
		System.out.println("default constructor of ipl dto");
	}

	public IplDTO(String teamName, String captionName, int wins, int losses, Boolean ownerAlive, Double purse) {
		super();
		this.teamName = teamName;
		this.captionName = captionName;
		this.wins = wins;
		this.losses = losses;
		this.ownerAlive = ownerAlive;
		this.purse = purse;
		
	}
	

	@Override
	public String toString() {
		return "IplDTO [teamName=" + teamName + ", captionName=" + captionName + ", wins=" + wins + ", losses=" + losses
				+ ", ownerAlive=" + ownerAlive + ", purse=" + purse + "]";
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public String getCaptionName() {
		return captionName;
	}

	public void setCaptionName(String captionName) {
		this.captionName = captionName;
	}

	public int getWins() {
		return wins;
	}

	public void setWins(int wins) {
		this.wins = wins;
	}

	public int getLosses() {
		return losses;
	}

	public void setLosses(int losses) {
		this.losses = losses;
	}

	public Boolean getOwnerAlive() {
		return ownerAlive;
	}

	public void setOwnerAlive(Boolean ownerAlive) {
		this.ownerAlive = ownerAlive;
	}

	public Double getPurse() {
		return purse;
	}

	public void setPurse(Double purse) {
		this.purse = purse;
	}
	
	
	

}
