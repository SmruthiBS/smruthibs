package first.com.xworkz.copy.things;

public class Bread {
	public String type;
	public String shape;
	public double price;
	public int quantity;
	public String companyName;
	 public Bread() {
		 System.out.println("called default constructor");
	 }
	 public Bread(String type) {
		 this.type=type;
		 System.out.println("type = "+type);
	 }
	 public Bread(double price) {
		 this.price=price;
		 System.out.println("price = "+price);
	 }
	 public Bread(int quantity) {
		 this.quantity=quantity;
		 System.out.println("quantity = "+quantity);
	 }
	 public Bread(String type,double price) {
		 this.type=type;
		 this.price=price;
		 System.out.println("type = "+type);
		 System.out.println("price = "+price);
	 }
	 public Bread(int quantity,double price) {
		 this.quantity=quantity;
		 this.price=price;
		 System.out.println("quantity = "+quantity);
		 System.out.println("price = "+price);
	 }
	 public Bread(int quantity,double price,String companyName) {
		 this.quantity=quantity;
		 this.price=price;
		 this.companyName=companyName;
		 System.out.println("quantity = "+quantity);
		 System.out.println("price = "+price);
		 System.out.println("company name = "+companyName);
	 }
	 public Bread( String type,String shape,int quantity,double price,String companyName) {
		this.type=type;
		this.shape=shape;
		 this.quantity=quantity;
		 this.price=price;
		 this.companyName=companyName;
		 System.out.println("type = "+type);
		 System.out.println("shape="+shape);
		 System.out.println("quantity = "+quantity);
		 System.out.println("price = "+price);
		 System.out.println("company name = "+companyName);
	 }
	 
	 
	 
	 
	 
	 
	 
	 
	 

}
