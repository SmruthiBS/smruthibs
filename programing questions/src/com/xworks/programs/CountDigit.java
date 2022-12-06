package com.xworks.programs;

public class CountDigit {
	 public static void main(String[] args) {
	        //number
	        int num = 12345;
	         
	        //variable to store count of digits in number
	        int count = 0;
	         
	        //count number of digits in num
	        while(num!=0) {
	            num = num/10; //removes last digit of num
	            count++;
	        
	        }
	         
	        //print the count
	        System.out.println( "number of digits= "+count);
	    }
	}

//input a number
//divide that number by 10 and incriment count
//repeat the same till number becomes 0c
