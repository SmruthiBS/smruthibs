package com.xworks.programs;

public class SwapString {
	  
	    public static void main(String[] args) {    
	        String firstName = "john ", lastName = "McClane ";    
	         System.out.println("Strings before swapping: " + firstName + " " + lastName);    
	        
	        //Concatenate both the string str1 and str2 and store it in str1    
	        firstName = firstName + lastName;    
	        //Extract str2 from updated str1    
	        lastName =firstName.substring(0, (firstName.length() - lastName.length()));    
	        //Extract str1 from updated str1    
	        firstName = firstName.substring(lastName.length());    
	            
	        System.out.println("Strings after swapping: " + firstName + " " + lastName);    
	    }    
	}


