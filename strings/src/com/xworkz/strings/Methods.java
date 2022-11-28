package com.xworkz.strings;

public class Methods {
	public static void main(String[] args) {
		String string1="smruthi b s";
		String string2=new String("xworkz");
		String string3="xworkz";
		
		
		int length=string1.length();//used to find length of the string
		System.out.println("length of the string is "+length);
		
		
		 char value=string1.charAt(8);//Returns the char value at the specified index.
		 System.out.println("value at given index is "+value);
		 
		 
		System.out.println(string1.compareTo(string2));//Compares two strings lexicographically.
		System.out.println(string2.compareTo(string3));
		
		
		System.out.println(string1.compareToIgnoreCase(string3));//Compares two strings lexicographically, ignoring case differences.
		
		 char[] characters=string1.toCharArray();//Converts this string to a new character array.
		 for( int index=0;index<characters.length;index++)
		System.out.println(characters[index]);
		 
		 
		 String lower=string1.toLowerCase();//Converts all of the characters in this String to lower case using the rules of the default locale.
		 System.out.println(lower);
		 
		 
		 String upper=string2.toUpperCase();//Converts all of the characters in this String to upper case using the rules of the default locale.
		 System.out.println(upper);
		 
		 
		 String string=string1.toString();
		 System.out.println(string);//This object (which is already a string!) is itself returned.
		 
		 String bvalue=String.valueOf(true);//Returns the string representation of the boolean argument.
		 System.out.println(bvalue);
		 
		 
		 String cvalue=String.valueOf('c');//Returns the string representation of the char argument.
		 System.out.println(cvalue);
		 
		 
		 String chararrayValue=String.valueOf(characters);
		 System.out.println(chararrayValue);
		 
		 
		String modedifedString =string1.replace('b', 'h');//Returns a string resulting from replacing all occurrences of oldChar in this string with newChar
		System.out.println(modedifedString);
		
		
		int index1=string3.indexOf('z');//Returns the index within this string of the first occurrence of the specified character.
		System.out.println(index1);
		
		
		int index2=string1.indexOf("thi");//Returns the index within this string of the first occurrence of the specified substring, starting at the specified index.
		System.out.println(index2);
		
		
		boolean empty=string1.isEmpty();//Returns true if, and only if, length() is 0.
		System.out.println(empty);
		
		
		int last=string1.lastIndexOf('s');//Returns the index within this string of the last occurrence of the specified character.
		System.out.println(last);
		
		
		int last1=string2.lastIndexOf("work");//Returns the index within this string of the last occurrence of the specified substring.
		System.out.println(last1);
		
		
		int hascode=string3.hashCode();//Returns a hash code for this string.
		System.out.println(hascode);
		
		
		 int num=string1.codePointAt(2);//Returns the character (Unicode code point) at the specified index.
		 System.out.println(num);
		
		 
		 int before=string2.codePointBefore(4);//Returns the character (Unicode code point) before the specified index.
		 System.out.println(before);
		 
		 String newString=string1.concat(" suresh");//Concatenates the specified string to the end of this string.
		 System.out.println(newString);
		
		 boolean contain=string2.contains("work");//Returns true if and only if this string contains the specified sequence of char values.
		 System.out.println(contain);
		 
		 String doublevalue=String.valueOf(100);//Returns the string representation of the double argument.
		 System.out.println(doublevalue);
		 
		 String substring=string2.substring(3);//Returns a string that is a substring of this string.
		 System.out.println(substring);
		
		 String substring1=string2.substring(0,4);//eturns a string that is a substring of this string.
		 System.out.println(substring1);
	
	}
	
	
	

 

 
 
	

}
