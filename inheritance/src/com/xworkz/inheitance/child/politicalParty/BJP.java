package com.xworkz.inheitance.child.politicalParty;

import com.xworkz.inheitance.examples.PoliticalParty;

public class BJP extends PoliticalParty {
	public String leader;

	public BJP(String name, String founder,String leader) {
		super(name, founder);
		this.leader=leader;
	}
	public void display() {
		super.display();
		System.out.println(this.leader);
	}

}
