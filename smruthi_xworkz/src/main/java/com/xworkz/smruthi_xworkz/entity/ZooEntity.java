package com.xworkz.smruthi_xworkz.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Entity
@Data
@Slf4j
@Table(name = "zoo_table")
@NamedQuery(name = "findByLocation",query = "select ent from ZooEntity ent where ent.location=:loc")
@NamedQuery(name = "findByName",query = "select ent from ZooEntity ent where ent.name=:nam")
@NamedQuery(name = "findByNameAndLocation",query = "select ent from ZooEntity ent where ent.name=:nam and ent.location=:loca")
@NamedQuery(name = "findAll",query = "select ent from ZooEntity ent ")
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
