package com.xworks.programs;
import java.util.*;
public class fibonaciee {

	
	    public static void  main(String[] args) {
	         
	      public     int num1=0;
	        public int   num2=1;
	        Scanner scan=new Scanner(System.in);
	        System.out.println("enter number of elements in the series");
	       int  num=scan.nextInt();
	        System.out.println(num1 +num2);
	        for(int i=2;i<num;i++){
	          int  num3=num1+num2;
	            System.out.println(num3);
	            num1=num2;
	            num2=num3;
	        }
	   
	}


