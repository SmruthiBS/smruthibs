package com.xworks.programs;

import java.util.Scanner;

public class NumberPatten {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,n;
 		Scanner sc = new Scanner(System.in);
    		System.out.println("Enter the no of lines");
 		n=sc.nextInt();
    		for(i=1;i<=n;i++)
    		{
        		for(j=1;j<=n-i+1;j++)
        		{
            			System.out.print(j);
        		}
 
        		System.out.println("");
    		}
	}



	}


