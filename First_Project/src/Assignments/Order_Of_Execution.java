package Assignments;

public class Order_Of_Execution {

	public static void main(String[] args) 
	{
		
		System.out.println("Main Method");
		Order_Of_Execution a1 = new Order_Of_Execution();
	}
	
	static 
	{
		System.out.println("SIB");
	}
	
	{
		System.out.println("IIB");
	}
	
	Order_Of_Execution ()
	{
		System.out.println("Constructor");
	}

}
