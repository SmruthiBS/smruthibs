package com.xworks.programs;

public class SecondLargestElement {
	public static void main( String[] args) {
		int array[]= {20, 40, 80, 100, 90, 10};
		int length= array.length;
		int temp;  
		for (int i = 0; i < length; i++)   
		        {  
		            for (int j = i + 1; j < length; j++)   
		            {  
		                if (array[i] > array[j])   
		                {  
		                    temp = array[i];  
		                    array[i] = array[j];  
		                    array[j] = temp;  
		                }  
		            }  
		        }  
		       System.out.println(array[length-2]);  
		
	}

}
