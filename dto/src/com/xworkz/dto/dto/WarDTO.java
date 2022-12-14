package com.xworkz.dto.dto;

import java.time.LocalDateTime;

public class WarDTO extends AbstractAuditDTO{
	private String name;
	private LocalDateTime startDate;
	private LocalDateTime endDate;
	private String startedBy;
	private String startedWith;
	private String WonBy;
	private int noOfDeaths;
	public WarDTO() {
		System.out.println("default constructor of war dto");
	}
	public WarDTO(String name, LocalDateTime startDate, LocalDateTime endDate, String startedBy, String startedWith,
			String wonBy, int noOfDeaths) {
		super();
		this.name = name;
		this.startDate = startDate;
		this.endDate = endDate;
		this.startedBy = startedBy;
		this.startedWith = startedWith;
		WonBy = wonBy;
		this.noOfDeaths = noOfDeaths;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDateTime getStartDate() {
		return startDate;
	}
	public void setStartDate(LocalDateTime startDate) {
		this.startDate = startDate;
	}
	public LocalDateTime getEndDate() {
		return endDate;
	}
	public void setEndDate(LocalDateTime endDate) {
		this.endDate = endDate;
	}
	public String getStartedBy() {
		return startedBy;
	}
	public void setStartedBy(String startedBy) {
		this.startedBy = startedBy;
	}
	public String getStartedWith() {
		return startedWith;
	}
	public void setStartedWith(String startedWith) {
		this.startedWith = startedWith;
	}
	public String getWonBy() {
		return WonBy;
	}
	public void setWonBy(String wonBy) {
		WonBy = wonBy;
	}
	public int getNoOfDeaths() {
		return noOfDeaths;
	}
	public void setNoOfDeaths(int noOfDeaths) {
		this.noOfDeaths = noOfDeaths;
	}
	@Override
	public String toString() {
		return "WarDTO [name=" + name + ", startDate=" + startDate + ", endDate=" + endDate + ", startedBy=" + startedBy
				+ ", startedWith=" + startedWith + ", WonBy=" + WonBy + ", noOfDeaths=" + noOfDeaths + "]";
	}

	}

	
	
	
	


