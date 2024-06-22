package First_package;

class Parent_class1
{
	Parent_class1()
	{
		System.out.println("Grand Parent");
	}
}

class child_class extends Parent_class1
{
	child_class()
	{
		super();
		System.out.println("parent");
	}
}


public class SuperCallingStatement extends child_class 
{
	SuperCallingStatement()
	{
		super();
		System.out.println("child");
	}
	public static void main(String[] args) 
	{
		new SuperCallingStatement();
		
		
	}

}
