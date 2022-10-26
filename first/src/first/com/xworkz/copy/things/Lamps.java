package first.com.xworkz.copy.things;

public class Lamps {
	public  static String brand;//static block
	public String colour="jute";//lit
	public double price;//constructor
	public String style;//ref
	public String material;//method

public Lamps(double price){
this.price=price;	
}

public void setMaterial(String material)
{
	this.material=material;
}
public void show()
{
	System.out.println("  brand : " +Lamps.brand);
	System.out.println("style : "+this.style);
	System.out.println(" colour : "+this.colour);
	System.out.println(" material = "+this.material);
	System.out.println("price = "+this.price);
}
static {
Lamps.brand="F N";
}
}
