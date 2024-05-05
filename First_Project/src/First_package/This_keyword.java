package First_package;

public class This_keyword 
{
	int age;
	String name;
	double salary;
	void student_detail(int age, String name, double salary)
	{
		this.age =age;
		this.name = name;
		this.salary = salary;
		//System.out.println("Name of student" + name + "Age of the student" + age + "Salary of the Studnet" + salary);
	}

	
	public static void main(String[] args) 
	{
		This_keyword a1 = new This_keyword();
		
		a1.student_detail(10,"Vaibhav",100.20);
		System.out.println(a1.name);
		System.out.println(a1.age);
		System.out.println(a1.salary);
	}
	
}
