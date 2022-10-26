package first.com.xworkz.copy.boot;

import first.com.xworkz.copy.things.Milk;

public class MilkRunner {
	public static void main(String[] args) {
		Milk milk=new Milk(25);
		milk.thick=true;
		milk.setQuantity(10.00);
		milk.display();
	}

}
