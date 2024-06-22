package First_package;

public class Thiscalling 
{
	Thiscalling()
	{
		this(100);
		System.out.println("1");
	}
	
	Thiscalling(int a)
	{
		this(19.19);
		System.out.println("2");
	}
	
	Thiscalling(double a)
	{
		System.out.println("3");
	}

	public static void main(String[] args) 
	{
		
		Thiscalling a1 = new Thiscalling();
		
	}

}
