package Assignments;

public class forloop {

	public static void main(String[] args) {
		
		for (int i=100; i>=0; i--)
		{
			System.out.println(i);
		}
		
		for (int i=-50; i<=-30; i++)
		{
			System.out.println(i);
		}
		
		for (int i=-10; i<=10; i++)
		{
			System.out.println(i);
		}
		
		for(int i=101; i<=200;i++)
		{
			if(i%2==0)
				System.out.println("The even number is  " + i);
		
		else
		{
			System.out.println("The odd number is  " + i);
			
		}
			
		}


	}

}
