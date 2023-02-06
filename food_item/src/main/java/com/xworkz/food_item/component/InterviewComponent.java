package com.xworkz.food_item.component;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.food_item.dto.InterviewDTO;

@Component
@RequestMapping("/select")
public class InterviewComponent {
	public InterviewComponent() {
		System.out.println("created "+this.getClass().getSimpleName());
		
	}
	@PostMapping
	public String onSelect(InterviewDTO dto) {
		System.out.println("running onselect");
		System.out.println("dto entred is "+dto);
		return "interview.jsp";
		
	}

}
