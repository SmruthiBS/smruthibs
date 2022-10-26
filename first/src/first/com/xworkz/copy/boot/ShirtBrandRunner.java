package first.com.xworkz.copy.boot;

import first.com.xworkz.copy.constant.ShirtSize;
import first.com.xworkz.copy.things.ShirtBrand;

public class ShirtBrandRunner {
	public static void main(String[] args) {
		ShirtBrand shirt=new ShirtBrand("white");
		shirt.size=ShirtSize.LARGE;
		shirt.setMaterial("cotton");
		shirt.show();
		
	}

}
