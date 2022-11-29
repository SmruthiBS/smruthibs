package com.xworkx.interfaces.fallowers;

import com.xworkx.interfaces.rules.GrammerRules;

public class EnglishGramerRules implements GrammerRules{

	@Override
	public boolean spelling() {
		System.out.println("running method spelling");
		return false;
	}

	@Override
	public boolean aWithConsonent() {
		System.out.println("running method  aWithConsonent");
		return false;
	}

	@Override
	public boolean anWithVowel() {
		System.out.println("running method  anWithVowel");
		return false;
	}

	@Override
	public boolean tense() {
		System.out.println("running method tense");
		return false;
	}

	@Override
	public boolean punctuation() {
		System.out.println("running method punchuation");
		return false;
	}


}
