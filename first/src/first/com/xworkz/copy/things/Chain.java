package first.com.xworkz.copy.things;

public class Chain {
	public String type;
	public double price;
	public String material;
	public float length;
	public float weight;
	public boolean stolen;
	public String usedfor;
	public boolean fresh;
	public Chain()
	{
		System.out.println("default constructor");
	}
	public Chain(String type) {
		this.type=type;
		System.out.println("type: "+type);
	}
	public Chain(boolean stolen) {
		this.stolen=stolen;
		System.out.println("stolen: " +stolen);
	}
	public Chain(String type,String material)
	{
		this(type);
		this.material=material;
		System.out.println("material= "+material);
	}
	public Chain(String type,double price) {
		this(type);
		this.price=price;
		System.out.println("price=:"+price);
	}

	public Chain(String type,String material,double price ) {
		this(type,material);
		this.price=price;
		System.out.println("price:"+price);
	}
	public Chain(String type,String material,double price,float weight) {
		this( type, material, price);
		this.weight=weight;
		System.out.println("weight:"+weight);	
	}
	public Chain(String type,String material,double price,float weight,String usedfor) {
		this( type, material, price,weight);
		this.usedfor=usedfor;
		System.out.println("usedfor="+usedfor);
	}
	public Chain(String type,String material,double price,float weight,String usedfor,boolean fresh) {
		this(type, material, price,weight,usedfor);
		this.fresh=fresh;
		System.out.println("fresh:"+fresh);
	}
	
	

}
