package string_functions;

import java.util.Arrays;

public class Anagram_Problem 
{

	public static void main(String[] args) 
	{
		String a = "beard";
		String b = "bread";
		
		if(a.length()!=b.length())
		{
			System.out.println("Given string are not anagram to each other");
		}
		else
		{
			char[]c1= a.toCharArray();
			char[]c2= b.toCharArray();
			
			System.out.println(Arrays.toString(c1));
			System.out.println(Arrays.toString(c2));
			
			
			Arrays.sort(c1);
			Arrays.sort(c2);
			
			System.out.println("After sorting ======");
			
			System.out.println(Arrays.toString(c1));
			System.out.println(Arrays.toString(c2));
			
			if (Arrays.equals(c1, c2)==true)
			{
				System.out.println("Given string are anagram to each other");
			}
			else
			{
				System.out.println("Given string are not anagram to each other");
			}

		}
		
		
	}

}
