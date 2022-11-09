package com.xworkz.inheitance.child.director;

import com.xworkz.inheitance.examples.Director;

public class Prasanth extends Director {
	public String movieDirected;

	public Prasanth(String name, int experince,String movieDirected) {
		super(name, experince);
		// TODO Auto-generated constructor stub
		this.movieDirected=movieDirected;
	}
public void display() {
	super.display();
	System.out.println(this.movieDirected);
}
}
