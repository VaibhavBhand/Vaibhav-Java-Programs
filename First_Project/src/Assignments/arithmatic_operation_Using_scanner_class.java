package Assignments;

import java.util.Scanner;

public class arithmatic_operation_Using_scanner_class {
	
	static void add()
	{
		Scanner s1 =new Scanner(System.in);
		int a1 = s1.nextInt();
		int a2 = s1.nextInt();
		int sum = a1+a2;
		System.out.println("The Sum of given input " + sum );
		
	}
	
	static void sub()
	{
		Scanner s1 =new Scanner(System.in);
		int a1 = s1.nextInt();
		int a2 = s1.nextInt();
		int sub = a1-a2;
		System.out.println("The substraction of given input " + sub );
		
	}
	
	static void mul()
	{
		Scanner s1 =new Scanner(System.in);
		int a1 = s1.nextInt();
		int a2 = s1.nextInt();
		int mul = a1*a2;
		System.out.println("The Multiplication of given input " + mul );
		
	}
	
	static void div()
	{
		Scanner s1 =new Scanner(System.in);
		int a1 = s1.nextInt();
		int a2 = s1.nextInt();
		int mul = a1/a2;
		System.out.println("The divison of given input " + mul );
		
		
	}
	
	static void mod()
	{
		Scanner s1 =new Scanner(System.in);
		int a1 = s1.nextInt();
		int a2 = s1.nextInt();
		int mod = a1%a2;
		System.out.println("The Modulus of given input " + mod );
		
	}



	public static void main(String[] args) {
		add();
		sub();
		mul();
		div();
		mod();

}
	}
