package first.com.xworkz.copy.boot;

import first.com.xworkz.copy.things.Bank;
public class BankRunner {
	public static void main(String[] args) {
		String[] nameValues= {"sunitha","kavitha"};
		int[] ids={25,56};
		int[]salaries={45000,5000};
		String[]projectvalues= {"sql","java"};
		String[] desgnationValues= {"HR","manager"};
		int[] tnoVlues= {1,3};
		
		
Bank bank=new Bank("SBI",95, 9449498840l,"onlinesbi@gmail.com","banglore",nameValues,ids,salaries,projectvalues,desgnationValues,tnoVlues );
bank.display();

}
}
