package first.com.xworkz.copy.things;

public class Passport {
	public String no;
	public String name;
	public String expiryDate;
	public String country;
	public String issueDate;
	public int noOfLeafs;
	
	
	 public Passport() {
	System.out.println("calling default constructor");	 
	 }
	 public Passport(String name) {
		 this.name=name;
		 System.out.println("name : "+name);
	 }
	 public Passport(int noOfLeafs) {
		 this.noOfLeafs=noOfLeafs;
		 System.out.println("no of leafs : "+noOfLeafs);
	 }
	 public Passport(String name,int noOfLeafs) {
		 this.name=name;
		 this.noOfLeafs=noOfLeafs;
		 System.out.println("name : "+name);
		 System.out.println("no of leafs : "+noOfLeafs);
	 }
	 public Passport(int noOfLeafs,String Country) {
		 this.noOfLeafs=noOfLeafs;
		 this.country=country;
		 System.out.println("name : "+name);
		 System.out.println("no of leafs : "+noOfLeafs);
	 }
	 public Passport(int noOfLeafs,String Country,String no) {
		 this.noOfLeafs=noOfLeafs;
		 this.country=country;
		 this.no=no;
		 System.out.println("name : "+name);
		 System.out.println("no of leafs : "+noOfLeafs);
		 System.out.println("number="+no);
	 }
	 public Passport(String Country,String no,int noOfLeafs ) {
		 this.noOfLeafs=noOfLeafs;
		 this.country=country;
		 this.no=no;
		 System.out.println("name : "+name);
		 System.out.println("no of leafs : "+noOfLeafs);
		 System.out.println("number="+no);
	 }
	 public Passport(String Country,String no,int noOfLeafs,String issueDate  ) {
		 this.noOfLeafs=noOfLeafs;
		 this.country=country;
		 this.no=no;
		 this.issueDate=issueDate;
		 System.out.println("name : "+name);
		 System.out.println("no of leafs : "+noOfLeafs);
		 System.out.println("number="+no);
		 System.out.println("issued date="+issueDate);
	 }
	 
	 
	 
	 
	 
	 
	

}
