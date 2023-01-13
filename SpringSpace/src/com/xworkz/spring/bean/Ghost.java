package com.xworkz.spring.bean;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component

public class Ghost {
	private String ghostName;
	private String gender;
	private String fatherName;
	private String motherName;
	private String place;
	private double nailsLength;
	private String reasonOfDeath;
	private String placeOfDeath;
	private boolean dangrous;
	private LocalDate dateOfDeath;
	@Autowired
	@Qualifier("noOfYearsToDeath")
	private int noOfYearsToDeath;
	@Autowired
	@Qualifier("favFood")
	private String favFood;
	@Autowired
	@Qualifier("noOfSiblings")
	private int noOfSiblings;
	@Autowired
	@Qualifier("motherAlive")
	private boolean motherAlive;
	@Autowired
	@Qualifier("fatherAlive")
	private boolean fatherAlive;
	@Autowired
	@Qualifier("grandFtherName")
	private String grandFatherName;
	@Autowired
	@Qualifier("friendly")
	private boolean friendly;
	@Autowired
	@Qualifier("inHeaven")
	private boolean inHeaven;
	@Autowired
	@Qualifier("inHell")
	private boolean inHell;
	@Autowired
	@Qualifier("religion")
	private String religion;
	
	public Ghost(@Qualifier("ghostName") String ghostName,  @Qualifier("gender") String gender ,  @Qualifier("fatherName") String fatherName,  @Qualifier("motherName") String motherName, @Qualifier("place") String place,@Qualifier("nailLength")  double nailsLength,
			@Qualifier("reasonOfDeath") String reasonOfDeath, @Qualifier("placeOfDeath") String placeOfDeath,@Qualifier("dangrous")  boolean dangrous,@Qualifier("dateOfDeath")  LocalDate dateOfDeath) {
		super();
		this.ghostName = ghostName;
		this.gender = gender;
		this.fatherName = fatherName;
		this.motherName = motherName;
		this.place = place;
		this.nailsLength = nailsLength;
		this.reasonOfDeath = reasonOfDeath;
		this.placeOfDeath = placeOfDeath;
		this.dangrous = dangrous;
		this.dateOfDeath = dateOfDeath;
	}

	@Override
	public String toString() {
		return "Ghost [name=" + ghostName + ", gender=" + gender + ", fatherName=" + fatherName + ", motherName="
				+ motherName + ", place=" + place + ", nailsLength=" + nailsLength + ", reasonOfDeath=" + reasonOfDeath
				+ ", placeOfDeath=" + placeOfDeath + ", dangrous=" + dangrous + ", dateOfDeath=" + dateOfDeath
				+ ", noOfYearsToDeath=" + noOfYearsToDeath + ", favFood=" + favFood + ", noOfSiblings=" + noOfSiblings
				+ ", motherAlive=" + motherAlive + ", fatherAlive=" + fatherAlive + ", grandFatherName="
				+ grandFatherName + ", friendly=" + friendly + ", inHeaven=" + inHeaven + ", inHell=" + inHell
				+ ", religion=" + religion + "]";
	}

}
