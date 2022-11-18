package com.xworks.programs;

public class DulplicateElement {
	 
	    public static void main(String[] args) {      
	          
	        //Initialize array   
	        int [] array = new int [] {1, 2, 3, 4, 2, 7, 8, 8, 3};   
	     
	        System.out.println("Duplicate elements in given array: ");  
	        //Searches for duplicate element  
	        for(int index = 0; index < array.length; index++) {  
	            for(int index2 = index + 1; index2< array.length; index2++) {  
	                if(array[index] == array[index2])  
	                    System.out.println(array[index2]);  
	            }  
	        }  
	    }  
	}  


