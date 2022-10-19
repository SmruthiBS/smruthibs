package first.com.xworkz.copy.boot;

import first.com.xworkz.copy.things.Amazon;

public class AmazonRunner {
	public static void main(String[] ags) {
		 String[] customerValues= {"sunitha","kavitha","pallavi"};
		 String[] addressValues= {"banglore","mysore","shimoga"};
		String[] paymentValues= {"COD","card","UPI"} ;
		 String[] colourVlues= {"red","green","blue"};
		String[] brandVlues= {"h&m,","safari","pink"};
		int[]quantity= {2,4,6};
		Amazon product=new Amazon("top",12,123,"clothing",200,customerValues,addressValues,paymentValues,colourVlues,brandVlues,quantity);
		product.display();
	}

}
