package first.com.xworkz.copy.things;

import first.com.xworkz.copy.constant.MilkType;

public class Milk {
	public static String brand;//static block
	public MilkType type=MilkType.COW_MILK;//
	public double price;//constructor
	public double quantity;//method
	public Boolean thick;
	
	public Milk(double price) {
		this.price=price;
	}
	
	public  void setQuantity(double quantity)
	{
		this.quantity=quantity;
	}
	public void display() {
		System.out.println("milk brand : " +Milk.brand);
		System.out.println("milk type : "+this.type);
		System.out.println("milk thickness : "+this.thick);
		System.out.println("quantity = "+this.quantity);
		System.out.println("price = "+this.price);
	}
static {
	Milk.brand="nandini";
      }
}
