package First_package;

import java.util.Scanner;

class college
{
	college(String college_name)
	{
		System.out.println("College");
	}
}

class School extends college
{
	School()
	{
		super("GPM");
		
		
		
		System.out.println("school");
	}
}
public class SuperCalling_withScannerclass 
{
public static void main(String[] args) 
{
	School s1 = new School();
	
	//Scanner s1 =new Scanner (System.in);
	
}
}
