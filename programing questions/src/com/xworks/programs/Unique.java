package com.xworks.programs;

public class Unique {

	
		 boolean uniqueCharacters(String str)
		    {
		        // If at any time we encounter 2 same
		        // characters, return false
		        for (int i = 0; i < str.length(); i++)
		            for (int j = i + 1; j < str.length(); j++)
		                if (str.charAt(i) == str.charAt(j))
		                    return false;
		 
		        // If no duplicate characters encountered,
		        // return true
		        return true;
		    }
		 public static void main(String[] args) {
			Unique unique=new Unique();
			String string="smruthi";
			System.out.println("String is "+string);
			if(unique.uniqueCharacters(string))
				System.out.println("String is unique ");
			else
				System.out.println("String is not unique");
		}
}
