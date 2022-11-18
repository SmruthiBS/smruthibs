package com.xworks.programs;

public class SumOfArray {
 
	    public static void main(String[] args) {      
	          
	        //Initialize array   
	        int [] array={1, 2, 3, 4, 5};   
	        int sum = 0;  
	          
	        //Loop through the array to calculate sum of elements  
	        for (int i = 0; i < array.length; i++) {   
	           sum = sum + array[i];  
	        }    
	        System.out.println("Sum of all the elements of an array: " + sum);  
	    }  
	}  


