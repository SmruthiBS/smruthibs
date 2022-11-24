package com.xworks.programs;

public class pattren {

	public static void main(String[] args) {
		String s="abc";
		  StringBuilder stBuild = new StringBuilder();
	        for(int i = 0; i < s.length(); i++){
	            for(int j = 0; j <= i; j++) {
	                if (j==0){
	                    stBuild.append(s.toUpperCase().charAt(i));
	                }
	                else {
	                    stBuild.append(s.toLowerCase().charAt(i));
	                }
	            }
	            stBuild.append('-');
	        }
	        stBuild.delete(stBuild.length()-1,stBuild.length());
	        System.out.println(stBuild.toString());
	    }
		// TODO Auto-generated method stub

	}


