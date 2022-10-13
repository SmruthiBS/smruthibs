package first.com.xworkz.copy.things;

public class Fish {
	public String name;
	public String type;
	public double price;
	public float weight;
	public float length;

	public Fish() {
		System.out.println("fish created using default constructor");
	}

	public Fish(String name) {
		this.name = name;
		System.out.println("name:"+name);
	}
	public Fish(String name,String type) {
		this.name=name;
		this.type=type;
		System.out.println("name:"+name);
		System.out.println("type:"+type);
		
	}
	public Fish(String name,double price) {
		this.name=name;
		this.price=price;
		System.out.println("name:"+name);
		System.out.println("price:"+price);
		
	}
	public Fish(String name,float weight) {
		this.name=name;
		this.weight=weight;
		System.out.println("name:"+name);
		System.out.println("price:"+price);	
	}
	public Fish(double price,String name) {
		this.price=price;
		this.name=name;
		System.out.println("name:"+name);
		System.out.println("price:"+price);
		
	}
	public Fish(String name,String type,double price ) {
		this.name=name;
		this.type=type;
		this.price=price;
		System.out.println("name:"+name);
		System.out.println("price:"+price);
		System.out.println("type:"+type);
	
	}


public Fish(String name,String type,double price,float weight,float length){
	this.name=name;
	this.type=type;
	this.price=price;
	this.weight=weight;
	this.length=length;
	System.out.println("name:"+name);
	System.out.println("type:"+type);
	System.out.println("price:"+price);
	System.out.println("length:"+length);
	System.out.println("weight:"+weight);
	
	
}
	
}
