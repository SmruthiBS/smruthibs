package com.xworkz.collections.boot;

import java.util.Collection;
import java.util.LinkedList;
import java.util.stream.Collectors;

import com.xworkz.collections.dto.CompanyCEODTO;
import com.xworkz.collections.dto.DaughterDTO;

public class CompanyCEORunner {
	public static void main(String[] args) {
		Collection<CompanyCEODTO> ceo=new LinkedList<CompanyCEODTO>();
		DaughterDTO dto1=new DaughterDTO("kavana", 4567713845l, 35, true, true);
		DaughterDTO dto2=new DaughterDTO("angali", 5456771384l, 22, true, true);
		DaughterDTO dto3=new DaughterDTO("steph", 45677138l, 25, true, true);
		DaughterDTO dto4=new DaughterDTO("kavya", 45674595l, 27, true, true);
		ceo.add(new CompanyCEODTO("Salil Parekh", "Infosys", 58, "india"," Aeronautical Engineering" , true, dto1));
		ceo.add(new CompanyCEODTO("Rajesh Gopinathan", "TCS", 52, "india"," Electrical and Electronics Engineering" , true, dto2));
		ceo.add(new CompanyCEODTO("Tim Cook", "apple", 62, "American","BS, BSc, SB,  ScB" , true, dto3));
		ceo.add(new CompanyCEODTO("Sundar Pichai", "google", 50, "American"," metallurgical engineering " , true, dto4));
		ceo.stream().map(dto->dto.getDaughterDTO()).collect(Collectors.toList()).forEach(vet->System.out.println(vet));
		System.out.println("stream1");

		ceo.stream().map(dto->dto.getDaughterDTO().getName()).collect(Collectors.toSet()).forEach(ele->System.out.println(ele));
		System.out.println("stream2");
		ceo.stream().filter(values->values.getAge()>30).collect(Collectors.toList()).forEach(dto->System.out.println(dto));
		System.out.println("stream 3");
		
		ceo.stream().forEach(age->System.out.println("Father age:"+age.getAge()+"  Daughter age:"+age.getDaughterDTO().getAge()));
	
	
	
	}

}
