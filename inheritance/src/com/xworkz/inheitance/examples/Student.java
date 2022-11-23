package com.xworkz.inheitance.examples;


public class Student {
	public String name;
	public int regno;
	public int total_marks;

	public Student() {
		System.out.println("default constructotr of class student");
	}

	public Student(String name, int regno, int total_marks) {
		this();
		this.name=name;
		this.regno=regno;
		this.total_marks=total_marks;
		System.out.println(name);
		System.out.println(regno);
		System.out.println(total_marks);
	}
}
