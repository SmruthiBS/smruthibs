package first.com.xworkz.copy.things;

public class Mango {
	public static String colour;//static block+
	public String type;//constructor
	public double price=150;//lit
	public double quantity;//method
	public boolean fresh;//ref
	public Mango(String type) {
		this.type=type;
		
	}
	public void setQuantity(double quantity) {
		this.quantity=quantity;
		}
	public void display()
	{
		System.out.println(" type : " +this.type);
		System.out.println("colour : "+Mango.colour);
		System.out.println("quantity : "+this.quantity);
		System.out.println("freshness = "+this.fresh);
		System.out.println("price = "+this.price);
	}
static {
	Mango.colour="yellow";
}
}
