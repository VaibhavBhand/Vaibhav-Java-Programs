package Assignments;

public class arithmetic_processes_with_nonstatic_methods 
{
	void add()
	{
		int a =100;
		int b= 200;
		int sum=a+b;
		System.out.println("Sum of given number is  " + sum);
	}
	 void sub()
	{
		int c =100;
		int d= 50;
		int sum=c-d;
		System.out.println("Substraction of given number is  " + sum);
	}
	
	 void mult()
	{
		int a =100;
		int b= 200;
		int sum=a*b;
		System.out.println("Multiplication of given number is  " + sum);
	}
	 void div()
	{
		int a =200;
		int b= 100;
		int sum=a/b;
		System.out.println("Division of given number is  " + sum);
	}
	
	 void mod()
	{
		int a =100;
		int b= 200;
		int sum=a%b;
		System.out.println("Modulus of given number is  " + sum);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		arithmetic_processes_with_nonstatic_methods a1 = new arithmetic_processes_with_nonstatic_methods();
		a1.add();
		a1.sub();
		a1.mult();
		a1.div();
		a1.mod();

	}
}
