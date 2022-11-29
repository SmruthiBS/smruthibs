package com.xworkx.interfaces.rules;

public interface PasswordRule {
	int length();
	boolean strong();
	boolean countainNumber();
	boolean containSpcialSymbol();
	boolean noSpace();
	

}
