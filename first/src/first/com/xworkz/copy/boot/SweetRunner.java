package first.com.xworkz.copy.boot;

import first.com.xworkz.copy.things.Sweet;

public class SweetRunner {
	public static void main(String[] args){
		Sweet sweet=new Sweet("jalebi");
		sweet.shopLocation="banglore";
		sweet.setPrice(105.00);
		sweet.display();
	}

}
