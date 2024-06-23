package array_programs;

public class Avrage_of_values_in_Array 
{
	static double avg =0;
	static int sum =0;
	
	
	public static void main(String[] args) 
	{
		int num[] = new int[3];
		num[0] = 15;
		num[1] = 30;
		num[2] = 90;
		
		for (int i =0; i<num.length;i++)
		{
			sum = sum + num[i];
			
			avg =sum/ num.length;
			
		}
		
		System.out.println(avg);

	}

}
