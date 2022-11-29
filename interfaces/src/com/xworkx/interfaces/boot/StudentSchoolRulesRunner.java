package com.xworkx.interfaces.boot;

import com.xworkx.interfaces.fallowers.StudentSchoolRules;
import com.xworkx.interfaces.rules.SchoolRules;

public class StudentSchoolRulesRunner {

	public static void main(String[] args) {
	StudentSchoolRules rules=new StudentSchoolRules(); 
	rules.assembly(9);
	rules.uniform();
	rules.attendclass();
	rules.ontime();
	rules.idcard();
	SchoolRules school= new StudentSchoolRules(); 
	school.assembly(8);
	school.uniform();
	school.attendclass();
	school.ontime();
	school.idcard();
	
	

	}

}
