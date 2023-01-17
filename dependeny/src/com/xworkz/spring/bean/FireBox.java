package com.xworkz.spring.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.xworkz.spring.interfaces.Browser;
import com.xworkz.spring.interfaces.Provider;
@Component
public class FireBox  implements Browser{
	@Autowired
	@Qualifier("jio")
	private Provider jio;
	@Autowired
	@Qualifier("airtel")
	private Provider airtel;
	
	public FireBox() {
		System.out.println("created firefox");
	}

	@Override
	public void browse() {
		System.out.println("running browse in firebox");
		jio.connect();
	
	
	}


}
