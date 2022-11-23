package com.xworkz.equal.examples;

import com.sun.org.apache.bcel.internal.generic.INSTANCEOF;

public class God {
	

	private String name;
	private String wifeName;
	private String power;
	private String vahana;
	private String other_name;
	private String temple;
	private String weapon;
	private int noOfWifes;
	private String templeLocation;
	private String children;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getWifeName() {
		return wifeName;
	}
	public void setWifeName(String wifeName) {
		this.wifeName = wifeName;
	}
	public String getPower() {
		return power;
	}
	public void setPower(String power) {
		this.power = power;
	}
	public String getVahana() {
		return vahana;
	}
	public void setVahana(String vahana) {
		this.vahana = vahana;
	}
	public String getOther_name() {
		return other_name;
	}
	public void setOther_name(String other_name) {
		this.other_name = other_name;
	}
	public String getTemple() {
		return temple;
	}
	public void setTemple(String temple) {
		this.temple = temple;
	}
	public String weapon() {
		return weapon;
	}
	public void setQuality(String weapon) {
		this.weapon = weapon;
	}
	public int getNoOfWifes() {
		return noOfWifes;
	}
	public void setNoOfWifes(int noOfWifes) {
		this.noOfWifes = noOfWifes;
	}
	public String getTempleLocation() {
		return templeLocation;
	}
	public void setTempleLocation(String templeLocation) {
		this.templeLocation = templeLocation;
	}
	public String getChildren() {
		return children;
	}
	public void setChildren(String children) {
		this.children = children;
	}
	public God() {
		super();
		System.out.println("default constructor of class god");
	}
	
	
	public God(String name, String wifeName, String power, String vahana, String other_name, String temple,
			String weapon, int noOfWifes, String templeLocation, String children) {
		this();
		this.name = name;
		this.wifeName = wifeName;
		this.power = power;
		this.vahana = vahana;
		this.other_name = other_name;
		this.temple = temple;
		this.weapon = weapon;
		this.noOfWifes = noOfWifes;
		this.templeLocation = templeLocation;
		this.children = children;
	}
	@Override
	public String toString() {
		return "God [name=" + name + ", wifeName=" + wifeName + ", power=" + power + ", vahana=" + vahana
				+ ", other_name=" + other_name + ", temple=" + temple + ",weapon=" + weapon + ", noOfWifes="
				+ noOfWifes + ", templeLocation=" + templeLocation + ", children=" + children + "]";}
	@Override
	public boolean equals(Object obj) {
		System.out.println("running equals of god");
		if (obj instanceof God) {
			System.out.println("obj is the instance of god");
			God casted=(God)obj;
			if(this.children.equals(casted.children)&&this.name.equals(casted.name)&&this.other_name.equals(casted.other_name));
			System.out.println("children name and other name are same");
			return true;
		}
		
		else {
			System.out.println("obj not instance of god");
		return super.equals(obj);
	}
	}
}
	

	