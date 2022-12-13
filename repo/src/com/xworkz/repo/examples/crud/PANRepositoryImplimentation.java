package com.xworkz.repo.examples.crud;

import com.xworkz.repo.examples.interfaces.PANRepository;
import com.xworkz.repo.examples.userdefinedException.PANSizeExceedsException;

public class PANRepositoryImplimentation implements PANRepository {
	private String PAN[]=new String[10];
	private int total;

	@Override
	public boolean create(String PANNumber) {
		System.out.println("running create PAN");
		if(this.total>this.PAN.length) {
		
		throw new PANSizeExceedsException();}
		this.PAN[total]=PANNumber;
		this.total++;
		
		return false;
	}

}
