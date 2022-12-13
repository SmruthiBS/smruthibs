package com.xworkz.repo.examples.crud;

import com.xworkz.repo.examples.interfaces.SweetRepository;

import com.xworkz.repo.examples.userdefinedException.SweetSizeExceedsException;

public class SweetRepositoryImplimentation implements SweetRepository {
	private String sweets[]=new String[10];
	private int total;


	@Override
	public boolean create(String sweet) {
		System.out.println("running create sweet");
		if(this.total>this.sweets.length) {
		
		throw new SweetSizeExceedsException();}
		this.sweets[total]=sweet;
		this.total++;
		return false;
	}

}
