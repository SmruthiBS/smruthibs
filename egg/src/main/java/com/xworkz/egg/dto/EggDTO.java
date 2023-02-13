package com.xworkz.egg.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Entity
@Table(name = "egg_table")
@Data
public class EggDTO {
	@Id
	@Column(name ="e_id")
	private int id;
	@Column(name ="e_hotelName")
private String hotelName;
	@Column(name ="e_dishName")
private String dishName;
	@Column(name ="e_type")
private String type;
	@Column(name ="e_price")
private double price;
	@Column(name ="e_quantity")
private int quantity;
	@Column(name ="e_takeAway")
private boolean takeAway;

}
