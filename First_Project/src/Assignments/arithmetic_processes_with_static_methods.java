package Assignments;

public class arithmetic_processes_with_static_methods 
{
	static void add()
	{
		int a =100;
		int b= 200;
		int sum=a+b;
		System.out.println("Sum of given number is  " + sum);
	}
	static void sub()
	{
		int c =100;
		int d= 50;
		int sum=c-d;
		System.out.println("Substraction of given number is  " + sum);
	}
	
	static void mult()
	{
		int a =100;
		int b= 200;
		int sum=a*b;
		System.out.println("Multiplication of given number is  " + sum);
	}
	static void div()
	{
		int a =200;
		int b= 100;
		int sum=a/b;
		System.out.println("Division of given number is  " + sum);
	}
	
	static void mod()
	{
		int a =100;
		int b= 200;
		int sum=a%b;
		System.out.println("Modulus of given number is  " + sum);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		add();
		sub();
		mult();
		div();
		mod();
		
	}

}


