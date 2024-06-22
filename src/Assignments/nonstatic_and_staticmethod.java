package Assignments;

public class nonstatic_and_staticmethod 
{
	
		void add()
		{
		int a=100;
		int b=200;
		System.out.println(a+b);
		}
		
		static void div()
		{
			int a =16;
			int b =4;
			System.out.println(a/b);
		}
		void sub()
		{
		int a=100;
		int b=200;
		System.out.println(a-b);
		}
		public static void main(String[] args) 
		{
			nonstatic_and_staticmethod n1=new nonstatic_and_staticmethod();//syntax to create an Object
		n1.add();
		n1.sub();
		div();

		

		}


}
