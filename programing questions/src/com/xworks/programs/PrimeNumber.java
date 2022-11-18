package com.xworks.programs;

public class PrimeNumber {
	 public static void main(String args[]){    
		  int i,m=0,flag=0;      
		  int n=20;//it is the number to be checked    
		  m=n/2;      
		  if(n==0||n==1){  
		   System.out.println(n+" is not prime number");      
		  }else{  
		   for(i=2;i<=m;i++){   
	 if(n%i==0){      
	     System.out.println(n+" is not prime number");      
	     flag=1;      
	     break;      
	    }      
	   }      
	   if(flag==0)  { System.out.println(n+" is prime number"); }  
	  }//end of else  
	}    
	} 

//divide the number by 2 and store in a variable
//loop till the number is less the variable in step1
//within the loop if the number modulas looping variable is 0 then number is prime
// delare a flaging variable at initilize it to 0
//if number is prime change flag to 1
//check the flag to see if number is prime or not
