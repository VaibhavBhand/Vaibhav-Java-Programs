package string_functions;

import java.util.Arrays;

public class count_numericValues_in_String 
{
	static int count_number;
	public static void main(String[] args) 
	{
		
		String a = "Bond007";
		char c1[] = a.toCharArray();
		System.out.println(Arrays.toString(c1));
		
		for(int i=0; i<c1.length;i++)
			{
				boolean ans = Character.isDigit(c1[i]);
				if(ans==true)
				{
					count_number++;
				}
			}
		System.out.println("The total digits present in array=  "+ count_number);
	}

}
