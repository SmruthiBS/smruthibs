package first.com.xworkz.copy.boot;
import first.com.xworkz.copy.things.*;
public class TextileShopRunner {
	public static void main (String[] args) {
		TextileShop shop1=new TextileShop();
		System.out.println(                    );
		TextileShop shop2=new TextileShop("suresh");
		System.out.println(                    );
		TextileShop shop3=new TextileShop(01);
		System.out.println(                    );
		TextileShop shop4=new TextileShop("suresh","sunitha");
		System.out.println(                    );
		TextileShop shop5=new TextileShop("suresh","sunitha",1);
		System.out.println(                    );
		TextileShop shop6=new TextileShop("suresh","sunitha",9449498840l);
		System.out.println(                    );
		TextileShop shop7=new TextileShop("suresh","sunitha","savitha");
		System.out.println(                    );
		TextileShop shop8=new TextileShop("suresh","sunitha","savitha",9449498848l);
		System.out.println(                    );
		TextileShop shop19=new TextileShop("suresh","sunitha","savitha",9449498848l,9449498840l,01);
	}
}
