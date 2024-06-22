package string_functions;

import java.util.Arrays;

public class special_character_count2 
{

	static int space_count =0;
	static int countofAlpha =0;
	static int count_number=0;
	static int count_specialchar=0;
	
	
	public static void main(String[] args) 
	{
		
		
		String name ="Hello world @@@!!!67788";
		char c1[] = name.toCharArray();
		System.out.println("lenghth of array = " +c1.length);
		int total = c1.length;
		int length =c1.length;
		System.out.println(Arrays.toString(c1));
		
		for(int i=0;i<c1.length;i++)
		{
			boolean ans = Character.isSpaceChar(c1[i]);
			
			if (ans==true)
			{
				space_count++;
			}
			
		}
		for(int i=0;i< c1.length; i++)
		{
			boolean answer = Character.isAlphabetic(c1[i]);
			//System.out.println(answer);
			
			if (answer == true)
			{
				countofAlpha++;
			}
		}
		
		for(int i=0; i<c1.length;i++)
		{
			boolean ans = Character.isDigit(c1[i]);
			if(ans==true)
			{
				count_number++;
			}
		}
		
		System.out.println("total number of spaces in string is = " + space_count);
		System.out.println("The Total count of Alphabets are =  "+countofAlpha);
		System.out.println("The Total count of Numbers are =  "+count_number);
		
		
		count_specialchar = total-(space_count+countofAlpha+count_number);
		System.out.println("Total Number of special characters = "+count_specialchar);

	}

}
