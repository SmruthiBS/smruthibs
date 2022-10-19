package first.com.xworkz.copy.boot;
import first.com.xworkz.copy.things.Student;

public class StudentRunner {
	public static void main(String[] args) {
		String[] subjectValues= {"physics","chemistry","biology","computer science"};
		int[]imarks= {20,30,40,50};
		int[]emarks= {40,60,80,40};
		String[]projectvalues= {"aiml","dbms","sql","java"};
		String[] skillValues= {"c","c++","java","html"};
		String[] hobbyVlues= {"cooking","reading"};
		
		
Student student=new Student("sunitha",95, 9449498840l,"sunitha@gmail.com","BE",subjectValues,imarks,emarks,projectvalues,skillValues,hobbyVlues );
student.display();

	}

}



