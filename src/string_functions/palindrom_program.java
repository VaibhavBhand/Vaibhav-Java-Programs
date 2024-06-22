package string_functions;

public class palindrom_program 
{

	public static void main(String[] args) 
	{
		String input = "vaibhav";
		String reverse = "";
		
		for(int i=input.length()-1;i>=0;i-- ) 
		{
			char op = input.charAt(i);
			
			reverse = reverse+op;	
		}
		
		System.out.println(reverse);
		if(input==reverse)
		{
			System.out.println("the given string is palindrome");
		}
		else
			System.out.println("The given string is not a Palindrome");
	}

}
