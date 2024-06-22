package Assignments;

public class Print_name_Vertically 
{
	static void reverse_verticle_name()
	{
	String input2 = "Vivek";
	
	for (int i =input2.length()-1; i>=0;i-- )
	{	
	char a2 = input2.charAt(i);
	System.out.print(a2);
	}
	}
	
	

	public static void main(String[] args) 
	{
		String input = "Vaibhav";
		
		for (int i =0; i<input.length();i++ )
		{	
		char a1 = input.charAt(i);
		System.out.println(a1);
		}
		
		System.out.println("===========");
		System.out.println("Reverse order");
		
		reverse_verticle_name();
		
		
		
	}

}
