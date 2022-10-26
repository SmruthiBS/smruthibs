package first.com.xworkz.copy.boot;

import first.com.xworkz.copy.things.Cracker;

public class CrackerRunner {

	public static void main(String[] args) {
		Cracker cracker=new Cracker("rocket");
		cracker.setPrice(250);
		cracker.shopName="RR crackers";
		cracker.show();

	}

}
