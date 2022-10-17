package first.com.xworkz.copy.things;

public class Tractor {
   public String name;
	public String brand;
	public int price;
	public String colour;
	public int hp;
	public String model;

	public Tractor() {
		System.out.println("default constructor");
	}

	public Tractor(String Name) {
		this.name = Name;
		System.out.println("This Constructer is Printing Name");
	}

	public Tractor(String Name, int Price) {
		this(Name);
		this.price = Price;
		System.out.println("This Constructer is Printing Both Name and Price");
	}

	public Tractor(String Name, int Price, String Brand) {
		this(Name, Price);
		this.brand = Brand;
		System.out.println("This Constructer is Printing Name ,Price and Brand ");
	}

	public Tractor(String Name, int Price, String Brand, int Hp) {
		this(Name, Price, Brand);
		this.hp = Hp;
		System.out.println("This Constructer is Printing Name ,Price , Brand and Hp ");
	}

	public Tractor(String Name, int Price, String Brand, int Hp, String Colour, String Model) {
		this(Name, Price, Brand, Hp, Colour);
		this.model = Model;
		System.out.println("This Constructer is Printing Name ,Price , Brand, Hp, Colour and Model ");
	}

	public Tractor(String Name, int Price, String Brand, int Hp, String Colour) {
		this(Name, Price, Brand, Hp);
		this.colour = Colour;
		System.out.println("This Constructer is Printing Name ,Price , Brand, Hp and Colour ");
	}

}
