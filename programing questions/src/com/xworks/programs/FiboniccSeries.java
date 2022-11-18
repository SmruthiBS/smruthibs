package com.xworks.programs;

public class FiboniccSeries {
public static void main(String args[]) {
	int num1=0,num2=1,num3,index,count=10;    
	 System.out.print(num1+" "+num2);
	 System.out.println("\n");
	 
	 //printing 0 and 1    
	 System.out.println("fibonacci series is ");   
	 for(index=2;index<count;++index)//loop starts from 2 because 0 and 1 are already printed    
	 {    
	  num3=num1+num2;    
	  System.out.print(" "+num3);    
	  num1=num2;    
	  num2=num3;    
	 }    
	  
	}
		 
	 
}

