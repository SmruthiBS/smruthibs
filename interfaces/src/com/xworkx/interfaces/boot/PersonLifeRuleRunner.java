package com.xworkx.interfaces.boot;

import com.xworkx.interfaces.fallowers.PersonLifeRule;
import com.xworkx.interfaces.rules.LifeRules;

public class PersonLifeRuleRunner {

	public static void main(String[] args) {
		PersonLifeRule life= new PersonLifeRule ();
		life.BeHonest();
		life.bePositive();
		life.DoNotCompare();
		life.letItGo();
		life.StayCalm();
		LifeRules rules= new PersonLifeRule ();
		rules.BeHonest();
		rules.bePositive();
		rules.DoNotCompare();
		rules.StayCalm();
		rules.letItGo();

	}

}
