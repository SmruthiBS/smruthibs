package com.xworks.programs;

public class diffrence {
	public static void main(String[] args) {
		int x=10,y=5,borrow;
		while(y!=0) {
		borrow=(~x)&y;
		x=x^y;
		y=borrow<<1;}
		
		System.out.println("diffrence="+ x);
		}
}
// convert x and y to binary
//perform ~x & y store in variable borrow
//perform x xor y and store in x
//apply left shift 1 to borrow and store in y
//repeat till y=0
//return y as diffrence