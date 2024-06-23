package array_programs;

public class Assignment_88_2_arrays_avrage
{
	static double sum1 =0;
	static double sum2 =0;
	static double avg =0;
	
	
	public static void main(String[] args) 
	{
		int num[] = new int[3];
		num[0] = 15;
		num[1] = 15;
		num[2] = 15;
		
		double num1[] = new double[3];
		num1[0] = 15.00;
		num1[1] = 15.00;
		num1[2] = 15.00;
		
		for (int i=0;i<num.length;i++)
		{
			sum1= sum1+ num[i];
		}
		
		for (int i=0;i<num1.length;i++)
		{
			sum2= sum2+ num1[i];
		}
		
		avg = (sum1+sum2)/(num.length+num1.length);
		
		System.out.println(avg);

	}

}
