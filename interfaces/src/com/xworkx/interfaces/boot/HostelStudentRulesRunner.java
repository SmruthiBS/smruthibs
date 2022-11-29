package com.xworkx.interfaces.boot;

import com.xworkx.interfaces.fallowers.HostelStudentRules;
import com.xworkx.interfaces.rules.HostelRules;

public class HostelStudentRulesRunner {

	public static void main(String[] args) {
		HostelStudentRules rules= new HostelStudentRules();
		rules.closingTime(11);
		rules.noVisitors();
		rules.noChangerooms();
		rules.noOutingWithodPermession();
		rules.noPhone();
		
		HostelRules hostel=new HostelStudentRules();
		hostel.closingTime(10);
		hostel.noVisitors();
		hostel.noChangerooms();
		hostel.noOutingWithodPermession();
		hostel.noPhone();

	}

}
