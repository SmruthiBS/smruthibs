package first.com.xworkz.copy.boot;

import first.com.xworkz.copy.things.Dustbin;

public class DustbinRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dustbin bin=new Dustbin();
		bin.automatic=false;
		bin.diameter=10;
		bin.full=false;
		bin.height=15;
		bin.mechanism="pedal";
		bin.quantity=2;
		bin.shape="cylinderical";
		bin.wasteType="dry";
		bin.width=15;
		System.out.println(bin.automatic);
		System.out.println(bin.brand);
		System.out.println(bin.capacity);
		System.out.println(bin.colour);
		System.out.println(bin.diameter);
		System.out.println(bin.full);
		System.out.println(bin.height);
		System.out.println(bin.material);
		System.out.println(bin.mechanism);
		System.out.println(bin.pedal);
		System.out.println(bin.price);
		System.out.println(bin.quality);
		System.out.println(bin.quantity);
		System.out.println(bin.sensor);
		System.out.println(bin.shape);
		System.out.println(bin.wasteType);
		System.out.println(bin.weight);
		System.out.println(bin.width);
		

	}

}
