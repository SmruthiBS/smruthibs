package com.xworks.programs;

import java.util.Scanner;

public class Sum {
	 public static void main(String[] arg) 
	 {
	   int x, y ;
	   Scanner sc = new Scanner(System.in);	
	   System.out.print("Please Give first number: ");
	   x = sc.nextInt(); 
	   System.out.print("Please Give second number: ");
	   y = sc.nextInt(); 
   while(y != 0){
         int carry = x & y;//x bitwise and y
         x = x ^ y;//x xor y
         y = carry << 1;//carry leftshift 1
     }
     System.out.print("Sum = "+x); 
		System.out.print("\n");     	
	}

}
//covert x and y to binary
//apply x&y and store in carry
//apply x xor y and store in x
//apply left shift to carry and store in y
//repeat loop till y=0 
