package com.xworkz.spring.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.xworkz.spring.interfaces.Browser;
import com.xworkz.spring.interfaces.Provider;
@Component
public class Chrome implements Browser {
	@Autowired
	@Qualifier("airtel")
	private Provider airtel;
	@Autowired
	@Qualifier("jio")
	private Provider jio;
	public Chrome() {
		System.out.println("created chrome");
	}

	@Override
	public void browse() {
		System.out.println("running browse in chrome");
		airtel.connect();
	}

}
