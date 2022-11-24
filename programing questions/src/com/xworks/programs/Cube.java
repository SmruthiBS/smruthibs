package com.xworks.programs;

import java.util.Scanner;

public class Cube {
	public static void main(String[] args)    
	{   
	System.out.print("Enter a number: ");  
	//creating object of the Scanner class  
	Scanner sc = new Scanner(System.in);  
	//reading a number form the user  
	int number = sc.nextInt();  
	 int cube=number*number*number;
	 System.out.println(cube);
	}
	

}
