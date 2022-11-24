package com.xworks.programs;

import java.util.Scanner;

public class Squareroot {
	public static void main(String[] args)    
	{   
	System.out.print("Enter a number: ");  
	//creating object of the Scanner class  
	Scanner sc = new Scanner(System.in);  
	//reading a number form the user  
	int number = sc.nextInt();  
	
	double temp;//tempory variable  
	double sqrtroot=number/2;  
	do   
	{  
	temp=sqrtroot;  
	sqrtroot=(temp+(number/temp))/2;  
	}   
	while((temp-sqrtroot)!= 0); 
	System.out.println(sqrtroot);
	  
	}  

}
