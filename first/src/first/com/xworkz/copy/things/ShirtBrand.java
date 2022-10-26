package first.com.xworkz.copy.things;

import first.com.xworkz.copy.constant.ShirtSize;

public class ShirtBrand {
	public static String brand;//static block
	public double price=500;//literal
	public ShirtSize size;//ref
	public String colour;//constructor
	public String material;//method
	 public ShirtBrand(String colour) {
		 this.colour=colour;
		 
	 }
	 public void setMaterial(String material) {
		 this.material=material;
	 }
	public void show()
	{
		System.out.println(" shirt brand : " +ShirtBrand.brand);
		System.out.println("shirt size : "+this.size);
		System.out.println("shirt colour : "+this.colour);
		System.out.println("shirt material = "+this.material);
		System.out.println("price = "+this.price);
	}
	static {
		ShirtBrand.brand="H&M";
	}
	

}
