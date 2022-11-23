package com.xworks.programs;

public class ArmstrongNumber {
	   public static void main(String[] args)
	    {

	        int n = 153;
	        int temp = n;
	        int p = 0;

	        /*function to calculate
	          the sum of individual digits
	         */
	        while (n > 0) {

	            int rem = n % 10;
	            n = n / 10;
	            p = (p) + (rem * rem * rem);

	        }

	        /* condition to check whether
	           the value of P equals
	           to user input or not. */
	        if (temp == p) {
	            System.out.println("Yes. It is Armstrong No.");
	        }
	        else {
	            System.out.println(
	                "No. It is not an Armstrong No.");
	        }
	    }

}
