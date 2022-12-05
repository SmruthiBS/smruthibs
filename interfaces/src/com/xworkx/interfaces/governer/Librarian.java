package com.xworkx.interfaces.governer;

import com.xworkx.interfaces.fallowers.Readers;
import com.xworkx.interfaces.rules.LibraryRule;

public class Librarian {
	private LibraryRule libraryrule=new Readers();

	public Librarian(LibraryRule libraryrule) {
		super();
		this.libraryrule = libraryrule;
	}
	public void ruleCheck() {
		if (this.libraryrule!=null){
			boolean phone=this.libraryrule.nophone();
		boolean book=this.libraryrule.returnbook();
		boolean sign=this.libraryrule.sign();
		boolean smoke=this.libraryrule.smoking();
		boolean silence=this.libraryrule.silence();
		if(phone==true&& book==true&& sign==true&&smoke==false &&silence==true) {
			System.out.println("all rules are fallowed");
		}
		else
		{
			System.out.println("all rules are not fallowed");
		}
		
	}

}
}
