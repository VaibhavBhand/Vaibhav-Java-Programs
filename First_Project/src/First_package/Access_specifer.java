package First_package;

public class Access_specifer 
{
	public void add()
	{
		System.out.println("1");
	}
	
	private static void min()
	{
		System.out.println("2");
	}
	
	protected void div()
	{
		System.out.println("3");
	}
	
	static void multi()
	{
		System.out.println("4");
	}
	
	
	public static void main(String[] args) 
	{
		Access_specifer a1 = new Access_specifer();
		a1.add();
		a1.div();
		a1.multi();
		a1.min();
				
	}

}
