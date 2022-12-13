package com.xworkz.repo.boot;

import com.xworkz.repo.examples.crud.SweetRepositoryImplimentation;
import com.xworkz.repo.examples.interfaces.SweetRepository;

public class SweetRunner {

	public static void main(String[] args) {
	SweetRepository sweet=new SweetRepositoryImplimentation();	
sweet.create("mysore pak");
sweet.create("kaju barfi");
sweet.create("jamun");
sweet.create("rasgulla");
sweet.create("rasmalli");
sweet.create("champakali");
sweet.create("barfi");
sweet.create("jalebi");
sweet.create("jangeer");
sweet.create("laddu");
sweet.create("modaka");
	}

}
