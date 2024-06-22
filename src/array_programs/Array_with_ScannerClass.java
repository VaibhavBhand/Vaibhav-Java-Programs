package array_programs;

import java.util.Arrays;
import java.util.Scanner;

public class Array_with_ScannerClass 
{

	public static void main(String[] args) 
	{
		

	
			Scanner s1 = new Scanner(System.in);
			int rn[] = new int [3];
			
			for (int i =0; i<3; i++) 
			{
				System.out.println("Enter the Array" +" " + i);
				
				rn [i]= s1.nextInt(); 
				//System.out.println(rn [i]); ------one of the approch
					
				
			}
			System.out.println(Arrays.toString(rn)); //tostring is static method and Arrays is class
			
		}
	}


