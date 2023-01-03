package com.xworkz.collections.boot;

import java.util.Collection;
import java.util.LinkedList;
import java.util.stream.Collectors;

import com.xworkz.collections.dto.ApplicationDTO;

public class ApplicationRunner {

	public static void main(String[] args) {
		Collection<ApplicationDTO>app=new LinkedList<ApplicationDTO>();
		app.add(new ApplicationDTO("facebook", 5, "meta", 0, true));
		app.add(new ApplicationDTO("whatsapp", 2.22, "meta", 0, true));
		app.add(new ApplicationDTO("instagram",  237.0, "meta", 0, true));
		app.add(new ApplicationDTO("Google Classroom", 8.0, "Google", 0, true));
		app.add(new ApplicationDTO("Google drive", 13.0, "Google", 0, true));
		System.out.println("run1 of stream");
		app.stream().filter(dto->dto.isFree()&&dto.getDevelopedBy()=="Google").collect(Collectors.toSet()).forEach(dto->System.out.println(dto));
		System.out.println("run2 of stream");
		app.stream().filter(dto->dto.getVersion()>5).collect(Collectors.toSet()).forEach(dto->System.out.println(dto.getName()));
		
	}

}
