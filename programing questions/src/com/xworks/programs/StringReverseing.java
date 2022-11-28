package com.xworks.programs;

public class StringReverseing {

	public static void main(String[] args) {
		String string="xworkz",reverse="";
	char ch;
	System.out.println(string);
	 for (int i=0; i<string.length(); i++)
     {
       ch= string.charAt(i); //extracts each character
       reverse= ch+reverse; //adds each character in front of the existing string
     }
     System.out.println("Reversed String: "+ reverse);

		}

}

