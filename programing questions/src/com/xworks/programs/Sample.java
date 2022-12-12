package com.xworks.programs;

public class Sample {
	public static void main(String[] args) {
		int array[]= {5,3,7};
		int j=0;
		for(int i=0;i<array.length;i++) {
			if(array[i]<array[j])
			{
				array[i]=array[i]+array[j];
			}
		}
	for( int i=0;i<array.length;i++) {
	System.out.println(array[i]);	
	}
	}

}
