package first.com.xworkz.copy.things;

public class Boat {
	public String name;
	public String color;
	public String companyName;
	public String type;
	public String owner;

	public Boat() {
		System.out.println("boad called using default constructor");
	}

	public Boat(String name) {
		this.name = name;
		System.out.println("name:" + name);
	}

	public Boat(String name, String companyNme) {
		this.name = name;
		this.companyName = companyNme;
		System.out.println("name:"+name);
		System.out.println("company name:" + companyName);

	}
	public Boat(String name,String companyName,String owner) {
		this.name=name;
		this.companyName=companyName;
		this.owner=owner;
		System.out.println("name:"+name);
		System.out.println("company name:" + companyName);
		
		
		}
	public Boat(String name,String color,String companyName,String owner)
	{
	this.name=name;
	this.color=color;
	this.companyName=companyName;
	this.owner=owner;
	System.out.println("name:"+ name);
	System.out.println("color:" + color);
	System.out.println("company name:" + companyName);
	System.out.println("owner=" + owner);
	
	}

	public Boat(String name, String color, String companyName, String type, String owner) {
		this.name = name;
		this.color = color;
		this.companyName = companyName;
		this.type = type;
		this.owner = owner;
		System.out.println("name:"+ name);
		System.out.println("color:" + color);
		System.out.println("company name:" + companyName);
		System.out.println("type=" + type);
		System.out.println("owner=" + owner);
	}

}
