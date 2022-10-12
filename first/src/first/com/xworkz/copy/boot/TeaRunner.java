package first.com.xworkz.copy.boot;

import first.com.xworkz.copy.things.Tea;

public class TeaRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tea tea=new Tea();
		tea.ingredients="tea, ginger, tulsi, cardamom, mulethi & ashwagandha";
		tea.batchNo=4526321l;
		tea.licNo=1234568l;
		tea.servingSize=1;
		tea.toll_free=18001202424l;
		tea.placeOfManuFacture="delhi";
		tea.placeOfPacking="mumbai";
		tea.quality=true;
		tea.weight=1000;
		System.out.println("brand="+tea.brand);
		System.out.println("price="+tea.price);
		System.out.println("type="+tea.type);
		System.out.println("sugar="+tea.sugar);
		System.out.println("quantity="+tea.quantity);
		System.out.println("email="+tea.email);
		System.out.println("mfd="+tea.MFD);
		System.out.println("expdate="+tea.expDate);
		System.out.println("ingridiends="+tea.ingredients);
		System.out.println("batch no="+tea.batchNo);
		System.out.println("serving size="+tea.servingSize);
		System.out.println("toll free="+tea.toll_free);
		System.out.println("lic no="+tea.licNo);
		System.out.println("weight="+tea.weight);
		System.out.println("place of manufacture="+tea.placeOfManuFacture);
		System.out.println("place of packing="+tea.placeOfPacking);
		System.out.println("taste="+tea.taste);
		System.out.println("quality="+tea.quality);

	}

}
