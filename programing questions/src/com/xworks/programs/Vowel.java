package com.xworks.programs;

public class Vowel {
	public static void main(String[] args) {
		String string="technology";
		int count=0, i;
		for(i=0;i<string.length();i++) {
			if(string.charAt(i)=='a'||string.charAt(i)=='e'||string.charAt(i)=='i'||string.charAt(i)=='o'||string.charAt(i)=='u')
			{
				count++;
			}
			
		}
	
	System.out.println("no of  vowels is "+count);
	}
}
