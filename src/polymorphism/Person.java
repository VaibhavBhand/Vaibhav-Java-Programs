package polymorphism;

public class Person 
{

	public void showdetails()
	{
			System.out.println("Basic details of person : ");
	}
	
	public class emp extends Person
	{
		public void showdetails()
		{
			System.out.println("Showing the details of employee");
		}
	}
		
		
	
}


