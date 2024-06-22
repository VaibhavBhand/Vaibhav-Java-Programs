package Assignments;

public class Globle_variables {
	
	static int a = 10;
	static int b =20;

	static void add ()
	{
	int sum = a+b;
	System.out.println("Sum of given number is " + sum);
	}
	
	static void minus()
	{
	int sum = a-b;
	System.out.println("Substraction of given number is " + sum);
	}
	
	static void multi()
	{
	int sum = a*b;
	System.out.println("Multiplication of given number is " + sum);
	}
	
	static void div()
	{
	int sum = a/b;
	System.out.println("Division of given number is " + sum);
	}
	
	static void mod()
	{
	int sum = a%b;
	System.out.println("Mod of given number is " + sum);
	}
	
	
	
	public static void main(String[] args) {
		
		add();
		minus();
		div();
		multi();
		mod();
		
		

	}

}
