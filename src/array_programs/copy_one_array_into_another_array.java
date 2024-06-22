package array_programs;

import java.util.Arrays;

public class copy_one_array_into_another_array 
{

	public static void main(String[] args) 
	{
		String n[] = new String [4];
		n[0]= "Vaibhav";
		n[1] = "Vivek";
		n[2] = "Priya";
		n[3] = "Shivani";
		
		String copy[] = new String [4];
		
		for(int i=0;i<4;i++)
		{
			copy[i] = n[i];
		}
		
		System.out.println(Arrays.toString(n));
		System.out.println(Arrays.toString(copy));
									

	}

}
