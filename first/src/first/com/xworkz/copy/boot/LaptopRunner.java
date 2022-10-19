package first.com.xworkz.copy.boot;
import first.com.xworkz.copy.things.*;

public class LaptopRunner {

	public static void main(String[] args) {
		 String[] colours= {"silver","grey","black"};
		 String [] models= {"14dv2014tu","14-dv2053tu","14-dv2016tu"};
		 String[] OSs= {"windows8","windows10","windows11"} ;
		 String features[]= {"fullHD","micro edge display"};
		 String accessories[]= {"keyboard protector","bag","camera cover"};
		 int ratings[]= {4,5,4};
		
		 Laptop laptop= new Laptop("HP","8GB","intel i3",30125,15.6,colours,models,OSs,features,accessories,ratings);
		 laptop.display();
		 
		
		 
		

	}

}
