package array_programs;

import java.util.Arrays;
import java.util.Scanner;

public class Verfiy_if_Arrays_areEqual_toEachOther 
{

	public static void main(String[] args) 
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println("Start of First Array :->");
		int RN[]= new int[2];
		for(int i=0;i<2;i++)
		{
			System.out.println("Enter the Array" + " "+ i);
			RN [i]= s1.nextInt();
		}
		
		
		System.out.println("Start of second Array :->");
		int RN2[]= new int[2];
		for(int i=0;i<2;i++)
		{
			System.out.println("Enter the Array" + " "+ i);
			RN2 [i]= s1.nextInt();
		}
		
		
		
		System.out.println(Arrays.toString(RN));
		System.out.println(Arrays.toString(RN2));
		
		if((Arrays.equals(RN, RN2)==true))
				{
					System.out.println("Two arrays are equal");
				}
		else
		{
			System.out.println("Two arrays are not equal");
		}
		

	}

}
