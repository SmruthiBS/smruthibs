package first.com.xworkz.copy.things;

public class Sweet {
	public static String brand;//static block
	public String name;//constructor
	public String shopLocation;//reference
	public double price;//method
	public double quantity=100;//literal
	public Sweet (String name)
	{
		this.name=name;
	}
	public void setPrice(double price)
	{
		this.price=price;
	}
	public void display()
	{
		System.out.println("sweeet brand : " +Sweet.brand);
		System.out.println("sweet name : "+this.name);
		System.out.println("shop location : "+this.shopLocation);
		System.out.println("quantity = "+this.quantity);
		System.out.println("price = "+this.price);
	}
	
	
	static {
		Sweet.brand="haldirams";
	}

}
