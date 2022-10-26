package first.com.xworkz.copy.things;

public class Salon {
	public String name;
	public String location;
	public int shopNo=10;
	public long number;
	public double rating=3.5;
	public Salon(String location) {
		this.location=location;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public void display() {
		System.out.println("  name : " +this.name);
		System.out.println("location : "+this.location);
		System.out.println(" shop number: "+this.shopNo);
		System.out.println(" number = "+this.number);
		System.out.println("rating = "+this.rating);
	}

}
