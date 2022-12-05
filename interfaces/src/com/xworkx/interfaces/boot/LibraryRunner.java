package com.xworkx.interfaces.boot;

import com.xworkx.interfaces.fallowers.Readers;
import com.xworkx.interfaces.governer.Librarian;
import com.xworkx.interfaces.rules.LibraryRule;

public class LibraryRunner {
	public static void main(String[] args) {
	LibraryRule rule=new Readers();
	Librarian  librarian=new Librarian(rule);
	librarian.ruleCheck();


}
}

