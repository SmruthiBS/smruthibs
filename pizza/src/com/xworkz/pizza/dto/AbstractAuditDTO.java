package com.xworkz.pizza.dto;

import java.io.Serializable;
import java.time.LocalDateTime;

public class AbstractAuditDTO implements Serializable {
	
	
	private String createdBy;
	private LocalDateTime createdDate;
	private String updatedBy;
	private LocalDateTime updatedDate;
	public AbstractAuditDTO() {
	System.out.println("default constructor of class  AbstractAuditDTO ");
	}
	public AbstractAuditDTO(String createdBy) {
		super();
		this.createdBy = createdBy;
	}

	public String getCreatedBy() {
		return createdBy;
	}
	
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public LocalDateTime getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(LocalDateTime createdDate) {
		this.createdDate = createdDate;
	}
	public String getUpdatedBy() {
		return updatedBy;
	}
	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}
	public LocalDateTime getUpdatedDate() {
		return updatedDate;
	}
	public void setUpdatedDate(LocalDateTime updatedDate) {
		this.updatedDate = updatedDate;
	}
	public AbstractAuditDTO(String createdBy, LocalDateTime createdDate, String updatedBy, LocalDateTime updatedDate) {
		super();
		this.createdBy = createdBy;
		this.createdDate = createdDate;
		this.updatedBy = updatedBy;
		this.updatedDate = updatedDate;
	}
	

}
