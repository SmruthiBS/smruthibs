package first.com.xworkz.copy.boot;

import first.com.xworkz.copy.things.Mango;

public class MangoRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mango mango=new Mango("totapuri");
		mango.fresh=true;
		mango.setQuantity(20);
		mango.display();

		
	}

}
