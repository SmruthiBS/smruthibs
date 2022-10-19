package first.com.xworkz.copy.things;

public class School {
	public String name;
	public int no_students;
	public long phone;;
	public String email;
	public String city;
	public String[] teachers;
	public int[] employee_id;
	public int[] salary;
	public String[] subjects;
	public String[] commetie;
	public int[] classes ;
	
	
 public School(String name,int no_students,long phone,String email,String city,String[] teachers,int[] employee_id, int[] salary,String[]subjects,String[] commetie,int[]classes)
	{
		System.out.println("constructor of school");
		this.name=name;
		this.no_students=no_students;
		this.phone=phone;
		this.email=email;
		this.city=city;
		this.teachers= teachers;
		this.employee_id=employee_id;
		this.salary=salary;
		this.subjects=subjects;
		this.commetie=commetie;
		this.classes=classes;
	}
	
	public void display()
	{
		System.out.println(this.name);
		System.out.println(this.no_students);
		System.out.println(this.phone);
		System.out.println(this.email);
		System.out.println(this.city);
		for (int i = 0; i < teachers.length; i++) {
			
		System.out.println(teachers[i]);}
		
		for (int i = 0; i < employee_id.length; i++) {
		System.out.println(employee_id[i]);	
		}
		for (int i = 0; i <salary.length; i++) {
			System.out.println(salary[i]);
		}
		for (int i = 0; i <subjects.length; i++) {
			System.out.println(subjects[i]);	
			}
		for (int i = 0; i <commetie.length; i++) {
			System.out.println(commetie[i]);	
			}
		for (int i = 0; i < classes.length; i++) {
			System.out.println(classes[i]);	
			}
		}

}
