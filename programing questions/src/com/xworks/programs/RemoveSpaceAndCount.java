package com.xworks.programs;

import java.util.Scanner;

public class RemoveSpaceAndCount {
	public static void main(String[] args) {
		System.out.println("enter a String");
	Scanner sc=new Scanner(System.in);
	String string=sc.nextLine();
	int count=0;
	char[] character=string.toCharArray();
	String modifedString="";
	for(int index=0;index<character.length;index++) {
		if(string.charAt(index)==' ')
		{
			count++;
		continue;
		
		
	}else {
		modifedString= modifedString+string.charAt(index);
	}
	
	
	}
	System.out.println("count= "+count);
System.out.println("modifeid String= "+ modifedString);}
}
