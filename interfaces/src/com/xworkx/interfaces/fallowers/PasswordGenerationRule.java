package com.xworkx.interfaces.fallowers;

import com.xworkx.interfaces.rules.PasswordRule;

public class PasswordGenerationRule implements PasswordRule {

	@Override
	public int length() {
	System.out.println("length of password mush be greater then 8");
		return 0;
	}

	@Override
	public boolean strong() {
		System.out.println("running method strong");
		return false;
	}

	@Override
	public boolean countainNumber() {
		System.out.println("running method strong");
		return false;
	}

	@Override
	public boolean containSpcialSymbol() {
		System.out.println("running method symbol");
		return false;
	}

	@Override
	public boolean noSpace() {
		System.out.println("running method nospace");
		return false;
	}

}
