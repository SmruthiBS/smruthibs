package com.xworkz.association.examples.country;

import com.xworkz.association.constants.Gender;

public class President {
	public String name;
	public int tenure;
	public Gender gender;
	public President(String name, int tenure, Gender gender) {
		super();
		this.name = name;
		this.tenure = tenure;
		this.gender = gender;
	}

	public void display()
	{
		System.out.println(this.name);
		System.out.println(this.tenure);
		System.out.println(this.gender);
	}
}

