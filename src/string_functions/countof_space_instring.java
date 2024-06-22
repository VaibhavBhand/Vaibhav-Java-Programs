package string_functions;

import java.util.Arrays;

public class countof_space_instring 
{
	static int space_count =0;
	
	public static void main(String[] args)
	{
		String name ="Hello world @@@!!!67788";
		char c1[] = name.toCharArray();
		System.out.println(Arrays.toString(c1));
		
		for(int i=0;i<c1.length;i++)
		{
			boolean ans = Character.isSpaceChar(c1[i]);
			
			if (ans==true)
			{
				space_count++;
			}
			
		}
		System.out.println("total number of spaces in string is = " + space_count);
	}

}
