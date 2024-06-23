package string_functions;

public class matches_function 
{

	public static void main(String[] args) 
	{
		String ip = "vaibhav";
		
		System.out.println(ip.matches("v(.*)"));// checks if the string starts with v
		
		System.out.println(ip.matches("(.*)v")); // checks if the string ends with v
		
		System.out.println(ip.matches(".......")); //checks if string contains 7 letters
		
		

	}

}
