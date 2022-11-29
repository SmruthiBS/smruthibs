package com.xworkx.interfaces.boot;

import com.xworkx.interfaces.fallowers.PlayerCricketRules;
import com.xworkx.interfaces.rules.CircketRules;

public class PlayerCricketRulesRunner {
	public static void main(String[] args) {
		PlayerCricketRules rules = new PlayerCricketRules();
rules.ofplayers();
	rules.noball();
	CircketRules cricket=new PlayerCricketRules();
	cricket.ofplayers();
	cricket.noball();
	
	
		
	}

}
