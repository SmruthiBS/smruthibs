package com.xworkz.collections.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

import com.xworkz.collections.dto.PalaceDTO;

public class PalaceRunner {
	public static void main(String[] args) {
		Collection<PalaceDTO>palace=new ArrayList<PalaceDTO>();
		PalaceDTO dto1=new PalaceDTO("Mysore Palace", "Mysore", "Yaduraya ", false,  100);
		palace.add(dto1);
		palace.add(new PalaceDTO("Bangalore Palace", "Bangalore", "Chamaraja Wadiyar ", false,  230 ));
		palace.add(new PalaceDTO("Lalitha Mahal Palace", "Mysore", "Krishnaraja Wodeyar IV", false, 100));
		palace.add(new PalaceDTO("Nalknad Palace", "kodagu", " Chikka Veerarajendra ", false,50));
		palace.add(new PalaceDTO("Jaganmohan Palace", "mysore", "Chamaraja Wadiyar", false, 100));
		palace.stream().filter(dto->!dto.isDestroyed()).collect(Collectors.toSet()).forEach(dto->System.out.println(dto));
		
	}

}
