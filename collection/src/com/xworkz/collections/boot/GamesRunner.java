package com.xworkz.collections.boot;

import java.util.ArrayList;
import java.util.Collection;

import com.xworkz.collections.dto.GamesDTO;

public class GamesRunner {
	public static void main(String[] args) {
		boolean equals, contains;
		GamesDTO dto1 = new GamesDTO("basket ball", 5, "outdoor");
		GamesDTO dto2 = new GamesDTO("foot ball", 11, "outdoor");
		GamesDTO dto3 = new GamesDTO("volley ball", 6, "outdoor");
		GamesDTO dto4 = new GamesDTO(" ludo", 4, "indoor");
		GamesDTO dto5 = new GamesDTO("basket ball", 5, "outdoor");
		equals = dto1.equals(dto5);
		System.out.println("equals " + equals);
		equals = dto2.equals(dto3);
		System.out.println("equals " + equals);
		Collection<GamesDTO> games = new ArrayList<GamesDTO>();
		games.add(dto5);
		games.add(dto4);
		games.add(dto3);
		games.add(dto2);
		games.add(dto1);
		contains = games.contains(dto1);
		System.out.println("contains " + contains);

	}
}
