package com.xworkx.interfaces.fallowers;

import com.xworkx.interfaces.examples.Person;
import com.xworkx.interfaces.rules.XworkzRule;

public class JavaTrainee  extends Person implements XworkzRule {

	public JavaTrainee(String name, String gender, int age, long phone, String email) {
		super(name, gender, age, phone, email);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean uploadedTask() {
		System.out.println("running uploadedTask");
		return false;
	}

	@Override
	public boolean completedProgram() {
		System.out.println("running  completedProgram ");
		return false;
	}

	@Override
	public void eat() {
		System.out.println("running eat");
		
	}

	@Override
	public void sleep() {
		System.out.println("running sleep");
		
	}
public void training() {
		System.out.println("running training");
	}
public void executeProgram() {
	System.out.println("running executeProgram ");
}
}
