package com.xworkz.connection.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "helmet_table")
public class HelmetDTO {
	@Column(name = "h_id")
	@Id
	private int id;
	@Column(name = "h_brand")
	private String brand;
	@Column(name = "h_price")
	private Double price;
	@Column(name = "h_colour")
	private String colour;
	@Column(name = "")
	private String type;
}
