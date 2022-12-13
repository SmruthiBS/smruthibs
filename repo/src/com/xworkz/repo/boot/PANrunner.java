package com.xworkz.repo.boot;


import com.xworkz.repo.examples.crud.PANRepositoryImplimentation;
import com.xworkz.repo.examples.interfaces.PANRepository;


public class PANrunner {

	public static void main(String[] args) {
		PANRepository pan=new PANRepositoryImplimentation();
		pan.create("pa1234457");
		pan.create("bc56893");
		pan.create("kl4527895");
		pan.create("ty456289");
		pan.create("hi465211");
		pan.create("ul46226");
		pan.create("rt862172");
		pan.create("io4563573");
		pan.create("dr456796");
		pan.create("jk45789332");
		pan.create("sd467895");
		
	}

}
