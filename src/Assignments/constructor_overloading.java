package Assignments;

public class constructor_overloading
{
	constructor_overloading()
	{
		System.out.println("nonparameterized construstor");
		
	}
	
	constructor_overloading(int a)
	{
		System.out.println("Parameterized construstor");
	}
	
	constructor_overloading(int a, double b, float c, String d, short e, char f,boolean g)
	{
		System.out.println("construstor with 7 parameters");
	}


	public static void main(String[] args) 
	{
		new constructor_overloading();
		new constructor_overloading(100);
		new constructor_overloading(100, 10.10, 10.201010f,"vaibahv",(short)7,'v', true);
		
		
		
		
	}
}
