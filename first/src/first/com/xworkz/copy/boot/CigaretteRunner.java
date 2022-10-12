package first.com.xworkz.copy.boot;
import first.com.xworkz.copy.things.*;

public class CigaretteRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cigarette cigarette=new Cigarette();
		
cigarette.nicotineContent=1.1;
cigarette.batchNo=452145;
cigarette.packageColour="silver";
cigarette.toll_free=1800452l;
cigarette.licNo=12457785l;
cigarette.weight=0.65;
cigarette.placeOfManuFacture="Switzerland";
cigarette.placeOfPacking="Switzerland";
cigarette.addressOfmanufacture="Bristol,Switzerland";
System.out.println(cigarette.brand);
System.out.println(cigarette.Company);
System.out.println(cigarette.companyCEO);
System.out.println(cigarette.companyHQ);
System.out.println(cigarette.companyStarted);
System.out.println(cigarette.county);
System.out.println(cigarette.nicotineContent);
System.out.println(cigarette.MFD);
System.out.println(cigarette.toll_free);
System.out.println(cigarette.licNo);
System.out.println(cigarette.batchNo);
System.out.println(cigarette.weight);
System.out.println(cigarette.warningMessage);
System.out.println(cigarette.placeOfPacking);
System.out.println(cigarette.placeOfManuFacture);
System.out.println(cigarette.price);
System.out.println(cigarette.packageColour);
System.out.println(cigarette.addressOfmanufacture);


	}

}
