package com.xworks.programs;

public class AlphabetPattren {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String string="abc";
for( int i=0;i<string.length();i++) {
	for(int j=0;j<=i;j++) {
		if(j==0) {
			System.out.println(string.toUpperCase().charAt(i));
		}
		else {
			System.out.println(string.toLowerCase().charAt(i));
		}
			
	}

	}

}
}
