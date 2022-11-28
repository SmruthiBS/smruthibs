package com.xworkz.strings.boot;

import com.xworkz.strings.Programs;

public class ProgramsRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Programs programs=new Programs();
programs.frequency();//no of r's
System.out.println("-------------------------------------------------------------------------------------------------");
System.out.println("uppercase String is "+programs.upper);
System.out.println("--------------------------------------------------------------------------------------------------");
System.out.println("lowercase string is "+programs.lower);//using inbulit method
System.out.println("--------------------------------------------------------------------------------------------------");
programs.lower();//using user defiend method
System.out.println("----------------------------------------------------------------------------------------------------");
programs.upper();//uppercase
programs.digit();//digit only
programs.reverse();
programs.array();
programs.duplicate();
programs.split();

	}

}
