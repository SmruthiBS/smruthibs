package com.xworks.programs;

import java.util.Scanner;

public class Power {

	public static void main(String[] args) {
		int start, end,temp,count=0,num,rem,sum=0;
		Scanner scan = new Scanner(System.in);
		System.out.println("enter starting point ");
		start = scan.nextInt();
		System.out.println("enter ending point");
		end = scan.nextInt();
		for(int index=start;index<=end;index++) {
		//	System.out.println("numbers "+index);
		temp=index;	
	//	System.out.println("temp "+temp);
		for(;temp!=0;temp=temp/10) {
			count++;
		}
		num=temp;
		for(;num>0;num=num/10) {
			rem=num%10;
			sum+=(int)Math.pow(rem, count);
			count--;
			
			
		}
		if(num==sum) {
			System.out.println(num+ " ");
		}
		
		}

	}

}
