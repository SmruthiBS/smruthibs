package com.xworkz.spring.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.xworkz.spring.interfaces.Fuel;
import com.xworkz.spring.interfaces.PetrolBunk;
@Component
public class Shell implements PetrolBunk {
	@Autowired
	@Qualifier("petrol")
 private Fuel fuel;
 public Shell() {
System.out.println("created shell");
}
	@Override
	public void purchase() {
		System.out.println("running purchase in shell");
fuel.consume();
	}

}
