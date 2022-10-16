package first.com.xworkz.copy.things;

public class TextileShop {
	public String ownerName;
	public String ownerWifeName;
	public String ownerDaughterName;
	public long  ownerDaughterNumber;
	public int noOfWifes;
	public int shopNo;
	public long contact;
	
	
	public TextileShop() {
		System.out.println("default constructor");
	}
	
public TextileShop(String ownerName) {
	this.ownerName=ownerName;
	System.out.println("owner: "+ownerName);
}
public TextileShop(int shopNo) {
	this.shopNo=shopNo;
	System.out.println("shop no: "+shopNo);
	
}
public TextileShop(String ownerName,String ownerWifeName ) {
	this(ownerName);
	this.ownerWifeName=ownerWifeName;
	System.out.println("owner's wife: "+ownerWifeName);
	}
public TextileShop(String ownerName,String ownerWifeName,String ownerDaughterName ) {
	this( ownerName, ownerWifeName);
	this.ownerDaughterName=ownerDaughterName;
	System.out.println("owner's daughter: "+ownerDaughterName);
	}
public TextileShop(String ownerName,String ownerWifeName,int noOfWifes ){
	this( ownerName, ownerWifeName);
	this.noOfWifes=noOfWifes;
	System.out.println("no of wives: "+noOfWifes);
}
public TextileShop(String ownerName,String ownerWifeName,long contact ) {
	this(ownerName,ownerWifeName);
	this.contact=contact;
	System.out.println("contact:"+contact);
}
public TextileShop(String ownerName,String ownerWifeName,String ownerDaughterName,long ownerDaughterNumber) {
	this( ownerName, ownerWifeName, ownerDaughterName );
	this.ownerDaughterNumber=ownerDaughterNumber;
	System.out.println("owner's daughter number: "+ownerDaughterNumber);
}
public TextileShop(String ownerName,String ownerWifeName,String ownerDaughterName,long ownerDaughterNumber,long contact,int shopNo) {
	this( ownerName,ownerWifeName, ownerDaughterName, ownerDaughterNumber);
	this.contact=contact;
	this.shopNo=shopNo;
	System.out.println("contact:"+contact);
	System.out.println("shop no: "+shopNo);
	
}


	
	


}
