package first.com.xworkz.copy.things;

public class Cracker {
	public static String brand;//static block
	public String name;//constructor
	public double price;//method
	public String shopName;//ref
	public String location="banglore";//literal
	
	public Cracker(String name) {
		this.name=name;
	}
public void setPrice(double price) {
	this.price=price;
}
public void show() {
	System.out.println(" cracker brand : " +Cracker.brand);
	System.out.println("cracker name  : "+this.name);
	System.out.println("cracker price : "+this.price);
	System.out.println("shop name = "+this.shopName);
	System.out.println("location : "+this.location);
	
}
static {
	Cracker.brand="ajanta";
}
}
