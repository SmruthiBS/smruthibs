package first.com.xworkz.copy.boot;

import first.com.xworkz.copy.things.Cloth;

public class ClothRunner {
public static void main(String[] args) {
		
		int[] discount= {20};
		int[] quantity= {3};
		String[] gender={"Female","male"};
		String[] shopName={"Trends","Max"};
		String[] location={"Shimoga","Banglure"};
		
		
		Cloth cloths=new Cloth("cotton",500d,"Avasa","white", 32, "Kurthi",discount,quantity,gender,shopName,location);
		cloths.display();

	}

}


