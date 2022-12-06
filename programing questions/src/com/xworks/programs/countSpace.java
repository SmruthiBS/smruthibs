package com.xworks.programs;

public class countSpace {
	  public static void main(String[] args) {
	String str="Smruthi B S";
	int count=0;//initially count should be 0
	for(int i=0;i<str.length();i++) {//traverse the string
		if(str.charAt(i)==' ' ) {//each character in a string is extracted using charAt(),if that character='' count is incremented
			count++;
			
		}
		
	}
	System.out.println("number of space = "+count);//count is printed
}
}
