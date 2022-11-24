package com.xworks.programs;

public class Nested {
	public static void main(String[] args) {
		
	
		// TODO Auto-generated method stub
		

	}
public class Child{
	
		
	public int value;
	public void display( int num) {
		num=value;
		System.out.println(num);
		Child child=new Child();
		child.display(10);
	
	}


}
}
