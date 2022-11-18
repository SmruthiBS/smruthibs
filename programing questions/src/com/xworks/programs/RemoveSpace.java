package com.xworks.programs;

import java.util.Scanner;

public class RemoveSpace {
	public static void main(String[] args) {
		System.out.println("enter a String");
	Scanner sc=new Scanner(System.in);
	String string=sc.nextLine();
	char[] character=string.toCharArray();
	String modifedString="";
	for(int index=0;index<character.length;index++) {
		if(string.charAt(index)==' ')
		{
		continue;
		
	}else {
		modifedString= modifedString+string.charAt(index);
	}
	
	
	}
System.out.println("modifeid String= "+ modifedString);}
}
