package com.xworks.programs;

public class ReverseNumber {
	public static void main(String[] args)   
	{  
	int number = 12345, reverse = 0;  
	while(number != 0)   
	{  
	int remainder = number % 10;  
	reverse = reverse * 10 + remainder;  
	number = number/10;  
	}  
	System.out.println("The reverse of the given number is: " + reverse);  
	}  

}
// find the reminder of the number
//find the reverse by using given formula
//divide the number by 10
//repeat the fallowing until number becomes 0
