package com.xworkx.interfaces.boot;

import com.xworkx.interfaces.fallowers.OfficerArmyRules;
import com.xworkx.interfaces.rules.ArmyRules;

public class OfficerArmyRulesRunner {

	public static void main(String[] args) {
		OfficerArmyRules officer=new OfficerArmyRules();
		officer.brave();
		officer.citizen();
		officer.fit();
		officer.training();
		officer.wakeupEarly();
		ArmyRules rules= new OfficerArmyRules();
		rules.brave();
		rules.citizen();
		rules.fit();
		rules.training();
		rules.wakeupEarly();

	}

}
