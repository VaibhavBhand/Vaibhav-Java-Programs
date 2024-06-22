package array_programs;

public class find_number_in_array 
{
	static int present = 0;

	public static void main(String[] args) 
	{
		int num []= new int[4];
		num[1]=2;
		num[0] = 22;
		num[2] = 41;
		num [3] = 56;
		
		int givenno =41;
		
		for (int i=0; i<4; i++)
		{
			if(givenno ==num[i])
			{
				System.out.println("Number is present in a given array " + i);
				present++;
				
			}
			else
			{
					System.out.println("Number is not present in a given array " + i);
			}
			
		
		
		}
	
		System.out.println("total number of time specific number is present in a array is  " + present);
	

		
	}
}


