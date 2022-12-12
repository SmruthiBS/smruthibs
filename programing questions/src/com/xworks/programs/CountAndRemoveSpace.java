package com.xworks.programs;

public class CountAndRemoveSpace {

	public static void main(String[] args){
		String str="hands on learning happens here";
		String s="";
		int count=0;
		for(char ch:str.toCharArray()){//for each loop converts str to char array using str.toCharArray()]
			if(ch==' '){
				count+=1;//short hand for count=count+1 
			}
			else
			{
			s+=ch;//s=s+ch
			}
		}
		System.out.println("number of spaces = "+count);
			System.out.println("String is "+str);//original string
			System.out.println(" modified String is "+s);//string without spaces
			
	}

	}


