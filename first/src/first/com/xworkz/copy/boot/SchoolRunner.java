package first.com.xworkz.copy.boot;
import first.com.xworkz.copy.things.School;

public class SchoolRunner {
	public static void main(String[] args) {
		String[] nameValues= {"sunitha","kavitha"};
		int[] ids={25,56};
		int[]salaries={45000,5000};
		String[]subjectvalues= {"sql","java"};
		String[] commtieValues= {"divya","deepak"};
		int[] classVlues= {1,3};
		
		
School school=new School("sunitha",95, 9449498840l,"sunitha@gmail.com","banglore",nameValues,ids,salaries,subjectvalues, commtieValues,classVlues);
school.display();
	}
}


