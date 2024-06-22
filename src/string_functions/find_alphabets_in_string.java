package string_functions;

import java.util.Arrays;


public class find_alphabets_in_string 
{
	
	static int countofAlpha =0;

	public static void main(String[] args)
	{
		String a = "Vaibhav";
		char [] c1 = a.toCharArray(); //converts the string to character array
		System.out.println(Arrays.toString(c1));
		for(int i=0;i< c1.length; i++)
		{
			boolean answer = Character.isAlphabetic(c1[i]);
			System.out.println(answer);
			
			if (answer == true)
			{
				countofAlpha++;
			}
		}
		
		System.out.println("The Total count of Alphabets are =  "
				+ ""
				+ "" +countofAlpha);

	}

}
