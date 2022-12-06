package com.xworks.programs;

public class StringReverse {
	public static void main(String[] args) {
		String originalString="xworkz", reverseString="";
		char chracter;
		System.out.println("original String is " +originalString);
		for(int index=0;index<originalString.length();index++)
		{
			chracter=originalString.charAt(index);
			reverseString=chracter+reverseString;
		}
		System.out.println("reversed String "+reverseString);
		}
	

}
