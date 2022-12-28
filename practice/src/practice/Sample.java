package practice;

import java.util.Scanner;

public class Sample {
	public static void main(String[] args) {
		String str="moonsoon";
		String rev="  ";
		for(int i=str.length()-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		System.out.println(rev);
		}
}