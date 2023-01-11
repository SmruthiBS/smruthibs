package com.xworkz.spring.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
public class Software {
	@Autowired
	@Qualifier("softwareName")
	private String name;
	@Autowired
	@Qualifier("version")
	private String version;
	@Autowired
	@Qualifier("developer")
	private String developer;
	@Autowired
	@Qualifier("date")
	private String date;
	@Autowired

	private boolean free;
	
public Software() {
	System.out.println("default constructor of software");
}

@Override
public String toString() {
	return "Software [name=" + name + ", version=" + version + ", developer=" + developer + ", date=" + date + ", free="
			+ free + "]";
}

}
