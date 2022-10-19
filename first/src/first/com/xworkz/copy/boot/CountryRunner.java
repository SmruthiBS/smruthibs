package first.com.xworkz.copy.boot;

import first.com.xworkz.copy.things.Country;

public class CountryRunner {

	public static void main(String[] args) {
		String[] stateValues= {"karnataka","tamil nadu","goa","kerala"};
		String[] capitals= {"banglore","chennai","ponachi","teruvananthapuram"};
		String[]foodValues= {"dosa","idli","puri","roti"};
		String[] riverVlues= {"ganga","yamuna","kaveri","krishna"};
		String[] languageValues= {"kannada","hindi","tamil","telgu"};
		String[] citiesVlues= {"banglore","pune","mumbai","mysore"};
		
		
Country country=new Country("india","delhi", 3287263,"Droupadi Murmu","Narendra Modi",stateValues,capitals,foodValues,riverVlues,languageValues,citiesVlues);
country.display();

	}

}
