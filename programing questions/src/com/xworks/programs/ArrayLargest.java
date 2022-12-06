package com.xworks.programs;

public class ArrayLargest {

	public static void main(String[] args) {
	int[] array= {10,20,30,15,40};
	int max=array[0];
	for(int i=1;i<array.length;i++) {
		if(array[i]>max) {
			max=array[i];
			
		}
	
	}
	System.out.println("maximum in a array is "+max);
	}

}
