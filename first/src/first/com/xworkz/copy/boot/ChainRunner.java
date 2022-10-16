package first.com.xworkz.copy.boot;

import first.com.xworkz.copy.things.Chain;

public class ChainRunner {
	public static void main (String[] args) {
		Chain chain1=new Chain();
		System.out.println(                    );
		Chain chain2=new Chain("french rop");
		System.out.println(                    );
		Chain chain3=new Chain(true);
		System.out.println(                    );
		Chain chain4=new Chain("french rop",370);
		System.out.println(                    );
		Chain chain5=new Chain("french rop","silver");
		System.out.println(                    );
		Chain chain6=new Chain("french rop","silver",370);
		System.out.println(                    );
		Chain chain7=new Chain("french rop","silver",370);
		System.out.println(                    );
		Chain chain8=new Chain("french rop","silver",370,45.5f,"jewellary");
		System.out.println(                    );
		Chain chain9=new Chain("french rop","silver",370,45.5f,"jewellary",true);
		
	}

}
