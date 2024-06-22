package array_programs;

import java.util.Arrays;
import java.util.Scanner;

public class BooleanArray_Verify_IfThey_areEqual {

	public static void main(String[] args) 
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println("Start of first array");
		boolean a[]=new boolean[2];
		for (int i=0;i<2;i++)
		{
			System.out.println("Enter the Boolean array"+ " "+ i);
			a [i] = s1.nextBoolean();
			
		}
		
		System.out.println("Start of 2nd Array");
		boolean a2[] = new boolean[2];
		for(int i=0;i<2;i++)
		{
			System.out.println("Enter the Boolean Array"+ " " + i);
			a [i] = s1.nextBoolean();
			
		}
		
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(a2));
		
		if ((Arrays.equals(a, a2))==true)
		{
			System.out.println("Arrays are equal");
		}
		else
		{
			System.out.println("Arrays are different");
		}
		
		s1.close();
			
		


	}

}
