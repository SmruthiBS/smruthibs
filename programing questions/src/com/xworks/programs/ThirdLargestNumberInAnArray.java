package com.xworks.programs;

public class ThirdLargestNumberInAnArray {
 
		   public static void main(String args[]){
		   int temp, size;
		   int array[] = {20,40,80,45,5,25,85,100};
		   size = array.length;
		   System.out.println("array is ");
		   for(int index=0;index<size;index++) {
			   System.out.print(" "+array[index]);
		   }
		   
		   for(int i = 0; i<size; i++ ){
		      for(int j = i+1; j<size; j++){
		         if(array[i]>array[j]){
		            temp = array[i];
		            array[i] = array[j];
		            array[j] = temp;
		         }
		      }
		   }
		   System.out.println();
		   System.out.println("Third largest number is: "+array[size-3]);
		   }

}
