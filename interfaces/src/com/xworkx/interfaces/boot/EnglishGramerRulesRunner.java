package com.xworkx.interfaces.boot;

import com.xworkx.interfaces.fallowers.EnglishGramerRules;
import com.xworkx.interfaces.rules.GrammerRules;

public class EnglishGramerRulesRunner {

	public static void main(String[] args) {
		EnglishGramerRules grammer= new EnglishGramerRules ();
		grammer.anWithVowel();
		grammer.aWithConsonent();
		grammer.punctuation();
		grammer.spelling();
		grammer.tense();
		GrammerRules rules= new EnglishGramerRules ();
		rules.anWithVowel();
		rules.aWithConsonent();
		rules.punctuation();
		rules.spelling();
		rules.tense();
		

	}

}
