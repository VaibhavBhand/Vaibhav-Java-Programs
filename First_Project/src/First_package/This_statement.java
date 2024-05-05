package First_package;

public class This_statement {
	
	This_statement()
	{
		this(100);
		System.out.println("1");
	}
	
	This_statement(int a)
	{
		this("vaibhav");
		System.out.println("2");
	}
	

	This_statement(String a)
	{
		this('a',"Vaibhav");
		System.out.println("3");
	}
	
	This_statement(char a, String b)
	{
		System.out.println("4");
	}
	

	public static void main(String[] args) 
	{
		This_statement a1 = new This_statement();

	}

}
