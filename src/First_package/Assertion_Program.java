package First_package;

public class Assertion_Program 
{

	static void add(int a, int b)
	{
		assert a==10;
		int sum =a+b;
		System.out.println(sum);
	}
	
	
	
	public static void main(String[] args) 
	{
		add(100,200);
		/*String name ="";
		assert name.length()>0: "The Lenght is 0 or less";
		
		System.out.println(name.concat("Jatin"));
		*/

	}

}
