package com.xworkz.strings;

public class Programs {
	static String str = "Triple Riding is a Kannada movie released on 25 Nov, 2022. The movie is directed by Mahesh Gowda and featured Aditi Prabhudeva, Rachana Inder, Sadhu Kokila and Rangayana Raghu as lead characters";



	public  void  frequency() {
		int[] freq = new int[str.length()];
		int i, j;

		// Converts given string into character array
		char string[] = str.toCharArray();

		for (i = 0; i < str.length(); i++) {
			//freq[i] = 0;
			for (j = i + 1; j < str.length(); j++) {
				if (string[i] == 'r'||string[i]=='R') {
					freq[i]++;

					// Set string[j] to 0 to avoid printing visited character
					string[j] = '0';
				}
			}
		}
		System.out.println("Characters and their corresponding frequencies");
		for (i = 0; i < freq.length; i++) {
			if (string[i] != ' ' && string[i] != '0')
				System.out.println(string[i] + "-" + freq[i]);
		}
	}
	
	 public String upper=str.toUpperCase();
	 public String lower=str.toLowerCase();
	 public void lower() 
	{
		 int i;
		 String string="Triple Riding is a Kannada movie released on 25 Nov, 2022. The movie is directed by Mahesh Gowda and featured Aditi Prabhudeva, Rachana Inder, Sadhu Kokila and Rangayana Raghu as lead characters";
		 System.out.println("Enter any string which is to be converted to lowercase       "+string);
		 char[] str=string.toCharArray();
		 for(i=0;i<str.length;i++)
 		{
     		if(str[i]>='A' && str[i]<='Z')
     		{ 
     			str[i]=(char)((int)str[i]+32);
     		}
 		}
		 System.out.println("The string in LowerCase is");
			for(i=0;i<str.length;i++)
	    			System.out.print(str[i]);
		 
	}
	 
	 public void upper() {
		 String string="triple riding is a kannada movie released on 25 nov, 2022. the movie is directed by mahesh gowda and featured aditi prabhudeva, rachana inder, sadhu kokila and rangayana raghu as lead characters";
		  System.out.println("Lower case string is : " + string);
		  char strArr[] = string.toCharArray();
          for (int i = 0; i < strArr.length; i++) {
                  // here is the actual logic
                  if (strArr[i] >= 'a' && strArr[i] <= 'z') {
                          strArr[i] = (char) ((int) strArr[i] - 32);
                  }
          }
          System.out.print("Upper case string is : ");
          // print the string array
          for (int i = 0; i < strArr.length; i++) {
                  System.out.print(strArr[i]);
          }
  }
	 public void digit() {
		 System.out.println(str);
		 String numberOnly= str.replaceAll("[^0-9]", "");
		 System.out.println("numbers in the string are "+numberOnly);
	          
	    }  
	 public void reverse() {
		   char ch;
		   String reverse="";
		   System.out.println("Original String: "+str);
		   for (int i=0; i<str.length(); i++)
		      {
		        ch= str.charAt(i); //extracts each character
		        reverse= ch+reverse; //adds each character in front of the existing string
		      }
		      System.out.println("Reversed String: "+ reverse);
		
	 }
	public void array() {
		String string="Triple Riding is a Kannada movie released on 25 Nov, 2022. The movie is directed by Mahesh Gowda and featured Aditi Prabhudeva, Rachana Inder, Sadhu Kokila and Rangayana Raghu as lead characters";
		System.out.println(str);
		char[] coverted=string.toCharArray();
		for(int i=0;i<string.length();i++) {
			System.out.println(coverted[i]);
		}
	}

	public void duplicate() {
		System.out.println("string is "+str);
        int count;  
        char string[] = str.toCharArray(); 
        System.out.println("Duplicate characters in a given string: ");  
        //Counts each character present in the string  
        for(int i = 0; i <string.length; i++) {  
            count = 1;  
            for(int j = i+1; j <string.length; j++) {  
                if(string[i] == string[j] && string[i] != ' ') {  
                    count++;  
                    //Set string[j] to 0 to avoid printing visited character  
                    string[j] = '0';  
                }  
            }  
            //A character is considered as duplicate if count is greater than 1  
            if(count > 1 && string[i] != '0')  
                System.out.print( ","+string[i]);  
        }  
    } 
	public void split() {
	String[] splitted=str.split(" ");
	for(int i=0;i<splitted.length;i++) {
		System.out.println(splitted[i]);}
	String[] split=str.split(",");
	for(int j=0;j<split.length;j++) {
		System.out.println(split[j]);
	}
	}
	

}





	
	
	 
	 

		 
	 







