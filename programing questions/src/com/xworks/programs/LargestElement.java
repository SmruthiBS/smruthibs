package com.xworks.programs;

public class LargestElement {
	public static void main(String[] args)
    {
		int array[]= {10,20,30,40,50,100};
		 int i;
         
	        // Initialize maximum element
	        int max = array[0];
	         
	        // Traverse array elements from second and
	        // compare every element with current max
	        for (i = 1; i < array.length; i++)
	            if (array[i] > max)
	                max = array[i];
	         
	         System.out.println("largest element is "+max);
    }

}
