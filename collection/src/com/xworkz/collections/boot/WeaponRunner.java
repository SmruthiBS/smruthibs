package com.xworkz.collections.boot;

import java.time.LocalDate;
import java.util.Collection;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.stream.Collectors;

import com.xworkz.collections.constant.weaponType;
import com.xworkz.collections.dto.WeaponDTO;

import sun.util.resources.LocaleData;

public class WeaponRunner {

	public static void main(String[] args) {
		Collection<WeaponDTO> weapon = new LinkedList<WeaponDTO>();
		weapon.add(new WeaponDTO("MG3 Machine Gun", "india", LocalDate.of(2008, 1, 1), 1000D, weaponType.GUNS));
		weapon.add(new WeaponDTO("Little Boy", "usa", LocalDate.of(1945, 2, 2), 2000D, weaponType.BOMBS));
		weapon.add(new WeaponDTO(" Prithvi I", "india", LocalDate.of(200, 3, 3), 3000D, weaponType.MISSILES));
		weapon.add(new WeaponDTO("Prithvi II", "india", LocalDate.of(2019, 4, 4), 4000D, weaponType.MISSILES));
		weapon.add(new WeaponDTO("Agni I,", "india", LocalDate.of(2020, 5, 5), 5000D, weaponType.MISSILES));
		weapon.add(new WeaponDTO("Agni II", "india", LocalDate.of(2017, 6, 6), 6000D, weaponType.MISSILES));
		weapon.add(new WeaponDTO("dhanush", "india", LocalDate.of(2019, 7, 7), 7000D, weaponType.MISSILES));
		weapon.add(new WeaponDTO("AK-203", "india", LocalDate.of(2022, 8, 8), 8000D, weaponType.GUNS));
		weapon.add(new WeaponDTO("Beretta Px4 Storm", "india", LocalDate.of(2000, 9, 9), 9000D, weaponType.GUNS));
		weapon.add(new WeaponDTO("Glock", "india", LocalDate.of(2020, 10, 10), 1000D, weaponType.GUNS));
		weapon.add(new WeaponDTO("Micro-Uzi", "india", LocalDate.of(2022, 11, 11), 1000D, weaponType.GUNS));
		weapon.add(new WeaponDTO("SIG 716i", "india", LocalDate.of(2021, 12, 12), 9000D, weaponType.GUNS));
		weapon.add(new WeaponDTO("IWI X95", "japan", LocalDate.of(2020, 12, 13), 8000D, weaponType.GUNS));
		weapon.add(new WeaponDTO("M4 carbine", "russia", LocalDate.of(2021, 11, 14), 7000D, weaponType.GUNS));
		System.out.println("Price > 6000 and their names");
		weapon.stream().filter((greater) -> greater.getPrice() > 5000).collect(Collectors.toList())
				.forEach(greater -> System.out.println(greater.getName()));

		System.out.println("Print all made by and made on");
		weapon.stream()
				.forEach(e -> System.out.println("Weapon made by " + e.getMadeBy() + " and made on " + e.getMadeOn()));

		System.out.println("Print all weapon by desc order");
		weapon.stream().sorted((name1, name2) -> name2.getName().compareTo(name1.getName()))
				.forEach(e -> System.out.println(e.getName()));

		System.out.println("Print all weapon made_By by asce order");
		weapon.stream().sorted((made1, made2) -> made1.getMadeBy().compareTo(made2.getMadeBy()))
				.forEach(e -> System.out.println(e.getMadeBy()));

		System.out.println("Print all weapon made_On by asce order");
		weapon.stream().sorted((e1, e2) -> e1.getMadeOn().compareTo(e2.getMadeOn()))
				.forEach(e -> System.out.println(e.getMadeOn()));

		System.out.println("Print all weapon price by asce order");
		weapon.stream().sorted((e1, e2) -> e1.getPrice().compareTo(e2.getPrice()))
				.forEach(e -> System.out.println(e.getPrice()));

		System.out.println("Print all weapon price by desc order");
		Comparator<WeaponDTO>comp=(e1, e2) ->  e2.getPrice().compareTo(e1.getPrice());
		weapon.stream().sorted(comp)
				.forEach(e -> System.out.println(e.getPrice()));

		System.out.println("Print all weapon name and madeOn by asc order");
		weapon.stream().sorted((e1, e2) -> e1.getName().compareTo(e2.getName()))
				.sorted((e1, e2) -> e1.getMadeOn().compareTo(e2.getMadeOn())).forEach(
						e -> System.out.println("Sorted name: " + e.getName() + " and sorted madeOn:" + e.getMadeOn()));

		System.out.println("Print all weapon type, madeBy, name in dese order");
		weapon.stream().sorted((e1, e2) -> e1.getType().compareTo(e1.getType()))
				.sorted((e1, e2) -> e2.getMadeBy().compareTo(e1.getMadeBy()))
				.sorted((e1, e2) -> e2.getName().compareTo(e1.getName()))
				.forEach(e -> System.out.println("Sorted Type: " + e.getType() + " and sorted madeBy:"
						+ e.getMadeBy() + "and Name is: " + e.getName()));

	}

}
