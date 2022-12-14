package com.xworks.programs;

import java.util.Scanner;

public class Cupon {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("enter a string");
		String cupon=scan.next();

		String str1=cupon.substring(0, 2);//retrive first 2 characters
		System.out.println(str1);
		String str2=cupon.substring(2, 6);//retrive next 4 characters
		System.out.println(str2);
		int value=Integer.valueOf(str2);//coverts string to integer
		System.out.println(value);
		if(cupon.length()==9 && value==2022){//check if length of string =9 and converted value of st2 is 2022
			System.out.println("cupon is valid");
		} else {
			System.err.println("cupon is in valid");
		}
	}
}
