package com.xworks.programs;

public class Evenodd {

	public static void main(String[] args) {

		// number
		int num = 52 ;

		// variable to store count of digits in number
		int rem = 0;

		// count number of digits in num
		while (num > 0) {
			rem = num % 10;
			if (rem % 2 == 0) {
				System.out.println("number is even");
			} else {
				System.out.println("number is odd");

		}
		num = num/10;
	}
	// print the count
	// System.out.println( "number of digits= "+count);}

}
}
