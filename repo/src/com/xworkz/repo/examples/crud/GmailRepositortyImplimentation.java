package com.xworkz.repo.examples.crud;

import com.xworkz.repo.examples.interfaces.GmailRepository;
import com.xworkz.repo.examples.userdefinedException.EmailSizeExceedException;

public class GmailRepositortyImplimentation implements GmailRepository{
	private String gmails[]=new String[10];
	private int total;

	@Override
	public boolean create(String gmail) {
		System.out.println("running create email");
		if(this.total>this.gmails.length) {
		
		throw new EmailSizeExceedException();}
		this.gmails[total]=gmail;
		this.total++;
		return true;
		
	}

	@Override
	public int totalGmails() {
	
		return GmailRepository.super.totalGmails();
	}

}
