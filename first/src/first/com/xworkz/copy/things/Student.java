package first.com.xworkz.copy.things;

public class Student {
	
		public String name;
		public int regNo;
		public long phone;;
		public String email;
		public String course;
		public String[] subjects;
		public int[] internal_marks;
		public int[] external_marks;
		public String[] projects;
		public String[] skills;
		public String[] hobies;
		
		
		public Student(String name,int regno,long phone,String email,String course,String[] subjects,int[] internal_marks, int[] external_marks,String[] projects
		 ,String[] skills,String[]hobies)
		{
			System.out.println("constructor of student");
			this.name=name;
			this.regNo=regNo;
			this.phone=phone;
			this.email=email;
			this.course=course;
			this.subjects= subjects;
			this.internal_marks=external_marks;
			this.external_marks=internal_marks;
			this.projects=projects;
			this.skills=skills;
			this.hobies=hobies;
		}
		
		public void display()
		{
			System.out.println(this.name);
			System.out.println(this.regNo);
			System.out.println(this.phone);
			System.out.println(this.email);
			System.out.println(this.course);
			for (int i = 0; i < subjects.length; i++) {
				
			System.out.println(subjects[i]);}
			
			for (int i = 0; i < internal_marks.length; i++) {
			System.out.println(internal_marks[i]);	
			}
			for (int i = 0; i < external_marks.length; i++) {
				System.out.println(external_marks[i]);
			}
			for (int i = 0; i < projects.length; i++) {
				System.out.println(projects[i]);	
				}
			for (int i = 0; i <skills .length; i++) {
				System.out.println(skills[i]);	
				}
			for (int i = 0; i < hobies.length; i++) {
				System.out.println(hobies[i]);	
				}
			}
		}


