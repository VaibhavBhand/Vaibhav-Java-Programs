package string_functions;

import java.util.Arrays;

public class verify_if_string_contains_only_digits
{


		static int count_number;
		public static void main(String[] args) 
		{
			
			String a = "007Vaibhav";
			char c1[] = a.toCharArray();
			System.out.println(Arrays.toString(c1));
			
			boolean flag = true;
			
			for(int i=0; i<c1.length;i++)
				{
					if(!Character.isDigit(c1[i]))
					{
							flag = false;
						
						break;
					}
					
				}
			if(flag==true)
			{
				System.out.println("All are  digit in a given string");
			}
			else
			{
				System.out.println("All are not digit in a given string ");
			}
			
		}

	}