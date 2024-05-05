package Assignments;

public class abstract_method 
{
	
	static void method1()
	{
		System.out.println("concrete method");
	}
	
	static void method2()
	{
		System.out.println("concrete method");
	}
	
}
	
	abstract class abstract_class2 extends abstract_method
	{
		abstract void method3();
		abstract void method4();
		static void method5()
		{
			System.out.println("concrete method");
		}		
	}
	
 class concrete_class extends abstract_class2
	{
		static void method6()
		{
			System.out.println("concrete method");
		}
		
		static void method7()
		{
			System.out.println("concrete method");
		}
	
	public static void main(String[] args) 
	{
		concrete_class a1 = new concrete_class();
		a1.method3();
		a1.method4();
	}

	@Override
	void method3() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void method4() {
		// TODO Auto-generated method stub
		
	}
	}
	


