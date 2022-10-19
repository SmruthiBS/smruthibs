package first.com.xworkz.copy.boot;


import first.com.xworkz.copy.things.Market;

public class MarketRunner {
	public static void main(String[] args) {
		String[] shopValues= {"sunitha","kavitha"};
		int[] nos={25,56};
		int[]rents={45000,5000};
		String[]salesvalues= {"50% off","buy 1 get 1 free"};
		String[] adressValues= {"HR","manager"};
		int[] tnoValues= {1,3};
		
		
Market market=new Market("sunitha",95, 9449498840l,"sunitha@gmail.com","banglore",shopValues,nos,rents,salesvalues,adressValues,tnoValues );
market.display();
	}


}
