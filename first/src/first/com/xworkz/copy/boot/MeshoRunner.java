package first.com.xworkz.copy.boot;

import first.com.xworkz.copy.things.Mesho;

public class MeshoRunner {
	public static void main(String[] args) {

		String[] customers = { "Lalitha", "kavitha", "Rakshitha" };
		String[] address = { "banglore", "mysore", "shimoga" };
		String[] payment = { "COD", "card", "UPI" };
		String[] colours = { "White", "Black", "blue" };
		String[] brand = { "DNMX,", "Lee", "RoadStar" };
		int[] quantity = { 8, 4, 6 };
		Mesho mesho = new Mesho("jeans", 12, 123, "clothing", 200, customers, address, payment, colours, brand,
				quantity);
		mesho.display();

	}


}
