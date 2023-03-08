package com.xworkz.smruthi_xworkz.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "zoo_table")
@NamedQuery(name = "findByLocation",query = "select ent from ZooEntity ent where ent.location=:loc")
public class ZooEntity {
	@Id
	@Column(name = "id")
	private int id;
	@Column(name = "name")
	private String name;
	@Column(name = "location")
	private String location;
	@Column(name = "entry_Fees")
	private double entryFees;
	@Column(name = "area")
	private double area;
	@Column(name = "visitor_Type")
	private String visitorType;
}
