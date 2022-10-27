package com.xworkz.association.examples;

import com.xworkz.association.constants.PillarShape;

public class Pillar {
	public int id;
	public String place;
	public PillarShape shape;
	public float height;
	public String supporting;
	public Company company=new Company("NBCC", "construction");
	public Pillar(int id, String place, PillarShape shape, float height, String supporting) {
		super();
		this.id = id;
		this.place = place;
		this.shape = shape;
		this.height = height;
		this.supporting = supporting;
	}
	public void showoff()
	{
	System.out.println(this.id);
	System.out.println(this.place);
	System.out.println(this.shape);
	System.out.println(this.height);
	System.out.println(this.supporting);
	if(company!=null) {
	this.company.showoff();
	}
	else
		System.out.println("company is null");
	
}
}
