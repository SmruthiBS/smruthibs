package first.com.xworkz.copy.things;

public class Country {
	public String name;
	public String capital;
	public double area;
	public String president;
	public String PM;
	public String[] states;
	public String[] stateCapitals;
	public String[] foods;
	public String[] rivers;
	public String[] languages;
	public String[] cities;
	
	public Country(String name,String capital,double area,String president,String PM,String[] states,String[] stateCapitals,String[] foods,String[] rivers,String[] languages,String[] cities)
	{
		System.out.println("constructor of country");
		this.name=name;
		this.capital=capital;
		this.area=area;
		this.president=president;
		this.PM=PM;
		this.states=states;
		this.stateCapitals=stateCapitals;
		this.foods=foods;
		this.rivers=rivers;
		this.languages=languages;
		this.cities=cities;
	}
	
	public void display()
	{
		System.out.println(this.name);
		System.out.println(this.capital);
		System.out.println(this.area);
		System.out.println(this.president);
		System.out.println(this.PM);
		System.out.println("states:");
		for (int i = 0; i < states.length; i++) {
			
		System.out.println(states[i]);}
		System.out.println("capitals:");
		for (int i = 0; i < stateCapitals.length; i++) {
		System.out.println(stateCapitals[i]);	
		}
		for (int i = 0; i < foods.length; i++) {
			System.out.println(foods[i]);
		}
		for (int i = 0; i < rivers.length; i++) {
			System.out.println(rivers[i]);	
			}
		for (int i = 0; i < languages.length; i++) {
			System.out.println(languages[i]);	
			}
		for (int i = 0; i < cities.length; i++) {
			System.out.println(cities[i]);	
			}
		}
	}
