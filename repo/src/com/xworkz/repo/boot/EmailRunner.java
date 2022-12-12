package com.xworkz.repo.boot;

import com.xworkz.repo.examples.crud.GmailRepositortyImplimentation;
import com.xworkz.repo.examples.interfaces.GmailRepository;

public class EmailRunner {

	public static void main(String[] args) {
	GmailRepository gmail=new GmailRepositortyImplimentation();
	gmail.create("smruthi.xworkz@gmail.com");
	gmail.create("nayana.xworkz@gmail.com");
	gmail.create("anusha.xworkz@gmail.com");
	gmail.create("aishwarya.xworkz@gmail.com");
	gmail.create("shweetha.xworkz@gmail.com");
	gmail.create("spoorthi.xworkz@gmail.com");
	gmail.create("sahana.xworkz@gmail.com");
	gmail.create("rahul.xworkz@gmail.com");
	gmail.create("deepa.xworkz@gmail.com");
	gmail.create("jeevan.xworkz@gmail.com");
	gmail.create("hamsa.xworkz@gmail.com");

	}

}
