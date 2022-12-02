package com.xworkx.interfaces.boot;

import com.xworkx.interfaces.fallowers.PasswordGenerationRule;
import com.xworkx.interfaces.rules.PasswordRule;

public class PasswordGenerationRuleRunner {

	public static void main(String[] args) {
		 PasswordGenerationRule generation= new  PasswordGenerationRule();
generation.containSpcialSymbol();
generation.countainNumber();
generation.length();
generation.noSpace();
generation.strong();
PasswordRule rule =new  PasswordGenerationRule();
rule.containSpcialSymbol();
rule.countainNumber();
rule.length();
rule.noSpace();
rule.strong();
	}

}
